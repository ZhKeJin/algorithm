package main.java.com.itcom.bean;

import java.util.Date;

public class CheckMoney {

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    private ParkingLot parkingLot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.check_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private Integer checkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.start_time
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private String startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.over_time
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private String overTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.money
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private Double money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.phone_number
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.parking_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private String parkingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.space_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private String spaceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_money.check_status
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    private String checkStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.check_id
     *
     * @return the value of check_money.check_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public Integer getCheckId() {
        return checkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.check_id
     *
     * @param checkId the value for check_money.check_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.start_time
     *
     * @return the value of check_money.start_time
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.start_time
     *
     * @param startTime the value for check_money.start_time
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.over_time
     *
     * @return the value of check_money.over_time
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public String getOverTime() {
        return overTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.over_time
     *
     * @param overTime the value for check_money.over_time
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.money
     *
     * @return the value of check_money.money
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public Double getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.money
     *
     * @param money the value for check_money.money
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.phone_number
     *
     * @return the value of check_money.phone_number
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.phone_number
     *
     * @param phoneNumber the value for check_money.phone_number
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.parking_id
     *
     * @return the value of check_money.parking_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public String getParkingId() {
        return parkingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.parking_id
     *
     * @param parkingId the value for check_money.parking_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setParkingId(String parkingId) {
        this.parkingId = parkingId == null ? null : parkingId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.space_id
     *
     * @return the value of check_money.space_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public String getSpaceId() {
        return spaceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.space_id
     *
     * @param spaceId the value for check_money.space_id
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId == null ? null : spaceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_money.check_status
     *
     * @return the value of check_money.check_status
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_money.check_status
     *
     * @param checkStatus the value for check_money.check_status
     *
     * @mbg.generated Mon Jun 03 16:27:46 CST 2019
     */
    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }
}