package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenpiaoyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenpiaoyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenpiaoyudingView;


/**
 * 门票预订
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface MenpiaoyudingService extends IService<MenpiaoyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenpiaoyudingVO> selectListVO(Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	MenpiaoyudingVO selectVO(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	List<MenpiaoyudingView> selectListView(Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	MenpiaoyudingView selectView(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenpiaoyudingEntity> wrapper);
   	

}

