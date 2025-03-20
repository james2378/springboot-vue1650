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


import com.dao.DiscussjiaotongluxianDao;
import com.entity.DiscussjiaotongluxianEntity;
import com.service.DiscussjiaotongluxianService;
import com.entity.vo.DiscussjiaotongluxianVO;
import com.entity.view.DiscussjiaotongluxianView;

@Service("discussjiaotongluxianService")
public class DiscussjiaotongluxianServiceImpl extends ServiceImpl<DiscussjiaotongluxianDao, DiscussjiaotongluxianEntity> implements DiscussjiaotongluxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaotongluxianEntity> page = this.selectPage(
                new Query<DiscussjiaotongluxianEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaotongluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaotongluxianEntity> wrapper) {
		  Page<DiscussjiaotongluxianView> page =new Query<DiscussjiaotongluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaotongluxianVO> selectListVO(Wrapper<DiscussjiaotongluxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaotongluxianVO selectVO(Wrapper<DiscussjiaotongluxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaotongluxianView> selectListView(Wrapper<DiscussjiaotongluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaotongluxianView selectView(Wrapper<DiscussjiaotongluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
