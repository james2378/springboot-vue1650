package com.entity.view;

import com.entity.DiscusslvxingrijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅行日记评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
@TableName("discusslvxingriji")
public class DiscusslvxingrijiView  extends DiscusslvxingrijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvxingrijiView(){
	}
 
 	public DiscusslvxingrijiView(DiscusslvxingrijiEntity discusslvxingrijiEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvxingrijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
