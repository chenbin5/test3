package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectZLYCBean {

	private GUID recid;
	/**��Ŀ����*/
	private String XMMC;
	/**��Ŀ��λ*/
	private String SJ;
	/**�ص�*/
	private String DD;
	/**չ�����ݳ�����*/
	private String ZLHYCMC;
	/**��Ŀִ�й���*/
	private GUID XMZXGCID;
	/**��Ŀ��λ*/
	private String XMDW;
	
	/**չ���ݳ��ܳ���**/
	private int ZLYCZNUM;
	/**�ܹ�����**/
	private int ZGZRS;
	/**������**/
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
