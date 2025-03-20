package com.dao;

import com.entity.LvxingrijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvxingrijiVO;
import com.entity.view.LvxingrijiView;


/**
 * 旅行日记
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface LvxingrijiDao extends BaseMapper<LvxingrijiEntity> {
	
	List<LvxingrijiVO> selectListVO(@Param("ew") Wrapper<LvxingrijiEntity> wrapper);
	
	LvxingrijiVO selectVO(@Param("ew") Wrapper<LvxingrijiEntity> wrapper);
	
	List<LvxingrijiView> selectListView(@Param("ew") Wrapper<LvxingrijiEntity> wrapper);

	List<LvxingrijiView> selectListView(Pagination page,@Param("ew") Wrapper<LvxingrijiEntity> wrapper);
	
	LvxingrijiView selectView(@Param("ew") Wrapper<LvxingrijiEntity> wrapper);
	

}
