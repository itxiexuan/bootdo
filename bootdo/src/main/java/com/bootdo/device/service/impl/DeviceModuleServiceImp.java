package com.bootdo.device.service.impl;

import com.bootdo.device.dao.DeviceModuleDao;
import com.bootdo.device.domain.DeviceModuleDO;
import com.bootdo.device.service.DeviceModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeviceModuleServiceImp implements DeviceModuleService {
    @Autowired
    private DeviceModuleDao moduleDao;

    @Override
    public DeviceModuleDO get(Integer id){
        return moduleDao.get(id);
    }

    @Override
    public List<DeviceModuleDO> list(Map<String, Object> map){
        return moduleDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map){
        return moduleDao.count(map);
    }

    @Override
    public int save(DeviceModuleDO module){
        return moduleDao.save(module);
    }

    @Override
    public int update(DeviceModuleDO module){
        return moduleDao.update(module);
    }

    @Override
    public int remove(Integer id){
        return moduleDao.remove(id);
    }

    @Override
    public int batchRemove(Integer[] ids){
        return moduleDao.batchRemove(ids);
    }
}
