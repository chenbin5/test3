package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

/**
 * ѧԱ����
 * @author chang
 *
 */
public class StudentResumeBean {
	private GUID recid;//
	private String xyxm;//ѧԱ����
	private String mz;//����
	private String xl;//ѧ��
	private String sdzy;//����רҵ
	private String zy;//ְҵ
	private String lxdh;//��ϵ�绰
	private GUID ssglrecid;//�����������ϵ
	private boolean SFTG;//�Ƿ��������
	private String defineid;//����ģ�ͱ�ʶ
	
	private String lxxmmc;//��Ŀ����
	private String sbnd;//�걨���
	private String xybh;//ѧԱ���
	private String jgdwmc;//��Ŀ��������
	private String xmbh;//��Ŀ���
	private String sbxmlx;//��Ŀ����
	
	
	private int studentCount; //ѧ��������
	private int doctorNum; //��ʿ�о�����
	private int graduateNum; //˶ʿ�о�����
	private int bachelorNum; //��ѧ������
	private int specialistNum; //ר�Ƽ���������
	
	
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
