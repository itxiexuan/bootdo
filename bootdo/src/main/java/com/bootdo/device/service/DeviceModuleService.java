package com.bootdo.device.service;

import com.bootdo.device.domain.DeviceModuleDO;

import java.util.List;
import java.util.Map;

public interface DeviceModuleService {
    DeviceModuleDO get(Integer id);

    List<DeviceModuleDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(DeviceModuleDO module);

    int update(DeviceModuleDO module);

    int remove(Integer id);

    int batchRemove(Integer[] ids);
}
