package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvxingrijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvxingrijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvxingrijiView;


/**
 * 旅行日记评论表
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public interface DiscusslvxingrijiService extends IService<DiscusslvxingrijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvxingrijiVO> selectListVO(Wrapper<DiscusslvxingrijiEntity> wrapper);
   	
   	DiscusslvxingrijiVO selectVO(@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);
   	
   	List<DiscusslvxingrijiView> selectListView(Wrapper<DiscusslvxingrijiEntity> wrapper);
   	
   	DiscusslvxingrijiView selectView(@Param("ew") Wrapper<DiscusslvxingrijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvxingrijiEntity> wrapper);
   	

}

