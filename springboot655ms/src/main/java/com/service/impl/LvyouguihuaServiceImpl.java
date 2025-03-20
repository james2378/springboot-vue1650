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


import com.dao.LvyouguihuaDao;
import com.entity.LvyouguihuaEntity;
import com.service.LvyouguihuaService;
import com.entity.vo.LvyouguihuaVO;
import com.entity.view.LvyouguihuaView;

@Service("lvyouguihuaService")
public class LvyouguihuaServiceImpl extends ServiceImpl<LvyouguihuaDao, LvyouguihuaEntity> implements LvyouguihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyouguihuaEntity> page = this.selectPage(
                new Query<LvyouguihuaEntity>(params).getPage(),
                new EntityWrapper<LvyouguihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyouguihuaEntity> wrapper) {
		  Page<LvyouguihuaView> page =new Query<LvyouguihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyouguihuaVO> selectListVO(Wrapper<LvyouguihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyouguihuaVO selectVO(Wrapper<LvyouguihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyouguihuaView> selectListView(Wrapper<LvyouguihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyouguihuaView selectView(Wrapper<LvyouguihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
