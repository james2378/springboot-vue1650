package com.entity.vo;

import com.entity.JiaotongluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 交通路线
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-09 18:31:55
 */
public class JiaotongluxianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
