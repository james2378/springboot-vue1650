package com.dao;

import com.entity.TianqiyubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TianqiyubaoVO;
import com.entity.view.TianqiyubaoView;


/**
 * 天气预报
 * 
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface TianqiyubaoDao extends BaseMapper<TianqiyubaoEntity> {
	
	List<TianqiyubaoVO> selectListVO(@Param("ew") Wrapper<TianqiyubaoEntity> wrapper);
	
	TianqiyubaoVO selectVO(@Param("ew") Wrapper<TianqiyubaoEntity> wrapper);
	
	List<TianqiyubaoView> selectListView(@Param("ew") Wrapper<TianqiyubaoEntity> wrapper);

	List<TianqiyubaoView> selectListView(Pagination page,@Param("ew") Wrapper<TianqiyubaoEntity> wrapper);
	
	TianqiyubaoView selectView(@Param("ew") Wrapper<TianqiyubaoEntity> wrapper);
	

}
