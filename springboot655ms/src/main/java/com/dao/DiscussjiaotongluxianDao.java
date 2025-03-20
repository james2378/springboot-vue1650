package com.dao;

import com.entity.DiscussjiaotongluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaotongluxianVO;
import com.entity.view.DiscussjiaotongluxianView;


/**
 * 交通路线评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public interface DiscussjiaotongluxianDao extends BaseMapper<DiscussjiaotongluxianEntity> {
	
	List<DiscussjiaotongluxianVO> selectListVO(@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);
	
	DiscussjiaotongluxianVO selectVO(@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);
	
	List<DiscussjiaotongluxianView> selectListView(@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);

	List<DiscussjiaotongluxianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);
	
	DiscussjiaotongluxianView selectView(@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);
	

}
