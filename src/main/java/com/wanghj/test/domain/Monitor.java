package com.wanghj.test.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 设备连接情况实体类
 *
 * @author wanghj
 * @create 2018-01-05 16:59
 **/
@Document(collection="Monitor")
public class Monitor {

    @Id
    private String id;

    @Field("IMEI")
    private String imei;

    @Field("STATUS")
    private String status;

    @Field("DATE")
    private String date;

    @Field("IPADDRESS")
    private String ipaddress;

    public Monitor(String id, String imei, String status, String date, String ipaddress) {
        this.id = id;
        this.imei = imei;
        this.status = status;
        this.date = date;
        this.ipaddress = ipaddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id='" + id + '\'' +
                ", imei='" + imei + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                '}';
    }
}
