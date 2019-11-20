package main.java.com.itcom.service;

import com.itcom.bean.CarSpace;
import com.itcom.bean.Manager;
import com.itcom.bean.User;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-23-21:00
 */
public interface IManagerService {

    /**
     * 查询管理员是否有登录
     * @param manager
     * @return
     */
    Manager queryMan(Manager manager);


    List<User> queryUsers();

    int queryNum();

    int updateStatus(CarSpace carSpace);
}
