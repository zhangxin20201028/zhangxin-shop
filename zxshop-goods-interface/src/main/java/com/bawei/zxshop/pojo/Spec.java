package com.bawei.zxshop.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @ClassName: Spec 
 * @Description: 规格
 * @author: 28987
 * @date: 2020年6月24日 下午10:40:03
 */
public class Spec implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	Integer id;
	String specName;
	List<SpecOption> options;
	
	public List<SpecOption> getOptions() {
		return options;
	}
	public void setOptions(List<SpecOption> options) {
		this.options = options;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	
	@Override
	public String toString() {
		return "Spec [id=" + id + ", specName=" + specName + ", options=" + options + "]";
	}
	public Spec(Integer id, String specName, List<SpecOption> options) {
		super();
		this.id = id;
		this.specName = specName;
		this.options = options;
	}
	public Spec() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
