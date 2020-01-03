package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

/**
 * 学员简历
 * @author chang
 *
 */
public class StudentResumeBean {
	private GUID recid;//
	private String xyxm;//学员姓名
	private String mz;//民族
	private String xl;//学历
	private String sdzy;//所读专业
	private String zy;//职业
	private String lxdh;//联系电话
	private GUID ssglrecid;//跟主表关联关系
	private boolean SFTG;//是否符合条件
	private String defineid;//单据模型标识
	
	private String lxxmmc;//项目名称
	private String sbnd;//申报年度
	private String xybh;//学员编号
	private String jgdwmc;//项目主体名称
	private String xmbh;//项目编号
	private String sbxmlx;//项目类型
	
	
	private int studentCount; //学生总人数
	private int doctorNum; //博士研究生数
	private int graduateNum; //硕士研究生数
	private int bachelorNum; //大学本科数
	private int specialistNum; //专科及其他人数
	
	
	public String getJgdwmc() {
		return jgdwmc;
	}
	public void setJgdwmc(String jgdwmc) {
		this.jgdwmc = jgdwmc;
	}
	public String getXmbh() {
		return xmbh;
	}
	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}
	public String getSbxmlx() {
		return sbxmlx;
	}
	public void setSbxmlx(String sbxmlx) {
		this.sbxmlx = sbxmlx;
	}
	public String getXybh() {
		return xybh;
	}
	public void setXybh(String xybh) {
		this.xybh = xybh;
	}
	public String getSbnd() {
		return sbnd;
	}
	public void setSbnd(String sbnd) {
		this.sbnd = sbnd;
	}
	public String getLxxmmc() {
		return lxxmmc;
	}
	public void setLxxmmc(String lxxmmc) {
		this.lxxmmc = lxxmmc;
	}
	public String getDefineid() {
		return defineid;
	}
	public void setDefineid(String defineid) {
		this.defineid = defineid;
	}
	public GUID getSsglrecid() {
		return ssglrecid;
	}
	public void setSsglrecid(GUID ssglrecid) {
		this.ssglrecid = ssglrecid;
	}
	public GUID getRecid() {
		return recid;
	}
	public void setRecid(GUID recid) {
		this.recid = recid;
	}
	public String getXyxm() {
		return xyxm;
	}
	public void setXyxm(String xyxm) {
		this.xyxm = xyxm;
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
	public StudentResumeBean() {
		super();
	}
	public boolean isSFTG() {
		return SFTG;
	}
	public void setSFTG(boolean sFTG) {
		SFTG = sFTG;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	public int getDoctorNum() {
		return doctorNum;
	}
	public void setDoctorNum(int doctorNum) {
		this.doctorNum = doctorNum;
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
	public int getGraduateNum() {
		return graduateNum;
	}
	public void setGraduateNum(int graduateNum) {
		this.graduateNum = graduateNum;
	}
}
