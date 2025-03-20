package com.dao;

import com.entity.DiscusslvxingrijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvxingrijiVO;
import com.entity.view.DiscusslvxingrijiView;


/**
 * 旅行日记评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public interface DiscusslvxingrijiDao extends BaseMapper<DiscusslvxingrijiEntity> {
	
	List<DiscusslvxingrijiVO> selectListVO(@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);
	
	DiscusslvxingrijiVO selectVO(@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);
	
	List<DiscusslvxingrijiView> selectListView(@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);

	List<DiscusslvxingrijiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);
	
	DiscusslvxingrijiView selectView(@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);
	

}
