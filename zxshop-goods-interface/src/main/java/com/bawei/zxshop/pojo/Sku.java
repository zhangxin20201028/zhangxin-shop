package com.bawei.zxshop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Sku implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//商品id
	private String title;//商品标题
	private String sellPoint;//商品卖点
	private BigDecimal price;//商品价格，单位为：元
	private int stockCount;//库存数量
	private String barcode;//商品条形码
	private String image;//商品图片
	private int status;//商品状态，1-正常，2-下架，3-删除
	private Date createTime;//创建时间
	private Date updateTime;//更新时间
	private String costPrice;//成本价
	private String marketPrice;
	private int spuId;
	private String cartThumbnail;
	
	private Spu spu;
	private List<SpecOption> options;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSellPoint() {
		return sellPoint;
	}
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public int getSpuId() {
		return spuId;
	}
	public void setSpuId(int spuId) {
		this.spuId = spuId;
	}
	public String getCartThumbnail() {
		return cartThumbnail;
	}
	public void setCartThumbnail(String cartThumbnail) {
		this.cartThumbnail = cartThumbnail;
	}
	public Spu getSpu() {
		return spu;
	}
	public void setSpu(Spu spu) {
		this.spu = spu;
	}
	public List<SpecOption> getOptions() {
		return options;
	}
	public void setOptions(List<SpecOption> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "Sku [id=" + id + ", title=" + title + ", sellPoint=" + sellPoint + ", price=" + price + ", stockCount="
				+ stockCount + ", barcode=" + barcode + ", image=" + image + ", status=" + status + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", costPrice=" + costPrice + ", marketPrice="
				+ marketPrice + ", spuId=" + spuId + ", cartThumbnail=" + cartThumbnail + ", spu=" + spu + ", options="
				+ options + "]";
	}
	public Sku(Integer id, String title, String sellPoint, BigDecimal price, int stockCount, String barcode,
			String image, int status, Date createTime, Date updateTime, String costPrice, String marketPrice, int spuId,
			String cartThumbnail, Spu spu, List<SpecOption> options) {
		super();
		this.id = id;
		this.title = title;
		this.sellPoint = sellPoint;
		this.price = price;
		this.stockCount = stockCount;
		this.barcode = barcode;
		this.image = image;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.costPrice = costPrice;
		this.marketPrice = marketPrice;
		this.spuId = spuId;
		this.cartThumbnail = cartThumbnail;
		this.spu = spu;
		this.options = options;
	}
	public Sku() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
