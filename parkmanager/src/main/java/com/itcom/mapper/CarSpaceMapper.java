package main.java.com.itcom.mapper;

import com.itcom.bean.CarSpace;

import java.util.List;

public interface CarSpaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_space
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_space
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int insert(CarSpace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_space
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int insertSelective(CarSpace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_space
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    CarSpace selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_space
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int updateByPrimaryKeySelective(CarSpace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_space
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int updateByPrimaryKey(CarSpace record);

    List<CarSpace> queryStatus(Integer id);

    int selectOneStatus(CarSpace carspace);

    int updateCarStatusByPho(CarSpace carspace);

    int updateCarStatusByMan(CarSpace carSpace);

    int updateStatusByParkingIdAndspaceId(CarSpace carSpace);

}