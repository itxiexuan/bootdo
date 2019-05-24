package com.bootdo.device.controller;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.bootdo.device.domain.DeviceRegisterDO;
import com.bootdo.device.service.DeviceRegisterService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author xiexuan
 * @email 2621141526@qq.com
 * @date 2019-05-23 14:39:46
 */
 
@Controller
@RequestMapping("/device/register")
public class DeviceRegisterController {
	@Autowired
	private DeviceRegisterService deviceService;
	
	@GetMapping()
	@RequiresPermissions("device:register:register")
	String Device(){
	    return "device/register/device";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("device:register:register")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DeviceRegisterDO> deviceList = deviceService.list(query);
		int total = deviceService.count(query);
		PageUtils pageUtils = new PageUtils(deviceList, total);
		return pageUtils;
	}

    @ResponseBody
    @GetMapping("/listAll")
    @RequiresPermissions("device:register:register")
    public PageUtils listAll(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        List<DeviceRegisterDO> deviceList = deviceService.listAll(query);
        int total = deviceService.count(query);
        PageUtils pageUtils = new PageUtils(deviceList, total);
        return pageUtils;
    }
	
	@GetMapping("/add")
	@RequiresPermissions("device:register:add")
	String add(){
	    return "device/register/add";
	}

	@GetMapping("/edit/{deviceId}")
	@RequiresPermissions("device:register:edit")
	String edit(@PathVariable("deviceId") Integer deviceId,Model model){
		DeviceRegisterDO device = deviceService.get(deviceId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd  HH:mm:ss");
        device.setCreateDateStr(simpleDateFormat.format(device.getCreateDate()));
        device.setHandshakeDateStr(simpleDateFormat.format(device.getHandshakeDate()));
        model.addAttribute("device", device);
	    return "device/register/edit";
	}

    @GetMapping("/editName/{deviceId}")
    @RequiresPermissions("device:register:edit")
    String editName(@PathVariable("deviceId") Integer deviceId,Model model){
        DeviceRegisterDO device = deviceService.getName(deviceId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd  HH:mm:ss");
        device.setCreateDateStr(simpleDateFormat.format(device.getCreateDate()));
        device.setHandshakeDateStr(simpleDateFormat.format(device.getHandshakeDate()));
        model.addAttribute("device", device);
        return "device/register/edit";
    }
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:device:add")
	public R save( DeviceRegisterDO device){
		if(deviceService.save(device)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:device:edit")
	public R update( DeviceRegisterDO device){
		deviceService.update(device);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/delete")
	@ResponseBody
	@RequiresPermissions("device:register:delete")
	public R remove( Integer id){
		if(deviceService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/deleteAll")
	@ResponseBody
	@RequiresPermissions("device:register:deleteAll")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		deviceService.batchRemove(ids);
		return R.ok();
	}
	
}
