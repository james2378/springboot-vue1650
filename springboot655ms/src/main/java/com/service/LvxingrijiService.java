package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvxingrijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvxingrijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvxingrijiView;


/**
 * 旅行日记
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface LvxingrijiService extends IService<LvxingrijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvxingrijiVO> selectListVO(Wrapper<LvxingrijiEntity> wrapper);
   	
   	LvxingrijiVO selectVO(@Param("ew") Wrapper<LvxingrijiEntity> wrapper);
   	
   	List<LvxingrijiView> selectListView(Wrapper<LvxingrijiEntity> wrapper);
   	
   	LvxingrijiView selectView(@Param("ew") Wrapper<LvxingrijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvxingrijiEntity> wrapper);
   	

}

