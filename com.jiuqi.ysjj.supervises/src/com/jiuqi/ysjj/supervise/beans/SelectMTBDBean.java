package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectMTBDBean {

	private GUID recid;
	/**项目名称*/
	private String XMMC;
	/**项目单位*/
	private String XMDW;
	/**发表媒介*/
	private String FBMJ;
	/**媒介级别*/
	private String MJJB;
	/**媒介名称*/
	private String MJMC;
	/**报道发表时间*/
	private String BDFBSJ;
	/**项目执行过程*/
	private GUID XMZXGCID;
	
	/**总报道篇数*/
	private int ZPS;
	
	/**主体自有报道篇数*/
	private int ZTZYPS;
	
	/**省区市级报道篇数*/
	private int SQSJPS;
	
	/**中央级报道篇数*/
	private int ZYJPS;
	
	/**海外报道篇数*/
	private int HWPS;
	
	/**其他报道篇数*/
	private int QTPS;
	
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
	public String getXMDW() {
		return XMDW;
	}
	public void setXMDW(String xMDW) {
		XMDW = xMDW;
	}
	public String getFBMJ() {
		return FBMJ;
	}
	public void setFBMJ(String fBMJ) {
		FBMJ = fBMJ;
	}
	public String getMJJB() {
		return MJJB;
	}
	public void setMJJB(String mJJB) {
		MJJB = mJJB;
	}
	public String getMJMC() {
		return MJMC;
	}
	public void setMJMC(String mJMC) {
		MJMC = mJMC;
	}
	public String getBDFBSJ() {
		return BDFBSJ;
	}
	public void setBDFBSJ(String bDFBSJ) {
		BDFBSJ = bDFBSJ;
	}
	public GUID getXMZXGCID() {
		return XMZXGCID;
	}
	public void setXMZXGCID(GUID xMZXGCID) {
		XMZXGCID = xMZXGCID;
	}
	public int getZPS() {
		return ZPS;
	}
	public void setZPS(int zPS) {
		ZPS = zPS;
	}
	public int getZTZYPS() {
		return ZTZYPS;
	}
	public void setZTZYPS(int zTZYPS) {
		ZTZYPS = zTZYPS;
	}
	public int getSQSJPS() {
		return SQSJPS;
	}
	public void setSQSJPS(int sQSJPS) {
		SQSJPS = sQSJPS;
	}
	public int getZYJPS() {
		return ZYJPS;
	}
	public void setZYJPS(int zYJPS) {
		ZYJPS = zYJPS;
	}
	public int getHWPS() {
		return HWPS;
	}
	public void setHWPS(int hWPS) {
		HWPS = hWPS;
	}
	public int getQTPS() {
		return QTPS;
	}
	public void setQTPS(int qTPS) {
		QTPS = qTPS;
	}
	
	
}
