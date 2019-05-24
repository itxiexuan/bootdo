package com.bootdo.device.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 *
 * @author xiexuan
 * @email 2621141526@qq.com
 * @date 2019-05-23 14:39:46
 */
public class DeviceRegisterDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String deviceType;
	//
	private String status;
	//
	private Integer deviceId;
	//
	private Date createDate;
	//
	private String createDateStr;
	//
	private String createBy;
	//
	private Date handshakeDate;
	//
    private String handshakeDateStr;
    //
    private String belong;
    //
    private String ip;

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }

    public String getHandshakeDateStr() {
        return handshakeDateStr;
    }

    public void setHandshakeDateStr(String handshakeDateStr) {
        this.handshakeDateStr = handshakeDateStr;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

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
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * 获取：
	 */
	public Integer getDeviceId() {
		return deviceId;
	}
	/**
	 * 设置：
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 设置：
	 */
	public void setHandshakeDate(Date handshakeDate) {
		this.handshakeDate = handshakeDate;
	}
	/**
	 * 获取：
	 */
	public Date getHandshakeDate() {
		return handshakeDate;
	}

	/**
	 * 设置：
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：
	 */
	public String getIp() {
		return ip;
	}
}
