package com.dao;

import com.entity.LvyouguihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyouguihuaVO;
import com.entity.view.LvyouguihuaView;


/**
 * 旅游规划
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public interface LvyouguihuaDao extends BaseMapper<LvyouguihuaEntity> {
	
	List<LvyouguihuaVO> selectListVO(@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);
	
	LvyouguihuaVO selectVO(@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);
	
	List<LvyouguihuaView> selectListView(@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);

	List<LvyouguihuaView> selectListView(Pagination page,@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);
	
	LvyouguihuaView selectView(@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);
	

}
