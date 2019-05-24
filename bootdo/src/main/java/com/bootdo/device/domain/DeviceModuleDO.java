package com.bootdo.device.domain;

import java.io.Serializable;

public class DeviceModuleDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //
    private String name;
    //
    private String chName;
    //
    private String serverName;

    /**
     * 设置：
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 获取：
     */
    public Integer getId() {
        return id;
    }
    /**
     * 设置：
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取：
     */
    public String getName() {
        return name;
    }
    /**
     * 设置：
     */
    public void setChName(String chName) {
        this.chName = chName;
    }
    /**
     * 获取：
     */
    public String getChName() {
        return chName;
    }
    /**
     * 设置：
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
    /**
     * 获取：
     */
    public String getServerName() {
        return serverName;
    }
}
