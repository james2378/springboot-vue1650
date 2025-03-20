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


import com.dao.LvxingrijiDao;
import com.entity.LvxingrijiEntity;
import com.service.LvxingrijiService;
import com.entity.vo.LvxingrijiVO;
import com.entity.view.LvxingrijiView;

@Service("lvxingrijiService")
public class LvxingrijiServiceImpl extends ServiceImpl<LvxingrijiDao, LvxingrijiEntity> implements LvxingrijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvxingrijiEntity> page = this.selectPage(
                new Query<LvxingrijiEntity>(params).getPage(),
                new EntityWrapper<LvxingrijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvxingrijiEntity> wrapper) {
		  Page<LvxingrijiView> page =new Query<LvxingrijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvxingrijiVO> selectListVO(Wrapper<LvxingrijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvxingrijiVO selectVO(Wrapper<LvxingrijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvxingrijiView> selectListView(Wrapper<LvxingrijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvxingrijiView selectView(Wrapper<LvxingrijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
