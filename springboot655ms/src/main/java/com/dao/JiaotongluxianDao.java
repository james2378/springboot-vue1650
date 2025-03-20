package com.dao;

import com.entity.JiaotongluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaotongluxianVO;
import com.entity.view.JiaotongluxianView;


/**
 * 交通路线
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface JiaotongluxianDao extends BaseMapper<JiaotongluxianEntity> {
	
	List<JiaotongluxianVO> selectListVO(@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);
	
	JiaotongluxianVO selectVO(@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);
	
	List<JiaotongluxianView> selectListView(@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);

	List<JiaotongluxianView> selectListView(Pagination page,@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);
	
	JiaotongluxianView selectView(@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);
	

}
