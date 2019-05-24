package com.bootdo.device.dao;

import com.bootdo.device.domain.DeviceModuleDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 *
 * @author xiexuan
 * @email 2621141526@qq.com
 * @date 2019-05-23 14:39:46
 */
@Mapper
public interface DeviceModuleDao {

    DeviceModuleDO get(Integer id);

    List<DeviceModuleDO> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(DeviceModuleDO module);

    int update(DeviceModuleDO module);

    int remove(Integer id);

    int batchRemove(Integer[] ids);
}
