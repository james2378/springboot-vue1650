package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyouguihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyouguihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyouguihuaView;


/**
 * 旅游规划
 *
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public interface LvyouguihuaService extends IService<LvyouguihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyouguihuaVO> selectListVO(Wrapper<LvyouguihuaEntity> wrapper);
   	
   	LvyouguihuaVO selectVO(@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);
   	
   	List<LvyouguihuaView> selectListView(Wrapper<LvyouguihuaEntity> wrapper);
   	
   	LvyouguihuaView selectView(@Param("ew") Wrapper<LvyouguihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyouguihuaEntity> wrapper);
   	

}

