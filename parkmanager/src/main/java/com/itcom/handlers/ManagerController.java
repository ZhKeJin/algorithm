package main.java.com.itcom.handlers;

import com.itcom.bean.Assess;
import com.itcom.bean.CarSpace;
import com.itcom.bean.Manager;
import com.itcom.bean.User;
import com.itcom.service.IAssessService;
import com.itcom.service.IManagerService;
import com.itcom.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-18-16:16
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private IManagerService iManagerService;

    @Autowired
    private IAssessService iAssessService;

    @RequestMapping("/queryAssess.do")
    @ResponseBody
    public List<Assess> queryAssess(){

        List<Assess> listAssess = iAssessService.queryAssess();

       return listAssess;

    }



    /**
     * 管理员修改状态
     * @param response
     * @param carSpace
     * @return
     */
    @RequestMapping("/updateStatus.do")
    public @ResponseBody String updateStatus(HttpServletResponse response,CarSpace carSpace){

        response.setHeader("access-Control-Allow-Origin","*");

        System.out.println("连上了。。。。。。");

        int updatestatus = iManagerService.updateStatus(carSpace);


        if(updatestatus > 0){
            return "{\"msg\":\"success\"}";
        }
        return "{\"msg\":\"error\"}";
    }



    /*
      管理员登陆
     */
    @ResponseBody
    @RequestMapping("/manLogin.do")
   // public String manLogin(String name, String password, HttpServletRequest request, HttpServletResponse response){
    public String manLogin(Manager manager, HttpServletRequest request, HttpServletResponse response){

        response.setHeader("access-Control-Allow-Origin","*");


      //  Manager manager = new Manager(name, password);

        System.out.println(manager);

        manager = iManagerService.queryMan(manager);

        int num = iManagerService.queryNum();


        if(manager == null){
            return "{\"flag\":2}";
        }else{
            return "{\"flag\":1,\"num\":"+num+"}";
        }
    }




    /*
    查询出登陆的用户
     */
    @ResponseBody
    @RequestMapping("/queryUser.do")
    public Object queryUser(HttpServletResponse response){

        response.setHeader("access-Control-Allow-Origin","*");

        List<User> list = iManagerService.queryUsers();

        return list;
    }


    @Test
    public void test(){


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("resources/spring-db.xml",
                                              "resources/spring-mybatis.xml",
                        "resources/spring-service.xml","resources/spring-tx.xml");


        String[] s = context.getBeanDefinitionNames();
        for(String string :s ){
            System.out.println(string);
        }
    }

}
