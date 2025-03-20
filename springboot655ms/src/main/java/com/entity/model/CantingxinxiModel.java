package com.entity.model;

import com.entity.CantingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 餐厅信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public class CantingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐厅地点
	 */
	
	private String cantingdidian;
		
	/**
	 * 人均消费
	 */
	
	private Integer renjunxiaofei;
		
	/**
	 * 预订价格
	 */
	
	private Integer yudingjiage;
		
	/**
	 * 餐厅介绍
	 */
	
	private String cantingjieshao;
		
	/**
	 * 餐厅图片
	 */
	
	private String cantingtupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：人均消费
	 */
	 
	public void setRenjunxiaofei(Integer renjunxiaofei) {
		this.renjunxiaofei = renjunxiaofei;
	}
	
	/**
	 * 获取：人均消费
	 */
	public Integer getRenjunxiaofei() {
		return renjunxiaofei;
	}
				
	
	/**
	 * 设置：预订价格
	 */
	 
	public void setYudingjiage(Integer yudingjiage) {
		this.yudingjiage = yudingjiage;
	}
	
	/**
	 * 获取：预订价格
	 */
	public Integer getYudingjiage() {
		return yudingjiage;
	}
				
	
	/**
	 * 设置：餐厅介绍
	 */
	 
	public void setCantingjieshao(String cantingjieshao) {
		this.cantingjieshao = cantingjieshao;
	}
	
	/**
	 * 获取：餐厅介绍
	 */
	public String getCantingjieshao() {
		return cantingjieshao;
	}
				
	
	/**
	 * 设置：餐厅图片
	 */
	 
	public void setCantingtupian(String cantingtupian) {
		this.cantingtupian = cantingtupian;
	}
	
	/**
	 * 获取：餐厅图片
	 */
	public String getCantingtupian() {
		return cantingtupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
