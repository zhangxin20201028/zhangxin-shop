package com.bawei.zxshop.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SkuVo extends Sku{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	int pageNum=1;
	int pageSize=5;
	String key;
	//价格区间
	BigDecimal maxPrice;
	BigDecimal minPrice;
	
	public BigDecimal getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}
	public BigDecimal getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "SkuVo [pageNum=" + pageNum + ", pageSize=" + pageSize + ", key=" + key + "]";
	}
	public SkuVo(Integer id, String title, String sellPoint, BigDecimal price, int stockCount, String barcode,
			String image, int status, Date createTime, Date updateTime, String costPrice, String marketPrice, int spuId,
			String cartThumbnail, Spu spu, List<SpecOption> options, int pageNum, int pageSize, String key) {
		super(id, title, sellPoint, price, stockCount, barcode, image, status, createTime, updateTime, costPrice,
				marketPrice, spuId, cartThumbnail, spu, options);
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.key = key;
	}
	public SkuVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SkuVo(Integer id, String title, String sellPoint, BigDecimal price, int stockCount, String barcode,
			String image, int status, Date createTime, Date updateTime, String costPrice, String marketPrice, int spuId,
			String cartThumbnail, Spu spu, List<SpecOption> options) {
		super(id, title, sellPoint, price, stockCount, barcode, image, status, createTime, updateTime, costPrice, marketPrice,
				spuId, cartThumbnail, spu, options);
		// TODO Auto-generated constructor stub
	}
	
	
}
