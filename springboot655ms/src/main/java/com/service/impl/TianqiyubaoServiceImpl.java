package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TianqiyubaoDao;
import com.entity.TianqiyubaoEntity;
import com.service.TianqiyubaoService;
import com.entity.vo.TianqiyubaoVO;
import com.entity.view.TianqiyubaoView;

@Service("tianqiyubaoService")
public class TianqiyubaoServiceImpl extends ServiceImpl<TianqiyubaoDao, TianqiyubaoEntity> implements TianqiyubaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TianqiyubaoEntity> page = this.selectPage(
                new Query<TianqiyubaoEntity>(params).getPage(),
                new EntityWrapper<TianqiyubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TianqiyubaoEntity> wrapper) {
		  Page<TianqiyubaoView> page =new Query<TianqiyubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TianqiyubaoVO> selectListVO(Wrapper<TianqiyubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TianqiyubaoVO selectVO(Wrapper<TianqiyubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TianqiyubaoView> selectListView(Wrapper<TianqiyubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TianqiyubaoView selectView(Wrapper<TianqiyubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
