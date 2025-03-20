package com.entity.view;

import com.entity.CantingyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐厅预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
@TableName("cantingyuding")
public class CantingyudingView  extends CantingyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CantingyudingView(){
	}
 
 	public CantingyudingView(CantingyudingEntity cantingyudingEntity){
 	try {
			BeanUtils.copyProperties(this, cantingyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
