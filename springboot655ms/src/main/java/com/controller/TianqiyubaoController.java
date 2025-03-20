package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TianqiyubaoEntity;
import com.entity.view.TianqiyubaoView;

import com.service.TianqiyubaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 天气预报
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
@RestController
@RequestMapping("/tianqiyubao")
public class TianqiyubaoController {
    @Autowired
    private TianqiyubaoService tianqiyubaoService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TianqiyubaoEntity tianqiyubao,
		HttpServletRequest request){
        EntityWrapper<TianqiyubaoEntity> ew = new EntityWrapper<TianqiyubaoEntity>();

		PageUtils page = tianqiyubaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tianqiyubao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TianqiyubaoEntity tianqiyubao, 
		HttpServletRequest request){
        EntityWrapper<TianqiyubaoEntity> ew = new EntityWrapper<TianqiyubaoEntity>();

		PageUtils page = tianqiyubaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tianqiyubao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TianqiyubaoEntity tianqiyubao){
       	EntityWrapper<TianqiyubaoEntity> ew = new EntityWrapper<TianqiyubaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tianqiyubao, "tianqiyubao")); 
        return R.ok().put("data", tianqiyubaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TianqiyubaoEntity tianqiyubao){
        EntityWrapper< TianqiyubaoEntity> ew = new EntityWrapper< TianqiyubaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tianqiyubao, "tianqiyubao")); 
		TianqiyubaoView tianqiyubaoView =  tianqiyubaoService.selectView(ew);
		return R.ok("查询天气预报成功").put("data", tianqiyubaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TianqiyubaoEntity tianqiyubao = tianqiyubaoService.selectById(id);
        return R.ok().put("data", tianqiyubao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TianqiyubaoEntity tianqiyubao = tianqiyubaoService.selectById(id);
        return R.ok().put("data", tianqiyubao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TianqiyubaoEntity tianqiyubao, HttpServletRequest request){
    	tianqiyubao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tianqiyubao);
        tianqiyubaoService.insert(tianqiyubao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TianqiyubaoEntity tianqiyubao, HttpServletRequest request){
    	tianqiyubao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tianqiyubao);
        tianqiyubaoService.insert(tianqiyubao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TianqiyubaoEntity tianqiyubao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tianqiyubao);
        tianqiyubaoService.updateById(tianqiyubao);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tianqiyubaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TianqiyubaoEntity> wrapper = new EntityWrapper<TianqiyubaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = tianqiyubaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
