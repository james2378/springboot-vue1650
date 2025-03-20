package com.dao;

import com.entity.CantingyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CantingyudingVO;
import com.entity.view.CantingyudingView;


/**
 * 餐厅预订
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface CantingyudingDao extends BaseMapper<CantingyudingEntity> {
	
	List<CantingyudingVO> selectListVO(@Param("ew") Wrapper<CantingyudingEntity> wrapper);
	
	CantingyudingVO selectVO(@Param("ew") Wrapper<CantingyudingEntity> wrapper);
	
	List<CantingyudingView> selectListView(@Param("ew") Wrapper<CantingyudingEntity> wrapper);

	List<CantingyudingView> selectListView(Pagination page,@Param("ew") Wrapper<CantingyudingEntity> wrapper);
	
	CantingyudingView selectView(@Param("ew") Wrapper<CantingyudingEntity> wrapper);
	

}
