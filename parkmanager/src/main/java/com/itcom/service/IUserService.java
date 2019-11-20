package main.java.com.itcom.service;

        import com.itcom.bean.CarSpace;
        import com.itcom.bean.CheckMoney;
        import com.itcom.bean.User;

        import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-23-21:00
 */
public interface IUserService {
    int addUser(User user);

    User queryUser(User user);

    List<User> queryUsers();


    int addName(String name, String phonenumber);

    User querybypho(String phonenumber);

    int  updateInfo(User user);

    // User queryInfo(String phonenumber);

    int updateStatus(CarSpace carspace);

    int queryOneStatus(CarSpace carspace);

    /**
     * 查询用户预约的情况
     * @param checkMoney
     * @return
     */
    List<CheckMoney> queryOrderStatus(CheckMoney checkMoney);

    /**
     * 添加用户订单表
     * @param checkMoney
     * @return
     */
    int addUserCheck(CheckMoney checkMoney);

    int updateCheckStatus(CheckMoney checkMoney);

    int updateStatusByParkingIdAndspaceId(CarSpace carSpace);

    /**
     * 查询用户信息
     * @param
     * @return
     */
    User queryInfo(String phoneNumber);
}
