package com.bawei.zxshop.common;
/**
 * 
 * @ClassName: MsgData 
 * @Description: 结果集
 * @author: 28987
 * @date: 2020年7月2日 上午8:39:59
 */
public class MsgData {

	//正常返回
	int errorCode=0;
	//错误信息
	String errorInfo="";
	Object  data;//返回数据
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "MsgData [errorCode=" + errorCode + ", errorInfo=" + errorInfo + ", data=" + data + "]";
	}
	public MsgData(int errorCode, String errorInfo) {
		super();
		this.errorCode = errorCode;
		this.errorInfo = errorInfo;
	}
	public MsgData(Object data) {
		super();
		this.data = data;
	}
	
	
	
}
