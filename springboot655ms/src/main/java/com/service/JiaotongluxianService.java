package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaotongluxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaotongluxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaotongluxianView;


/**
 * 交通路线
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public interface JiaotongluxianService extends IService<JiaotongluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaotongluxianVO> selectListVO(Wrapper<JiaotongluxianEntity> wrapper);
   	
   	JiaotongluxianVO selectVO(@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);
   	
   	List<JiaotongluxianView> selectListView(Wrapper<JiaotongluxianEntity> wrapper);
   	
   	JiaotongluxianView selectView(@Param("ew") Wrapper<JiaotongluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaotongluxianEntity> wrapper);
   	

}

