package main.java.com.itcom.handlers;

import com.itcom.bean.Assess;
import com.itcom.bean.CarSpace;
import com.itcom.bean.CheckMoney;
import com.itcom.bean.User;
import com.itcom.service.IAssessService;
import com.itcom.service.IUserService;
import com.itcom.util.SMSUtil;
import main.java.com.itcom.bean.User;
import main.java.com.itcom.service.IAssessService;
import main.java.com.itcom.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.ext.IBM918;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Source;
import java.io.IOException;
import java.nio.file.StandardWatchEventKinds;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-18-16:16
 */
@Controller
@RequestMapping("/user")
public class UserController {



    @Autowired
    private IUserService iUserService;


    @Autowired
    private IAssessService iAssessService;


    /**
     * 用户注册
     * @param user
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value ="/insert.do",method = RequestMethod.POST,produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
  //  public String insert(String phonenumber, String password) throws IOException {
    public String insert(User user) throws IOException {


        User user_1 = iUserService.querybypho(user.getPhoneNumber());

        if(user_1 != null){
           // response.getWriter().print( "{'mesg':'该号码已被注册'}");
            return "{'mesg':'该号码已被注册'}";
        }


      //  User user = new User(phonenumber, password);

        System.out.println(user);

        iUserService.addUser(user);

        return "1";
       // return "/login.jsp";


    }

    /**
     *  用户登陆
     *
     */
    @ResponseBody
    @RequestMapping("/userLogin.do")
  //  public String manLogin(String phonenumber, String password, HttpServletResponse response, HttpServletRequest request){
    public String manLogin(User user, HttpServletRequest request){

        System.out.println(request.getSession());

        System.out.println("连上了。。。。");

        Cookie[] cookies = request.getCookies();

       /* if(cookies != null) {
            for (Cookie cookie : cookies) {

                System.out.println(cookie.getValue() + ">>>>>>");
                if ("phonenumber".equals(cookie.getName())) {
                    System.out.println(cookie.getValue() + "....");
                }

            }
        }
*/

        System.out.println(request.getRequestedSessionId()+"Jsessionid");

        //  User user = new User(phonenumber, password);

        System.out.println("session....."+request.getSession().getAttribute("user"));

        System.out.println(user);

        user = iUserService.queryUser(user);

        if(user != null) {

            String phoneNumber = user.getPhoneNumber();

            request.getSession().setAttribute("phoneNumber", phoneNumber);
            request.getSession().setAttribute("user", user);

//            Cookie cookie = new Cookie("phonenumber",phonenumber);
//            cookie.setMaxAge(60*60*24);
//            response.addCookie(cookie);

      }
        if(user == null){
            return "{'flag':'3'}";
        }else{
            return "{'flag':'1'}";
        }
    }


    /**
     * 设置具体信息
     * @param
     */
    @ResponseBody
    @RequestMapping(value = "/setInfo.do")
    //public Object setInfo(String name,String carnumber,String location){
    public Object setInfo(User user,HttpServletRequest request){

        //user.setPhoneNumber("111111");
        System.out.println("setInfo........");
        user.toString();

        System.out.println("setInfo........");


        System.out.println(request.getRequestedSessionId()+"Jsessionid");

        String phoneNumber = (String) request.getSession().getAttribute("phoneNumber");

        System.out.println(phoneNumber+".......");

        user.setPhoneNumber(phoneNumber);
        int update = iUserService.updateInfo(user);

        if(update > 0 )
            return "OK";
        else
            return "NO";
    }



     /** 查询信息根据电话号码查询出用户的具体信息
     * @return
     */

    @ResponseBody
    @RequestMapping("/queryInfo.do")
    public User queryInfo(HttpServletRequest request){

        System.out.println("queryInfo........");


        System.out.println(request.getRequestedSessionId()+"Jsessionid");
        //String phoneNumber = "111111";

        String phoneNumber = (String) request.getSession().getAttribute("phoneNumber");

        System.out.println(phoneNumber+".......");

        User user = iUserService.queryInfo(phoneNumber);

        return user;
    }


    /**
     * 用户预订
     * car_space status 0:空闲  1：已预约  2：已使用
     * @param
     * @param
     */
    @ResponseBody
    @RequestMapping("/book.do")
   // public Object book(String parking_id,String space_id){
    public String  book(CarSpace carspace, HttpServletRequest request){

          System.out.println("book........");


          System.out.println(request.getRequestedSessionId()+"Jsessionid");

          String phoneNumber = (String)request.getSession().getAttribute("phoneNumber");


          //String phonenumber = "111111";

          System.out.println(phoneNumber+"....");
          carspace.setPhoneNumber(phoneNumber);
          int status = iUserService.queryOneStatus(carspace);
          System.out.println("status="+status);

          if(status != 0){
              return "{'msg':'预约失败'}";
          }
          carspace.setStatus(1);
          int i = iUserService.updateStatus(carspace);
          System.out.println(i);

          if(i > 0){

              //将信息保存在checkmoney中
              CheckMoney checkMoney = new CheckMoney();
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
              checkMoney.setStartTime(sdf.format(new Date()));
              checkMoney.setParkingId(carspace.getParkingId());
              checkMoney.setSpaceId(carspace.getSpaceId().toString());
              checkMoney.setPhoneNumber(phoneNumber);
              checkMoney.setCheckStatus("1");

              int result =  iUserService.addUserCheck(checkMoney);

              //预约成功
              try {
                  String result3=com.itcom.util.Translate.Send("a");// 给总控端发送请求
                  System.out.println("结果"+result3);
                  System.out.println(".."+result3.equals("success"));
                  // ResponseUtil.write(response,result);
              } catch (Exception e) {
                  e.printStackTrace();
              }

              if (0 != result) {
                  return "{'msg':'预约成功'}";
              }
          }
          return "{'msg':'预约失败'}";
    }


    /**
     * 用户评价
     * 参数：content parkingId mark spaceId
     * @return
     */
    @RequestMapping("/assess.do")
    @ResponseBody
    public String assessUser(HttpServletRequest request,String content,String mark,String parkingId,String spaceId){

        System.out.println(request.getRequestedSessionId()+"assess.do");

        User sessionUser = (User) request.getSession().getAttribute("user");

        System.out.println(sessionUser.getPhoneNumber());

        Assess assess = new Assess();
        assess.setParkingId(parkingId);
        assess.setSpaceId(spaceId);
        assess.setPhoneNumber(sessionUser.getPhoneNumber());
        //assess.setPhoneNumber("111111");
        assess.setContent(content);
        assess.setMark(mark);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        assess.setTime(sdf.format(new Date()));

        int addcount = iAssessService.addAssess(assess);

        if(addcount < 0){
            return "NO";
        }


        return "OK";
    }


    /**
     * 代付款1 待使用支付成功2 待评价3 取消预约5 退款取消订单4
     * 参数 checkStatus
     * @return
     */
    @RequestMapping("/updateCheckStatus.do")
    @ResponseBody
    public String updateCheckStatus(String checkStatus,String parkingId,String spaceId,HttpServletRequest request){

        System.out.println(checkStatus+".....................");

        System.out.println(request.getRequestedSessionId()+"updateCheckStatus.do");

        User sessionUser = (User) request.getSession().getAttribute("user");

        //System.out.println(sessionUser.getPhoneNumber()+"..........");

        CheckMoney checkMoney = new CheckMoney();
        checkMoney.setPhoneNumber(sessionUser.getPhoneNumber());
        //checkMoney.setPhoneNumber("111111");
        checkMoney.setSpaceId(spaceId);
        checkMoney.setParkingId(parkingId);
        checkMoney.setCheckStatus(checkStatus);

        int checkCount = iUserService.updateCheckStatus(checkMoney);

        System.out.println(checkCount+"checkCount.........");

        if(checkCount > 0 && checkStatus.equals("4") || checkStatus.equals("5")){
            System.out.println(parkingId+"parkingId..........");
            System.out.println(spaceId+"spaceId.........");

            CarSpace carSpace = new CarSpace();
            carSpace.setSpaceId(Integer.parseInt(spaceId));
            carSpace.setParkingId(parkingId);
            carSpace.setStatus(0);

            int count = iUserService.updateStatusByParkingIdAndspaceId(carSpace);

            //
            try {
                String result3=com.itcom.util.Translate.Send("e");// 给总控端发送请求
                System.out.println("结果"+result3);
                System.out.println(".."+result3.equals("success"));
                // ResponseUtil.write(response,result);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(count < 0 ){
                return "NO";
            }

        }

        if(checkCount>0 && checkStatus.equals("2")){

            System.out.println(parkingId+"parkingId..........");
            System.out.println(spaceId+"spaceId.........");


            CarSpace carSpace = new CarSpace();
            carSpace.setSpaceId(Integer.parseInt(spaceId));
            carSpace.setParkingId(parkingId);
            carSpace.setStatus(2);

            int count = iUserService.updateStatusByParkingIdAndspaceId(carSpace);

            if(count < 0 ){
                return "NO";
            }
            //付款成功
            try {
                String result3=com.itcom.util.Translate.Send("b");// 给总控端发送请求
                System.out.println("结果"+result3);
                System.out.println(".."+result3.equals("success"));
               // ResponseUtil.write(response,result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(checkCount < 0){
            return "NO";
        }

        return "OK";
    }


    /**
     *
     *查询用户的预约情况
     * @param checkMoney
     * @param  1:待付款  2：待使用 3：待评价 4：退款
     *
     * @return
     */

    @RequestMapping("/queryOrderStatus.do")
    @ResponseBody
    public List<CheckMoney> queryOrderStatus(CheckMoney checkMoney, HttpServletRequest request){

        System.out.println(request.getRequestedSessionId()+"JsessionidqueryOrderStatus");

        //checkMoney.setPhoneNumber("111111");
        //User user = (User) request.getSession().getAttribute("user");

        //System.out.println(user.getPhoneNumber()+"........");
        String phoneNumber = (String) request.getSession().getAttribute("phoneNumber");

        checkMoney.setPhoneNumber(phoneNumber);


        List<CheckMoney> checkList = iUserService.queryOrderStatus(checkMoney);

        return checkList;

    }

    /**
     * 获取验证码
     * @param phonenumber
     * @param session
     */
    public void captcha(String phonenumber, HttpSession session){

        String code = SMSUtil.codeing();
        String result = SMSUtil.sendSMS(phonenumber, code);

        session.setAttribute("code",code);

        System.out.println("发送成功"+code);
    }


    /**
     * web测试
     * @param user
     * @param captcha
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/web/userLogin.do")
    public String maLogin(User user,String captcha, HttpSession session){

        if(captcha != session.getAttribute("code")){
            return "{'meg':'验证码错误！！'}";
        }


        //User user = new User(phonenumber, password);

        System.out.println(user);

        user = iUserService.queryUser(user);

        if(user != null) {
            session.setAttribute("phonenumber", user.getPhoneNumber());

            System.out.println(session.getId());
        }
        if(user == null){
            return "{'flag':'3'}";
        }else{
            return "{'flag':'1'}";
        }
    }



    @ResponseBody
    @RequestMapping("/send")
    public String send(String phone){

        String code = SMSUtil.codeing();
        String result = SMSUtil.sendSMS("15991630732", code);
        if(result.equals("success")){
            return "发送成功！";
        }else{
            return "发送失败！";
        }
    }

//    @Test()
//    public void setName(){
//
//        String phonenumber="111111";
//        String name="wwwwwwwww";
//
//        System.out.println(iUserService);
//
//
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("resources/spring-db.xml",
//                        "resources/spring-mybatis.xml",
//                        "resources/spring-service.xml","resources/spring-tx.xml");
//
//        String[] s = context.getBeanDefinitionNames();
//        for(String string :s ){
//            System.out.println(string);
//        }
//        UserServiceImpl service = (UserServiceImpl) context.getBean("userServiceImpl");
//
//        System.out.println(service);
//        service.addName(name,phonenumber);
//
//
//    }


//    @Test
//    public void test_1(){
//        setName("111111","zhangsan");
//
//    }




    @Test
    public void test(){


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-db.xml",
                                              "spring-mybatis.xml",
                        "spring-service.xml","spring-tx.xml");


        String[] s = context.getBeanDefinitionNames();
        for(String string :s ){
            System.out.println(string);
        }



    }



}
