package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectYTHBean {
	
	private GUID Recid;
	/**项目名称*/
	private String XMMC;
	/**项目单位*/
	private String XMDW;
	/**研讨会时间*/
	private String YTHSJ;
	/**项目执行过程Recid*/
	private GUID XMZXGCID;
	
	/**研讨会专家人数*/
	private int YTHZJRS;

	/**研讨会次数**/
	private int YTHCS;
	
	public GUID getRecid() {
		return Recid;
	}
	public void setRecid(GUID recid) {
		Recid = recid;
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
	public String getYTHSJ() {
		return YTHSJ;
	}
	public void setYTHSJ(String yTHSJ) {
		YTHSJ = yTHSJ;
	}
	public GUID getXMZXGCID() {
		return XMZXGCID;
	}
	public void setXMZXGCID(GUID xMZXGCID) {
		XMZXGCID = xMZXGCID;
	}
	public int getYTHZJRS() {
		return YTHZJRS;
	}
	public void setYTHZJRS(int yTHZJRS) {
		YTHZJRS = yTHZJRS;
	}
	public int getYTHCS() {
		return YTHCS;
	}
	public void setYTHCS(int yTHCS) {
		YTHCS = yTHCS;
	}
	
}
