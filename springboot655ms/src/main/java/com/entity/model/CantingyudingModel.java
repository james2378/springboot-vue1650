package com.entity.model;

import com.entity.CantingyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 餐厅预订
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public class CantingyudingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐厅地点
	 */
	
	private String cantingdidian;
		
	/**
	 * 预订价格
	 */
	
	private Float yudingjiage;
		
	/**
	 * 预订时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yudingshijian;
		
	/**
	 * 预订说明
	 */
	
	private String yudingshuoming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：餐厅地点
	 */
	 
	public void setCantingdidian(String cantingdidian) {
		this.cantingdidian = cantingdidian;
	}
	
	/**
	 * 获取：餐厅地点
	 */
	public String getCantingdidian() {
		return cantingdidian;
	}
				
	
	/**
	 * 设置：预订价格
	 */
	 
	public void setYudingjiage(Float yudingjiage) {
		this.yudingjiage = yudingjiage;
	}
	
	/**
	 * 获取：预订价格
	 */
	public Float getYudingjiage() {
		return yudingjiage;
	}
				
	
	/**
	 * 设置：预订时间
	 */
	 
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	
	/**
	 * 获取：预订时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
				
	
	/**
	 * 设置：预订说明
	 */
	 
	public void setYudingshuoming(String yudingshuoming) {
		this.yudingshuoming = yudingshuoming;
	}
	
	/**
	 * 获取：预订说明
	 */
	public String getYudingshuoming() {
		return yudingshuoming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
