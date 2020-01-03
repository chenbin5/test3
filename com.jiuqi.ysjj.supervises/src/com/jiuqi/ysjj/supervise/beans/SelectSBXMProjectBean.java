package com.jiuqi.ysjj.supervise.beans;

import java.util.List;

import com.jiuqi.dna.core.type.GUID;

/**
 * 申报项目选择按钮实体类
 * @author 李明泽
 *
 */
public class SelectSBXMProjectBean {
	private GUID recid;  //项目申报表单据Recid
	private String JGDWMC;//机构（单位）名称
	private String XMBH;//项目编号(BILLCODE)
	private String XMMC;//项目名称
	private double SQJLZZJEXX;//申请奖励资助金额（小写）
	private double YBFJE;//项目已拨付金额
	private String SBXMLX;//申报项目类型
	private String YSML;//艺术门类
	private String XMCZLX;//项目创作类型
	private long XMTJRQ;//项目提交日期
	private String ZCD;//注册地(撤改记录)
	private String SFTBXM;//是否特别项目
	
	private String CHRY;//初核人员姓名
	private GUID CHRYID;//初核人员Recid
	private String FHRY;//复核人员姓名
	private GUID FHRYID;//复核人员Recid
	
	private GUID SSQY;//所属区域
	private String ZZJGDM;//组织机构代码
	private GUID SFTBXM1;//是否特别项目（GUID类型）
	
	private String sffpcs;//是否分配初审
	private String sffpfs;//是否分配复审
	
	
	private String XMSSDW;//项目实施单位
	private String PXDD;//培训地点
	private Integer PXRS;//培训人数
	private Integer PXZSC;//培训总时长（天）
	private Integer JZPXSJ;//集中培训时间（天）
	private Integer ZSRS;//招生人数
	private String RCPYXMLX;//人才培养项目类型
	private GUID rcpyxmlxid;
	private GUID ysmlid;
	
	private String XMFZRXM;//项目负责人姓名
	private GUID XMFZRXB;//项目负责人性别
	private String XMFZRZW;//项目负责人职务
	private String XMFZRDZYX;//项目负责人电子邮箱
	private String XMFZRGDDH;//项目负责人固定电话
	private String XMFZRSJ;//项目负责人手机
	private String XMFZRGZDW;//项目负责人工作单位
	private String XMFZRTXDZ;//项目负责人通讯地址
	
	private String XMLXRXM;//项目联系人姓名
	private GUID XMLXRXB;//项目联系人性别
	private String XMLXRZW;//项目联系人职务
	private String XMLXRDZYX;//项目联系人电子邮箱
	private String XMLXRGDDH;//项目联系人固定电话
	private String XMLXRSJ;//项目联系人手机
	private String XMLXRGZDW;//项目联系人工作单位
	private String XMLXRTXDZ;//项目联系人通讯地址
	
	private GUID SF;//省份
	
	private List<TeacherResumeBean> teacherBean;//教师信息
	
	
	
	
	
	public List<TeacherResumeBean> getTeacherBean() {
		return teacherBean;
	}
	public void setTeacherBean(List<TeacherResumeBean> teacherBean) {
		this.teacherBean = teacherBean;
	}
	public GUID getSF() {
		return SF;
	}
	public void setSF(GUID sF) {
		SF = sF;
	}
	public GUID getRcpyxmlxid() {
		return rcpyxmlxid;
	}
	public void setRcpyxmlxid(GUID rcpyxmlxid) {
		this.rcpyxmlxid = rcpyxmlxid;
	}
	public GUID getYsmlid() {
		return ysmlid;
	}
	public void setYsmlid(GUID ysmlid) {
		this.ysmlid = ysmlid;
	}
	public String getRCPYXMLX() {
		return RCPYXMLX;
	}
	public void setRCPYXMLX(String rCPYXMLX) {
		RCPYXMLX = rCPYXMLX;
	}
	public GUID getRecid() {
		return recid;
	}
	public void setRecid(GUID recid) {
		this.recid = recid;
	}
	public String getJGDWMC() {
		return JGDWMC;
	}
	public void setJGDWMC(String jGDWMC) {
		JGDWMC = jGDWMC;
	}
	public String getXMBH() {
		return XMBH;
	}
	public void setXMBH(String xMBH) {
		XMBH = xMBH;
	}
	public String getXMMC() {
		return XMMC;
	}
	public void setXMMC(String xMMC) {
		XMMC = xMMC;
	}
	public double getSQJLZZJEXX() {
		return SQJLZZJEXX;
	}
	public void setSQJLZZJEXX(double sQJLZZJEXX) {
		SQJLZZJEXX = sQJLZZJEXX;
	}
	public double getYBFJE() {
		return YBFJE;
	}
	public void setYBFJE(double yBFJE) {
		YBFJE = yBFJE;
	}
	public String getSBXMLX() {
		return SBXMLX;
	}
	public void setSBXMLX(String sBXMLX) {
		SBXMLX = sBXMLX;
	}
	public String getYSML() {
		return YSML;
	}
	public void setYSML(String ySML) {
		YSML = ySML;
	}
	public String getXMCZLX() {
		return XMCZLX;
	}
	public void setXMCZLX(String xMCZLX) {
		XMCZLX = xMCZLX;
	}
	public long getXMTJRQ() {
		return XMTJRQ;
	}
	public void setXMTJRQ(long xMTJRQ) {
		XMTJRQ = xMTJRQ;
	}
	public String getZCD() {
		return ZCD;
	}
	public void setZCD(String zCD) {
		ZCD = zCD;
	}
	public String getSFTBXM() {
		return SFTBXM;
	}
	public void setSFTBXM(String sFTBXM) {
		SFTBXM = sFTBXM;
	}
	public String getCHRY() {
		return CHRY;
	}
	public void setCHRY(String cHRY) {
		CHRY = cHRY;
	}
	public GUID getCHRYID() {
		return CHRYID;
	}
	public void setCHRYID(GUID cHRYID) {
		CHRYID = cHRYID;
	}
	public String getFHRY() {
		return FHRY;
	}
	public void setFHRY(String fHRY) {
		FHRY = fHRY;
	}
	public GUID getFHRYID() {
		return FHRYID;
	}
	public void setFHRYID(GUID fHRYID) {
		FHRYID = fHRYID;
	}
	public GUID getSSQY() {
		return SSQY;
	}
	public void setSSQY(GUID sSQY) {
		SSQY = sSQY;
	}
	public String getZZJGDM() {
		return ZZJGDM;
	}
	public void setZZJGDM(String zZJGDM) {
		ZZJGDM = zZJGDM;
	}
	public GUID getSFTBXM1() {
		return SFTBXM1;
	}
	public void setSFTBXM1(GUID sFTBXM1) {
		SFTBXM1 = sFTBXM1;
	}
	public String getSffpcs() {
		return sffpcs;
	}
	public void setSffpcs(String sffpcs) {
		this.sffpcs = sffpcs;
	}
	public String getSffpfs() {
		return sffpfs;
	}
	public void setSffpfs(String sffpfs) {
		this.sffpfs = sffpfs;
	}
	public String getXMSSDW() {
		return XMSSDW;
	}
	public void setXMSSDW(String xMSSDW) {
		XMSSDW = xMSSDW;
	}
	public String getPXDD() {
		return PXDD;
	}
	public void setPXDD(String pXDD) {
		PXDD = pXDD;
	}
	public Integer getPXRS() {
		return PXRS;
	}
	public void setPXRS(Integer pXRS) {
		PXRS = pXRS;
	}
	public Integer getPXZSC() {
		return PXZSC;
	}
	public void setPXZSC(Integer pXZSC) {
		PXZSC = pXZSC;
	}
	public Integer getJZPXSJ() {
		return JZPXSJ;
	}
	public void setJZPXSJ(Integer jZPXSJ) {
		JZPXSJ = jZPXSJ;
	}
	public Integer getZSRS() {
		return ZSRS;
	}
	public void setZSRS(Integer zSRS) {
		ZSRS = zSRS;
	}
	public String getXMFZRXM() {
		return XMFZRXM;
	}
	public void setXMFZRXM(String xMFZRXM) {
		XMFZRXM = xMFZRXM;
	}
	public GUID getXMFZRXB() {
		return XMFZRXB;
	}
	public void setXMFZRXB(GUID xMFZRXB) {
		XMFZRXB = xMFZRXB;
	}
	public String getXMFZRZW() {
		return XMFZRZW;
	}
	public void setXMFZRZW(String xMFZRZW) {
		XMFZRZW = xMFZRZW;
	}
	public String getXMFZRDZYX() {
		return XMFZRDZYX;
	}
	public void setXMFZRDZYX(String xMFZRDZYX) {
		XMFZRDZYX = xMFZRDZYX;
	}
	public String getXMFZRGDDH() {
		return XMFZRGDDH;
	}
	public void setXMFZRGDDH(String xMFZRGDDH) {
		XMFZRGDDH = xMFZRGDDH;
	}
	public String getXMFZRSJ() {
		return XMFZRSJ;
	}
	public void setXMFZRSJ(String xMFZRSJ) {
		XMFZRSJ = xMFZRSJ;
	}
	public String getXMFZRGZDW() {
		return XMFZRGZDW;
	}
	public void setXMFZRGZDW(String xMFZRGZDW) {
		XMFZRGZDW = xMFZRGZDW;
	}
	public String getXMFZRTXDZ() {
		return XMFZRTXDZ;
	}
	public void setXMFZRTXDZ(String xMFZRTXDZ) {
		XMFZRTXDZ = xMFZRTXDZ;
	}
	public String getXMLXRXM() {
		return XMLXRXM;
	}
	public void setXMLXRXM(String xMLXRXM) {
		XMLXRXM = xMLXRXM;
	}
	public GUID getXMLXRXB() {
		return XMLXRXB;
	}
	public void setXMLXRXB(GUID xMLXRXB) {
		XMLXRXB = xMLXRXB;
	}
	public String getXMLXRZW() {
		return XMLXRZW;
	}
	public void setXMLXRZW(String xMLXRZW) {
		XMLXRZW = xMLXRZW;
	}
	public String getXMLXRDZYX() {
		return XMLXRDZYX;
	}
	public void setXMLXRDZYX(String xMLXRDZYX) {
		XMLXRDZYX = xMLXRDZYX;
	}
	public String getXMLXRGDDH() {
		return XMLXRGDDH;
	}
	public void setXMLXRGDDH(String xMLXRGDDH) {
		XMLXRGDDH = xMLXRGDDH;
	}
	public String getXMLXRSJ() {
		return XMLXRSJ;
	}
	public void setXMLXRSJ(String xMLXRSJ) {
		XMLXRSJ = xMLXRSJ;
	}
	public String getXMLXRGZDW() {
		return XMLXRGZDW;
	}
	public void setXMLXRGZDW(String xMLXRGZDW) {
		XMLXRGZDW = xMLXRGZDW;
	}
	public String getXMLXRTXDZ() {
		return XMLXRTXDZ;
	}
	public void setXMLXRTXDZ(String xMLXRTXDZ) {
		XMLXRTXDZ = xMLXRTXDZ;
	}
	
	
	

	

}
