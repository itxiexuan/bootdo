package com.bootdo.device.service.impl;

import com.bootdo.device.dao.DeviceRegisterDao;
import com.bootdo.device.domain.DeviceRegisterDO;
import com.bootdo.device.service.DeviceRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class DeviceRegisterServiceImpl implements DeviceRegisterService {
	@Autowired
	private DeviceRegisterDao deviceDao;
	
	@Override
	public DeviceRegisterDO get(Integer deviceId){
		return deviceDao.get(deviceId);
	}

    @Override
    public DeviceRegisterDO getName(Integer deviceId) {
        return deviceDao.getName(deviceId);
    }

    @Override
	public List<DeviceRegisterDO> list(Map<String, Object> map){
		return deviceDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return deviceDao.count(map);
	}
	
	@Override
	public int save(DeviceRegisterDO device){
		return deviceDao.save(device);
	}
	
	@Override
	public int update(DeviceRegisterDO device){
		return deviceDao.update(device);
	}
	
	@Override
	public int remove(Integer id){
		return deviceDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return deviceDao.batchRemove(ids);
	}

	@Override
	public List<DeviceRegisterDO> listAll(Map<String, Object> map) {
		return deviceDao.listAll(map);
	}

}
