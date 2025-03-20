package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 旅行日记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
@TableName("lvxingriji")
public class LvxingrijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvxingrijiEntity() {
		
	}
	
	public LvxingrijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 旅行地点
	 */
					
	private String lvxingdidian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：旅行地点
	 */
	public void setLvxingdidian(String lvxingdidian) {
		this.lvxingdidian = lvxingdidian;
	}
	/**
	 * 获取：旅行地点
	 */
	public String getLvxingdidian() {
		return lvxingdidian;
	}
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
