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


import com.dao.JiaotongluxianDao;
import com.entity.JiaotongluxianEntity;
import com.service.JiaotongluxianService;
import com.entity.vo.JiaotongluxianVO;
import com.entity.view.JiaotongluxianView;

@Service("jiaotongluxianService")
public class JiaotongluxianServiceImpl extends ServiceImpl<JiaotongluxianDao, JiaotongluxianEntity> implements JiaotongluxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaotongluxianEntity> page = this.selectPage(
                new Query<JiaotongluxianEntity>(params).getPage(),
                new EntityWrapper<JiaotongluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaotongluxianEntity> wrapper) {
		  Page<JiaotongluxianView> page =new Query<JiaotongluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaotongluxianVO> selectListVO(Wrapper<JiaotongluxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaotongluxianVO selectVO(Wrapper<JiaotongluxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaotongluxianView> selectListView(Wrapper<JiaotongluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaotongluxianView selectView(Wrapper<JiaotongluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
