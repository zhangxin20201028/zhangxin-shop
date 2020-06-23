package com.bawei.zxshop.pojo;

import java.io.Serializable;
/**
 * 
 * @ClassName: Brand 
 * @Description: 品牌的实体类
 * @author: 28987
 * @date: 2020年6月23日 下午8:58:53
 */
public class Brand implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	Integer id;
	String name;
	String first_char;
	int deleted_flag;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirst_char() {
		return first_char;
	}
	public void setFirst_char(String first_char) {
		this.first_char = first_char;
	}
	public int getDeleted_flag() {
		return deleted_flag;
	}
	public void setDeleted_flag(int deleted_flag) {
		this.deleted_flag = deleted_flag;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", first_char=" + first_char + ", deleted_flag=" + deleted_flag
				+ "]";
	}
	public Brand(Integer id, String name, String first_char, int deleted_flag) {
		super();
		this.id = id;
		this.name = name;
		this.first_char = first_char;
		this.deleted_flag = deleted_flag;
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
