package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectYTHBean {
	
	private GUID Recid;
	/**��Ŀ����*/
	private String XMMC;
	/**��Ŀ��λ*/
	private String XMDW;
	/**���ֻ�ʱ��*/
	private String YTHSJ;
	/**��Ŀִ�й���Recid*/
	private GUID XMZXGCID;
	
	/**���ֻ�ר������*/
	private int YTHZJRS;

	/**���ֻ����**/
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
