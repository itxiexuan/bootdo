package com.bootdo.device.dao;

import com.bootdo.device.domain.DeviceRegisterDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author xiexuan
 * @email 2621141526@qq.com
 * @date 2019-05-23 14:39:46
 */
@Mapper
public interface DeviceRegisterDao {

	DeviceRegisterDO get(Integer deviceId);

    DeviceRegisterDO getName(Integer deviceId);

	List<DeviceRegisterDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeviceRegisterDO device);
	
	int update(DeviceRegisterDO device);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	List<DeviceRegisterDO> listAll(Map<String, Object> map);

}
