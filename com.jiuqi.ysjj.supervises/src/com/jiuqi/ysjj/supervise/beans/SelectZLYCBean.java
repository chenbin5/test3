package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectZLYCBean {

	private GUID recid;
	/**项目名称*/
	private String XMMC;
	/**项目单位*/
	private String SJ;
	/**地点*/
	private String DD;
	/**展览或演出名称*/
	private String ZLHYCMC;
	/**项目执行过程*/
	private GUID XMZXGCID;
	/**项目单位*/
	private String XMDW;
	
	/**展览演出总场数**/
	private int ZLYCZNUM;
	/**总观众数**/
	private int ZGZRS;
	/**总收入**/
	private double ZSR;
	
	public GUID getRecid() {
		return recid;
	}
	public void setRecid(GUID recid) {
		this.recid = recid;
	}
	public String getXMMC() {
		return XMMC;
	}
	public void setXMMC(String xMMC) {
		XMMC = xMMC;
	}
	public String getSJ() {
		return SJ;
	}
	public void setSJ(String sJ) {
		SJ = sJ;
	}
	public String getDD() {
		return DD;
	}
	public void setDD(String dD) {
		DD = dD;
	}
	public String getZLHYCMC() {
		return ZLHYCMC;
	}
	public void setZLHYCMC(String zLHYCMC) {
		ZLHYCMC = zLHYCMC;
	}
	public GUID getXMZXGCID() {
		return XMZXGCID;
	}
	public void setXMZXGCID(GUID xMZXGCID) {
		XMZXGCID = xMZXGCID;
	}
	public String getXMDW() {
		return XMDW;
	}
	public void setXMDW(String xMDW) {
		XMDW = xMDW;
	}
	public int getZLYCZNUM() {
		return ZLYCZNUM;
	}
	public void setZLYCZNUM(int zLYCZNUM) {
		ZLYCZNUM = zLYCZNUM;
	}
	public int getZGZRS() {
		return ZGZRS;
	}
	public void setZGZRS(int zGZRS) {
		ZGZRS = zGZRS;
	}
	public double getZSR() {
		return ZSR;
	}
	public void setZSR(double zSR) {
		ZSR = zSR;
	}
	@Override
	public String toString() {
		return "SelectZLYCBean [recid=" + recid + ", XMMC=" + XMMC + ", SJ="
				+ SJ + ", DD=" + DD + ", ZLHYCMC=" + ZLHYCMC + ", XMZXGCID="
				+ XMZXGCID + ", XMDW=" + XMDW + ", ZLYCZNUM=" + ZLYCZNUM
				+ ", ZGZRS=" + ZGZRS + ", ZSR=" + ZSR + "]";
	}
}
