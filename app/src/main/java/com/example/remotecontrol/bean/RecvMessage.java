package com.example.remotecontrol.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiaojiange on 2017/4/17.
 */
public class RecvMessage {
    //返回的状态
    private int status;
    //描述
    private String describe;

    //设备名称
    private String deviceName;

    //设备接口
    public String params;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "RecvMessage{" +
                "status=" + status +
                ", describe='" + describe + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
