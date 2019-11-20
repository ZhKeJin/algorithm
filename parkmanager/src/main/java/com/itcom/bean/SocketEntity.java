package main.java.com.itcom.bean;

/**
 * @author Zhangkj
 * @date 2019-07-19-11:11
 */
public class SocketEntity {

    private String type;
    private String carspaceId;//停车场车位id
    private String parkingId;//停车场id


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarspaceId() {
        return carspaceId;
    }

    public void setCarspaceId(String carspaceId) {
        this.carspaceId = carspaceId;
    }

    public String getParkingId() {
        return parkingId;
    }

    public void setParkingId(String parkingId) {
        this.parkingId = parkingId;
    }
}
