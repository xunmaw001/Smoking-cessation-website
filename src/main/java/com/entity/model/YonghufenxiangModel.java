package com.entity.model;

import com.entity.YonghufenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户分享
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-15 08:22:48
 */
public class YonghufenxiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分享类型
	 */
	
	private String fenxiangleixing;
		
	/**
	 * 分享图片
	 */
	
	private String fenxiangtupian;
		
	/**
	 * 分享视频
	 */
	
	private String fenxiangshipin;
		
	/**
	 * 分享日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fenxiangriqi;
		
	/**
	 * 分享内容
	 */
	
	private String fenxiangneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：分享类型
	 */
	 
	public void setFenxiangleixing(String fenxiangleixing) {
		this.fenxiangleixing = fenxiangleixing;
	}
	
	/**
	 * 获取：分享类型
	 */
	public String getFenxiangleixing() {
		return fenxiangleixing;
	}
				
	
	/**
	 * 设置：分享图片
	 */
	 
	public void setFenxiangtupian(String fenxiangtupian) {
		this.fenxiangtupian = fenxiangtupian;
	}
	
	/**
	 * 获取：分享图片
	 */
	public String getFenxiangtupian() {
		return fenxiangtupian;
	}
				
	
	/**
	 * 设置：分享视频
	 */
	 
	public void setFenxiangshipin(String fenxiangshipin) {
		this.fenxiangshipin = fenxiangshipin;
	}
	
	/**
	 * 获取：分享视频
	 */
	public String getFenxiangshipin() {
		return fenxiangshipin;
	}
				
	
	/**
	 * 设置：分享日期
	 */
	 
	public void setFenxiangriqi(Date fenxiangriqi) {
		this.fenxiangriqi = fenxiangriqi;
	}
	
	/**
	 * 获取：分享日期
	 */
	public Date getFenxiangriqi() {
		return fenxiangriqi;
	}
				
	
	/**
	 * 设置：分享内容
	 */
	 
	public void setFenxiangneirong(String fenxiangneirong) {
		this.fenxiangneirong = fenxiangneirong;
	}
	
	/**
	 * 获取：分享内容
	 */
	public String getFenxiangneirong() {
		return fenxiangneirong;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
