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


import com.dao.DiscusslvxingrijiDao;
import com.entity.DiscusslvxingrijiEntity;
import com.service.DiscusslvxingrijiService;
import com.entity.vo.DiscusslvxingrijiVO;
import com.entity.view.DiscusslvxingrijiView;

@Service("discusslvxingrijiService")
public class DiscusslvxingrijiServiceImpl extends ServiceImpl<DiscusslvxingrijiDao, DiscusslvxingrijiEntity> implements DiscusslvxingrijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvxingrijiEntity> page = this.selectPage(
                new Query<DiscusslvxingrijiEntity>(params).getPage(),
                new EntityWrapper<DiscusslvxingrijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvxingrijiEntity> wrapper) {
		  Page<DiscusslvxingrijiView> page =new Query<DiscusslvxingrijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslvxingrijiVO> selectListVO(Wrapper<DiscusslvxingrijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslvxingrijiVO selectVO(Wrapper<DiscusslvxingrijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslvxingrijiView> selectListView(Wrapper<DiscusslvxingrijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvxingrijiView selectView(Wrapper<DiscusslvxingrijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
