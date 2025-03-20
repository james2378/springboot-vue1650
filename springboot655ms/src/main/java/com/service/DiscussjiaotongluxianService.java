package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaotongluxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaotongluxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaotongluxianView;


/**
 * 交通路线评论表
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public interface DiscussjiaotongluxianService extends IService<DiscussjiaotongluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaotongluxianVO> selectListVO(Wrapper<DiscussjiaotongluxianEntity> wrapper);
   	
   	DiscussjiaotongluxianVO selectVO(@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);
   	
   	List<DiscussjiaotongluxianView> selectListView(Wrapper<DiscussjiaotongluxianEntity> wrapper);
   	
   	DiscussjiaotongluxianView selectView(@Param("ew") Wrapper<DiscussjiaotongluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaotongluxianEntity> wrapper);
   	

}

