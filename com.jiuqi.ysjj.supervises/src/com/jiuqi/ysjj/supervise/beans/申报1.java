package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class CreateZsyhBean {

	private GUID recid;
	private String xmbh;
	private String dlmm;
	private String sbxmlx;
	private String xmczlx;
	
	
	public String getXmczlx() {
		return xmczlx;
	}
	public void setXmczlx(String xmczlx) {
		this.xmczlx = xmczlx;
	}
	public String getSbxmlx() {
		return sbxmlx;
	}
	public void setSbxmlx(String sbxmlx) {
		this.sbxmlx = sbxmlx;
	}
	public GUID getRecid() {
		return recid;
	}
	public void setRecid(GUID recid) {
		this.recid = recid;
	}
	public String getXmbh() {
		return xmbh;
	}
	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}
	public String getDlmm() {
		return dlmm;
	}
	public void setDlmm(String dlmm) {
		this.dlmm = dlmm;
	}
	
	
}
