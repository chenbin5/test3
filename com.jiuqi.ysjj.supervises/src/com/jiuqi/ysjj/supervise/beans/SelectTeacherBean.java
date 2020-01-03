package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

/**
 * 教师名单
 * @author 
 *
 */
public class SelectTeacherBean {
	private GUID recid;//
	private String jsxm;//教师姓名
	private String mz;//民族
	private String xl;//学历
	private String sdzy;//所读专业
	private String zy;//职业
	private String lxdh;//联系电话
	private GUID ssglrecid;//跟主表关联关系
	private String XB;//性别
	private boolean SFTG;//是否符合条件
	
	private String ZJLX;//证件类型
	private String ZJHM;//证件号码
	private String State;//学员状态
	private String ZC;//职称
	
	private String defineid;//单据标识
	
	public GUID getRecid() {
		return recid;
	}
	public void setRecid(GUID recid) {
		this.recid = recid;
	}
	public String getJsxm() {
		return jsxm;
	}
	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}
	public String getMz() {
		return mz;
	}
	public void setMz(String mz) {
		this.mz = mz;
	}
	public String getXl() {
		return xl;
	}
	public void setXl(String xl) {
		this.xl = xl;
	}
	public String getSdzy() {
		return sdzy;
	}
	public void setSdzy(String sdzy) {
		this.sdzy = sdzy;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public GUID getSsglrecid() {
		return ssglrecid;
	}
	public void setSsglrecid(GUID ssglrecid) {
		this.ssglrecid = ssglrecid;
	}
	public boolean isSFTG() {
		return SFTG;
	}
	public void setSFTG(boolean sFTG) {
		SFTG = sFTG;
	}
	public String getZJLX() {
		return ZJLX;
	}
	public void setZJLX(String zJLX) {
		ZJLX = zJLX;
	}
	public String getZJHM() {
		return ZJHM;
	}
	public void setZJHM(String zJHM) {
		ZJHM = zJHM;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZC() {
		return ZC;
	}
	public void setZC(String zC) {
		ZC = zC;
	}
	public String getDefineid() {
		return defineid;
	}
	public void setDefineid(String defineid) {
		this.defineid = defineid;
	}
	public String getXB() {
		return XB;
	}
	public void setXB(String xB) {
		XB = xB;
	}
	
	
	
	
	
	
	

}
