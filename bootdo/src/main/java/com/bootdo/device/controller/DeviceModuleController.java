package com.bootdo.device.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.device.domain.DeviceModuleDO;
import com.bootdo.device.service.DeviceModuleService;
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
@RequestMapping("/device/module")
public class DeviceModuleController {
    @Autowired
    private DeviceModuleService deviceModuleService;

    @GetMapping()
    @RequiresPermissions("device:module:module")
    String Module(){
        return "device/module/module";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("device:module:module")
    public PageUtils list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        List<DeviceModuleDO> moduleList = deviceModuleService.list(query);
        int total = deviceModuleService.count(query);
        PageUtils pageUtils = new PageUtils(moduleList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("device:module:add")
    String add(){
        return "device/module/add";
    }

    @GetMapping("/edit/{id}")
    @RequiresPermissions("device:module:edit")
    String edit(@PathVariable("id") Integer id, Model model){
        DeviceModuleDO module = deviceModuleService.get(id);
        model.addAttribute("module", module);
        return "device/module/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("device:module:add")
    public R save( DeviceModuleDO module){
        if(deviceModuleService.save(module)>0){
            return R.ok();
        }
        return R.error();
    }
    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("device:module:edit")
    public R update( DeviceModuleDO module){
        deviceModuleService.update(module);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    @RequiresPermissions("device:module:remove")
    public R remove( Integer id){
        if(deviceModuleService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping( "/batchRemove")
    @ResponseBody
    @RequiresPermissions("device:module:batchRemove")
    public R remove(@RequestParam("ids[]") Integer[] ids){
        deviceModuleService.batchRemove(ids);
        return R.ok();
    }

}
