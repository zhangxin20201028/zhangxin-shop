package com.bawei.zxshop.pojo;

import java.io.Serializable;

/**
 * 
 * @ClassName: SpecOption 
 * @Description: 规格属性
 * @author: 28987
 * @date: 2020年6月24日 下午10:38:03
 */
public class SpecOption implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	Integer id;
	String optionName;
	Integer specid;
	String specName;
	int orders;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public Integer getSpecid() {
		return specid;
	}
	public void setSpecid(Integer specid) {
		this.specid = specid;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "SpecOption [id=" + id + ", optionName=" + optionName + ", specid=" + specid + ", specName=" + specName
				+ ", orders=" + orders + "]";
	}
	public SpecOption(Integer id, String optionName, Integer specid, String specName, int orders) {
		super();
		this.id = id;
		this.optionName = optionName;
		this.specid = specid;
		this.specName = specName;
		this.orders = orders;
	}
	public SpecOption() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
