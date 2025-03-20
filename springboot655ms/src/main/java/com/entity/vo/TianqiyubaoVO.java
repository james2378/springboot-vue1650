package com.entity.vo;

import com.entity.TianqiyubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 天气预报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public class TianqiyubaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 天气
	 */
	
	private String tianqi;
		
	/**
	 * 气温
	 */
	
	private String qiwen;
		
	/**
	 * 湿度
	 */
	
	private String shidu;
		
	/**
	 * 风向
	 */
	
	private String fengxiang;
		
	/**
	 * 风速
	 */
	
	private String fengsu;
		
	/**
	 * 适宜出行
	 */
	
	private String shiyichuxing;
		
	/**
	 * 穿衣推荐
	 */
	
	private String chuanyituijian;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：天气
	 */
	 
	public void setTianqi(String tianqi) {
		this.tianqi = tianqi;
	}
	
	/**
	 * 获取：天气
	 */
	public String getTianqi() {
		return tianqi;
	}
				
	
	/**
	 * 设置：气温
	 */
	 
	public void setQiwen(String qiwen) {
		this.qiwen = qiwen;
	}
	
	/**
	 * 获取：气温
	 */
	public String getQiwen() {
		return qiwen;
	}
				
	
	/**
	 * 设置：湿度
	 */
	 
	public void setShidu(String shidu) {
		this.shidu = shidu;
	}
	
	/**
	 * 获取：湿度
	 */
	public String getShidu() {
		return shidu;
	}
				
	
	/**
	 * 设置：风向
	 */
	 
	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}
	
	/**
	 * 获取：风向
	 */
	public String getFengxiang() {
		return fengxiang;
	}
				
	
	/**
	 * 设置：风速
	 */
	 
	public void setFengsu(String fengsu) {
		this.fengsu = fengsu;
	}
	
	/**
	 * 获取：风速
	 */
	public String getFengsu() {
		return fengsu;
	}
				
	
	/**
	 * 设置：适宜出行
	 */
	 
	public void setShiyichuxing(String shiyichuxing) {
		this.shiyichuxing = shiyichuxing;
	}
	
	/**
	 * 获取：适宜出行
	 */
	public String getShiyichuxing() {
		return shiyichuxing;
	}
				
	
	/**
	 * 设置：穿衣推荐
	 */
	 
	public void setChuanyituijian(String chuanyituijian) {
		this.chuanyituijian = chuanyituijian;
	}
	
	/**
	 * 获取：穿衣推荐
	 */
	public String getChuanyituijian() {
		return chuanyituijian;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
			
}
