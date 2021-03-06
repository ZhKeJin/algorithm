package main.java.com.itcom.mapper;


import main.java.com.itcom.bean.Assess;

import java.util.List;

public interface AssessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int deleteByPrimaryKey(Integer assessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int insert(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int insertSelective(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    Assess selectByPrimaryKey(Integer assessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int updateByPrimaryKeySelective(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    int updateByPrimaryKey(Assess record);

    int insertAssess(Assess assess);

    List<Assess> selectAssess();
}