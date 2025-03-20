package com.entity.model;

import com.entity.LvyouguihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旅游规划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-09 18:31:56
 */
public class LvyouguihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 出发时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chufashijian;
		
	/**
	 * 预计天数
	 */
	
	private Integer yujitianshu;
		
	/**
	 * 旅游路线
	 */
	
	private String lvyouluxian;
		
	/**
	 * 规划内容
	 */
	
	private String guihuaneirong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
				
	
	/**
	 * 设置：预计天数
	 */
	 
	public void setYujitianshu(Integer yujitianshu) {
		this.yujitianshu = yujitianshu;
	}
	
	/**
	 * 获取：预计天数
	 */
	public Integer getYujitianshu() {
		return yujitianshu;
	}
				
	
	/**
	 * 设置：旅游路线
	 */
	 
	public void setLvyouluxian(String lvyouluxian) {
		this.lvyouluxian = lvyouluxian;
	}
	
	/**
	 * 获取：旅游路线
	 */
	public String getLvyouluxian() {
		return lvyouluxian;
	}
				
	
	/**
	 * 设置：规划内容
	 */
	 
	public void setGuihuaneirong(String guihuaneirong) {
		this.guihuaneirong = guihuaneirong;
	}
	
	/**
	 * 获取：规划内容
	 */
	public String getGuihuaneirong() {
		return guihuaneirong;
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
			
}
