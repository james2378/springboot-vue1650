package com.entity.view;

import com.entity.JiaotongluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交通路线
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
@TableName("jiaotongluxian")
public class JiaotongluxianView  extends JiaotongluxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaotongluxianView(){
	}
 
 	public JiaotongluxianView(JiaotongluxianEntity jiaotongluxianEntity){
 	try {
			BeanUtils.copyProperties(this, jiaotongluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
