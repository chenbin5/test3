package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectCFBean {
	
	private GUID Recid;
	
	private String XMMC;
	
	private String XMDW;
	
	private GUID XMZXGCID;
	
	private String CFSJ;
	
	/**采风总次数**/
	private int CFZCS;
	
	/**采风总教师数量**/
	private int CFZJSSL;

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

	public GUID getXMZXGCID() {
		return XMZXGCID;
	}

	public void setXMZXGCID(GUID xMSSGCID) {
		XMZXGCID = xMSSGCID;
	}

	public String getCFSJ() {
		return CFSJ;
	}

	public void setCFSJ(String cFSJ) {
		CFSJ = cFSJ;
	}

	public int getCFZCS() {
		return CFZCS;
	}

	public void setCFZCS(int cFZCS) {
		CFZCS = cFZCS;
	}

	public int getCFZJSSL() {
		return CFZJSSL;
	}

	public void setCFZJSSL(int cFZJSSL) {
		CFZJSSL = cFZJSSL;
	}
}
