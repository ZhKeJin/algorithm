package main.java.com.itcom.handlers;

import com.itcom.bean.CarSpace;
import com.itcom.bean.ParkingLot;
import com.itcom.bean.User;
import com.itcom.service.IParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-29-20:31
 */

@Controller
public class ParkingController {


    @Autowired
    private IParkService iParkService;



    @RequestMapping("/test.do")
    public void test(String content){

        System.out.println(".....");
        System.out.println(content);

    }



    @ResponseBody
    @RequestMapping("/queryPark.do")
    public List queryPark(HttpSession session, HttpServletResponse response, HttpServletRequest request){
        response.setHeader("access-Control-Allow-Origin","*");
        System.out.println("连上了。。。");

        Cookie cookie1 = new Cookie("asd","asdf");


        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie cookie : cookies) {

                System.out.println(cookie.getValue() + ">>>>>>");



            }
        }



        System.out.println(request.getRequestedSessionId()+"Jsessionid");

        User user = (User) session.getAttribute("user");



        List<ParkingLot> list = iParkService.queryPark();


        //session.setAttribute("parking_id",park.getParking_id());

        return list;


    }


    @ResponseBody
    @RequestMapping("/queryStatus.do")
    public Object queryStatus(Integer parkingId, HttpServletResponse response){

        System.out.println(parkingId);

        response.setHeader("access-Control-Allow-Origin","*");

        System.out.println("连上了。。。");
        List<CarSpace> list = iParkService.queryStatus(parkingId);

        return  list;
        //return "{\"list\":"+list+"}";
    }




}
