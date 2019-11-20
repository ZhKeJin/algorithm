package main.java.com.itcom.service.Impl;

import com.itcom.bean.CarSpace;
import com.itcom.mapper.CarSpaceMapper;
import com.itcom.mapper.ParkingLotMapper;
import com.itcom.service.IParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-23-20:58
 */
@Service
public class ParkServiceImpl implements IParkService {

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    @Autowired
    private CarSpaceMapper carSpaceMapper;


    @Override
    public List queryPark() {
        return parkingLotMapper.selectPark();
    }

    @Override
    public List<CarSpace> queryStatus(Integer id) {
        return carSpaceMapper.queryStatus(id);
    }


}
