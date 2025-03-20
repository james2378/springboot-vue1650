package com.entity.model;

import com.entity.LvxingrijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旅行日记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public class LvxingrijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 旅行类型
	 */
	
	private String lvxingleixing;
		
	/**
	 * 旅行天数
	 */
	
	private Integer lvxingtianshu;
		
	/**
	 * 旅行内容
	 */
	
	private String lvxingneirong;
		
	/**
	 * 旅行图片
	 */
	
	private String lvxingtupian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：旅行类型
	 */
	 
	public void setLvxingleixing(String lvxingleixing) {
		this.lvxingleixing = lvxingleixing;
	}
	
	/**
	 * 获取：旅行类型
	 */
	public String getLvxingleixing() {
		return lvxingleixing;
	}
				
	
	/**
	 * 设置：旅行天数
	 */
	 
	public void setLvxingtianshu(Integer lvxingtianshu) {
		this.lvxingtianshu = lvxingtianshu;
	}
	
	/**
	 * 获取：旅行天数
	 */
	public Integer getLvxingtianshu() {
		return lvxingtianshu;
	}
				
	
	/**
	 * 设置：旅行内容
	 */
	 
	public void setLvxingneirong(String lvxingneirong) {
		this.lvxingneirong = lvxingneirong;
	}
	
	/**
	 * 获取：旅行内容
	 */
	public String getLvxingneirong() {
		return lvxingneirong;
	}
				
	
	/**
	 * 设置：旅行图片
	 */
	 
	public void setLvxingtupian(String lvxingtupian) {
		this.lvxingtupian = lvxingtupian;
	}
	
	/**
	 * 获取：旅行图片
	 */
	public String getLvxingtupian() {
		return lvxingtupian;
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
			
}
