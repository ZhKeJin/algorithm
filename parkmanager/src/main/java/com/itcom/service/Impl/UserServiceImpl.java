package main.java.com.itcom.service.Impl;

import com.itcom.bean.CarSpace;
import com.itcom.bean.CheckMoney;
import com.itcom.bean.User;
import com.itcom.mapper.CarSpaceMapper;
import com.itcom.mapper.CheckMoneyMapper;
import com.itcom.mapper.UserMapper;
import com.itcom.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-23-20:58
 */
@Service
public class UserServiceImpl implements IUserService {

//    public void setuserMapper(userMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Autowired
    private UserMapper userMapper ;

    @Autowired
    private CarSpaceMapper carSpaceMapper;

    @Autowired
    private CheckMoneyMapper checkMoneyMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> queryUsers() {
        return userMapper.selectUsers();
    }



    /*添加用户*/
    @Override
    public int addUser(User user) {
        System.out.println(user.toString());
        return userMapper.insertSelective(user);
    }




    /*登陆时进行查询验证*/
    @Override
    public User queryUser(User user) {
        return userMapper.selectUser(user);
    }



    /*添加姓名*/
    @Override
    public int addName(String name, String phonenumber) {
        //return userMapper.insertName(name,phonenumber);
        return 0;
    }

    @Override
    public User querybypho(String phonenumber) {
        return userMapper.selectbypho(phonenumber);
    }

    @Override
    public int updateInfo(User user) {
       return  userMapper.updateByPhoneNumber(user);

    }

   /* @Override
    public User queryInfo(String phonenumber) {
        return userMapper.selectInfo(phonenumber);
    }*/

    @Override
    public int updateStatus(CarSpace carspace) {
        return carSpaceMapper.updateCarStatusByPho(carspace);
    }

    @Override
    public int queryOneStatus(CarSpace carspace) {
        return carSpaceMapper.selectOneStatus(carspace);
    }

    @Override
    public List<CheckMoney> queryOrderStatus(CheckMoney checkMoney) {

        System.out.println("UserServiceImpl....."+checkMoney.getPhoneNumber());
        return checkMoneyMapper.selectOrderStatus(checkMoney);
    }

    @Override
    public int addUserCheck(CheckMoney checkMoney) {

        return checkMoneyMapper.insertSelective(checkMoney);
    }

    @Override
    public int updateCheckStatus(CheckMoney checkMoney) {
        return checkMoneyMapper.updateCheckStatus(checkMoney);
    }

    @Override
    public int updateStatusByParkingIdAndspaceId(CarSpace carSpace) {
        return carSpaceMapper.updateStatusByParkingIdAndspaceId(carSpace);
    }

    @Override
    public User queryInfo(String phoneNumber) {
        return userMapper.selectbypho(phoneNumber);
    }
}
