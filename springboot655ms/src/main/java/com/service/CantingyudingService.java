package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CantingyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CantingyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CantingyudingView;


/**
 * 餐厅预订
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface CantingyudingService extends IService<CantingyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CantingyudingVO> selectListVO(Wrapper<CantingyudingEntity> wrapper);
   	
   	CantingyudingVO selectVO(@Param("ew") Wrapper<CantingyudingEntity> wrapper);
   	
   	List<CantingyudingView> selectListView(Wrapper<CantingyudingEntity> wrapper);
   	
   	CantingyudingView selectView(@Param("ew") Wrapper<CantingyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CantingyudingEntity> wrapper);
   	

}

