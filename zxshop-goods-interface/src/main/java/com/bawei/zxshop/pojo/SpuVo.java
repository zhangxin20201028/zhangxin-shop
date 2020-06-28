package com.bawei.zxshop.pojo;

public class SpuVo extends Spu{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	int pageNum=1;
	int pageSize=5;
	String key;//查询的关键字 只要name 或者 caption 当中有一个字段匹配即可
	// 排序方式
	String oederType="ASC";
	//排序名称
	String orderColumn="";
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
	public String getOederType() {
		return oederType;
	}
	public void setOederType(String oederType) {
		this.oederType = oederType;
	}
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	@Override
	public String toString() {
		return "SpuVo [pageNum=" + pageNum + ", pageSize=" + pageSize + ", key=" + key + ", oederType=" + oederType
				+ ", orderColumn=" + orderColumn + "]";
	}
	public SpuVo(Integer id, String goodsName, int isMarketable, String caption, String smallPic, int pageNum,
			int pageSize, String key, String oederType, String orderColumn) {
		super(id, goodsName, isMarketable, caption, smallPic);
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.key = key;
		this.oederType = oederType;
		this.orderColumn = orderColumn;
	}
	public SpuVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpuVo(Integer id, String goodsName, int isMarketable, String caption, String smallPic) {
		super(id, goodsName, isMarketable, caption, smallPic);
		// TODO Auto-generated constructor stub
	}
	
	
}
