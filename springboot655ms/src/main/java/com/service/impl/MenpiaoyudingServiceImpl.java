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


import com.dao.MenpiaoyudingDao;
import com.entity.MenpiaoyudingEntity;
import com.service.MenpiaoyudingService;
import com.entity.vo.MenpiaoyudingVO;
import com.entity.view.MenpiaoyudingView;

@Service("menpiaoyudingService")
public class MenpiaoyudingServiceImpl extends ServiceImpl<MenpiaoyudingDao, MenpiaoyudingEntity> implements MenpiaoyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenpiaoyudingEntity> page = this.selectPage(
                new Query<MenpiaoyudingEntity>(params).getPage(),
                new EntityWrapper<MenpiaoyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenpiaoyudingEntity> wrapper) {
		  Page<MenpiaoyudingView> page =new Query<MenpiaoyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenpiaoyudingVO> selectListVO(Wrapper<MenpiaoyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenpiaoyudingVO selectVO(Wrapper<MenpiaoyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenpiaoyudingView> selectListView(Wrapper<MenpiaoyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenpiaoyudingView selectView(Wrapper<MenpiaoyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
