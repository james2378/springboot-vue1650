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


import com.dao.CantingyudingDao;
import com.entity.CantingyudingEntity;
import com.service.CantingyudingService;
import com.entity.vo.CantingyudingVO;
import com.entity.view.CantingyudingView;

@Service("cantingyudingService")
public class CantingyudingServiceImpl extends ServiceImpl<CantingyudingDao, CantingyudingEntity> implements CantingyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CantingyudingEntity> page = this.selectPage(
                new Query<CantingyudingEntity>(params).getPage(),
                new EntityWrapper<CantingyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CantingyudingEntity> wrapper) {
		  Page<CantingyudingView> page =new Query<CantingyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CantingyudingVO> selectListVO(Wrapper<CantingyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CantingyudingVO selectVO(Wrapper<CantingyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CantingyudingView> selectListView(Wrapper<CantingyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CantingyudingView selectView(Wrapper<CantingyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
