package main.java.com.itcom.service;

import com.itcom.bean.CarSpace;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-04-23-21:00
 */
public interface IParkService {


    List queryPark();

    List<CarSpace> queryStatus(Integer id);
}
