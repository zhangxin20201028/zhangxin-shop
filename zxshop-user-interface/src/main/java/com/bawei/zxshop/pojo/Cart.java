package com.bawei.zxshop.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Cart implements Serializable{
   
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int uid;//用户 id
	private int skuid;//sku  id
	private int pnum;//购买数量
	private Date createtime;//添加时间
	private Date updatetime;//修改时间
	private Sku sku;
	
	public Sku getSku() {
		return sku;
	}
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSkuid() {
		return skuid;
	}
	public void setSkuid(int skuid) {
		this.skuid = skuid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + skuid;
		result = prime * result + uid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (skuid != other.skuid)
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", uid=" + uid + ", skuid=" + skuid + ", pnum=" + pnum + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + ", sku=" + sku + "]";
	}
	public Cart(Integer id, int uid, int skuid, int pnum, Date createtime, Date updatetime) {
		super();
		this.id = id;
		this.uid = uid;
		this.skuid = skuid;
		this.pnum = pnum;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
