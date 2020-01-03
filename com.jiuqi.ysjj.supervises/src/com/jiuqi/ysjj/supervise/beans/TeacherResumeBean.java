package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

/**
 * 教师简历
 * @author 李明泽
 *
 */
public class TeacherResumeBean {
	
	private GUID recid;
	
	private GUID ssglrecid;//跟主表关联关系
	
	private String XM;//姓名
	
	private String XB;//性别
	
	private String CSNY;//出生年月
	
	private String ZC;//职称
	
	private String XL;//学历
	
	private String CJGZSj;//参加工作时间
	
	private String XGZDW;//现工作单位
	
	private String ZYFX;//专业方向
	
	private String ZZMM;//政治面貌
	
	private String SFZHM;//身份证号码
	
	private String LXDH;//联系电话
	
	private int NL;//年龄
	
	private String YSJJCJ;//艺术简介成就
	
	private GUID XBID;//性别
	
	private String defineid;//单据模型标识
	
	private int teacherCount; //教师总人数
	
	private int teacherZgjCount; //正高级人数
	
	private int teacherFgjCount; //副高级人数
	
	private int teacherZjCount; //中级人数
	
	private int teacherQtCount; //其他人数
	
	private int teacherNoZc; //无职称人数
	
	private int doctorNum; //博士研究生数
	
	private int graduateNum; //硕士研究生数
	
	private int bachelorNum; //大学本科数
	
	private int specialistNum; //专科及其他人数
	
	public GUID getXBID() {
		return XBID;
	}

	public void setXBID(GUID xBID) {
		XBID = xBID;
	}

	public String getYSJJCJ() {
		return YSJJCJ;
	}

	public void setYSJJCJ(String ySJJCJ) {
		YSJJCJ = ySJJCJ;
	}

	public int getNL() {
		return NL;
	}

	public void setNL(int nL) {
		NL = nL;
	}

	public GUID getRecid() {
		return recid;
	}

	public void setRecid(GUID recid) {
		this.recid = recid;
	}

	public GUID getSsglrecid() {
		return ssglrecid;
	}

	public void setSsglrecid(GUID ssglrecid) {
		this.ssglrecid = ssglrecid;
	}

	public String getXM() {
		return XM;
	}

	

	public String getXB() {
		return XB;
	}

	public void setXB(String xB) {
		XB = xB;
	}

	public void setXM(String xM) {
		XM = xM;
	}

	public String getCSNY() {
		return CSNY;
	}

	public void setCSNY(String cSNY) {
		CSNY = cSNY;
	}

	public String getZC() {
		return ZC;
	}

	public void setZC(String zC) {
		ZC = zC;
	}

	public String getXL() {
		return XL;
	}

	public void setXL(String xL) {
		XL = xL;
	}

	public String getCJGZSj() {
		return CJGZSj;
	}

	public void setCJGZSj(String cJGZSj) {
		CJGZSj = cJGZSj;
	}

	public String getXGZDW() {
		return XGZDW;
	}

	public void setXGZDW(String xGZDW) {
		XGZDW = xGZDW;
	}

	public String getZYFX() {
		return ZYFX;
	}

	public void setZYFX(String zYFX) {
		ZYFX = zYFX;
	}

	public String getZZMM() {
		return ZZMM;
	}

	public void setZZMM(String zZMM) {
		ZZMM = zZMM;
	}

	public String getSFZHM() {
		return SFZHM;
	}

	public void setSFZHM(String sFZHM) {
		SFZHM = sFZHM;
	}

	public String getLXDH() {
		return LXDH;
	}

	public void setLXDH(String lXDH) {
		LXDH = lXDH;
	}

	public String getDefineid() {
		return defineid;
	}

	public void setDefineid(String defineid) {
		this.defineid = defineid;
	}

	public int getTeacherCount() {
		return teacherCount;
	}

	public void setTeacherCount(int teacherCount) {
		this.teacherCount = teacherCount;
	}

	public int getTeacherZgjCount() {
		return teacherZgjCount;
	}

	public void setTeacherZgjCount(int teacherZgjCount) {
		this.teacherZgjCount = teacherZgjCount;
	}

	public int getTeacherFgjCount() {
		return teacherFgjCount;
	}

	public void setTeacherFgjCount(int teacherFgjCount) {
		this.teacherFgjCount = teacherFgjCount;
	}

	public int getTeacherZjCount() {
		return teacherZjCount;
	}

	public void setTeacherZjCount(int teacherZjCount) {
		this.teacherZjCount = teacherZjCount;
	}

	public int getTeacherQtCount() {
		return teacherQtCount;
	}

	public void setTeacherQtCount(int teacherQtCount) {
		this.teacherQtCount = teacherQtCount;
	}

	public int getTeacherNoZc() {
		return teacherNoZc;
	}

	public void setTeacherNoZc(int teacherNoZc) {
		this.teacherNoZc = teacherNoZc;
	}

	public int getDoctorNum() {
		return doctorNum;
	}

	public void setDoctorNum(int doctorNum) {
		this.doctorNum = doctorNum;
	}

	public int getGraduateNum() {
		return graduateNum;
	}

	public void setGraduateNum(int graduateNum) {
		this.graduateNum = graduateNum;
	}

	public int getBachelorNum() {
		return bachelorNum;
	}

	public void setBachelorNum(int bachelorNum) {
		this.bachelorNum = bachelorNum;
	}

	public int getSpecialistNum() {
		return specialistNum;
	}

	public void setSpecialistNum(int specialistNum) {
		this.specialistNum = specialistNum;
	}
	
	
}
