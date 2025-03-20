package com.entity.view;

import com.entity.TianqiyubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 天气预报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
@TableName("tianqiyubao")
public class TianqiyubaoView  extends TianqiyubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TianqiyubaoView(){
	}
 
 	public TianqiyubaoView(TianqiyubaoEntity tianqiyubaoEntity){
 	try {
			BeanUtils.copyProperties(this, tianqiyubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
