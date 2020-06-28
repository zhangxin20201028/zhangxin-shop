package com.bawei.zxshop.pojo;

import java.io.Serializable;

/**
 * 
 * @ClassName: Spu 
 * @Description: TODO
 * @author: 28987
 * @date: 2020年6月28日 上午11:27:49
 */
public class Spu implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String goodsName;
	private int isMarketable;
	private String caption;
	private String smallPic;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getIsMarketable() {
		return isMarketable;
	}
	public void setIsMarketable(int isMarketable) {
		this.isMarketable = isMarketable;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getSmallPic() {
		return smallPic;
	}
	public void setSmallPic(String smallPic) {
		this.smallPic = smallPic;
	}
	@Override
	public String toString() {
		return "Spu [id=" + id + ", goodsName=" + goodsName + ", isMarketable=" + isMarketable + ", caption=" + caption
				+ ", smallPic=" + smallPic + "]";
	}
	public Spu(Integer id, String goodsName, int isMarketable, String caption, String smallPic) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.isMarketable = isMarketable;
		this.caption = caption;
		this.smallPic = smallPic;
	}
	public Spu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
