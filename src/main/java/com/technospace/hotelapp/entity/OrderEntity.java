package com.technospace.hotelapp.entity;

public class OrderEntity {

	private int oid;
	private int cid;
	private String odate;
	private int oamount;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getOamount() {
		return oamount;
	}
	public void setOamount(int oamount) {
		this.oamount = oamount;
	}
	
	
	
}
