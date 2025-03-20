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
 * 交通路线
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
@TableName("jiaotongluxian")
public class JiaotongluxianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaotongluxianEntity() {
		
	}
	
	public JiaotongluxianEntity(T t) {
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
	 * 路线名称
	 */
					
	private String luxianmingcheng;
	
	/**
	 * 路线类型
	 */
					
	private String luxianleixing;
	
	/**
	 * 始发地
	 */
					
	private String shifadi;
	
	/**
	 * 终点地
	 */
					
	private String zhongdiandi;
	
	/**
	 * 全程距离
	 */
					
	private String quanchengjuli;
	
	/**
	 * 路线详情
	 */
					
	private String luxianxiangqing;
	
	/**
	 * 路线图片
	 */
					
	private String luxiantupian;
	
	
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
	 * 设置：路线名称
	 */
	public void setLuxianmingcheng(String luxianmingcheng) {
		this.luxianmingcheng = luxianmingcheng;
	}
	/**
	 * 获取：路线名称
	 */
	public String getLuxianmingcheng() {
		return luxianmingcheng;
	}
	/**
	 * 设置：路线类型
	 */
	public void setLuxianleixing(String luxianleixing) {
		this.luxianleixing = luxianleixing;
	}
	/**
	 * 获取：路线类型
	 */
	public String getLuxianleixing() {
		return luxianleixing;
	}
	/**
	 * 设置：始发地
	 */
	public void setShifadi(String shifadi) {
		this.shifadi = shifadi;
	}
	/**
	 * 获取：始发地
	 */
	public String getShifadi() {
		return shifadi;
	}
	/**
	 * 设置：终点地
	 */
	public void setZhongdiandi(String zhongdiandi) {
		this.zhongdiandi = zhongdiandi;
	}
	/**
	 * 获取：终点地
	 */
	public String getZhongdiandi() {
		return zhongdiandi;
	}
	/**
	 * 设置：全程距离
	 */
	public void setQuanchengjuli(String quanchengjuli) {
		this.quanchengjuli = quanchengjuli;
	}
	/**
	 * 获取：全程距离
	 */
	public String getQuanchengjuli() {
		return quanchengjuli;
	}
	/**
	 * 设置：路线详情
	 */
	public void setLuxianxiangqing(String luxianxiangqing) {
		this.luxianxiangqing = luxianxiangqing;
	}
	/**
	 * 获取：路线详情
	 */
	public String getLuxianxiangqing() {
		return luxianxiangqing;
	}
	/**
	 * 设置：路线图片
	 */
	public void setLuxiantupian(String luxiantupian) {
		this.luxiantupian = luxiantupian;
	}
	/**
	 * 获取：路线图片
	 */
	public String getLuxiantupian() {
		return luxiantupian;
	}

}
