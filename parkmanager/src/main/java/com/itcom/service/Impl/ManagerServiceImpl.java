package main.java.com.itcom.service.Impl;

import com.itcom.bean.CarSpace;
import com.itcom.bean.Manager;
import com.itcom.bean.User;
import com.itcom.mapper.CarSpaceMapper;
import com.itcom.mapper.ManagerMapper;
import com.itcom.mapper.ParkingLotMapper;
import com.itcom.mapper.UserMapper;
import com.itcom.service.IManagerService;
import com.itcom.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-23-20:58
 */
@Service
public class ManagerServiceImpl implements IManagerService{


    @Autowired
    private ManagerMapper managerMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    @Autowired
    private CarSpaceMapper carSpaceMapper;

    @Override
    public Manager queryMan(Manager manager) {

        return managerMapper.selectMan(manager);
    }

    @Override
    public List<User> queryUsers() {
        return  userMapper.selectUsers();
    }

    @Override
    public int queryNum() {
        return parkingLotMapper.queryNum();
    }

    @Override
    public int updateStatus(CarSpace carSpace) {

        return carSpaceMapper.updateCarStatusByMan(carSpace);
    }
}
