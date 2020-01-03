package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectProjectBean {
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
	
	private String SKDWMC;//收款单位名称
	private String SKDWZH;//收款单位账号
	private String KHHMC;//开户行名称
	private String KHHHH;//开户行行号
	private Double PXF_SBKYS;//培训费首笔款预算
	private Double JSSKF_SBKYS;//教师授课费首笔款预算
	private Double CSZLF_SBKYS;//场所租赁费首笔款预算
	private Double CLF_SBKYS;//材料费首笔款预算
	private Double JTF_SBKYS;//交通费首笔款预算
	private Double ZSF_SBKYS;//住宿费首笔款预算
	private Double HSF_SBKYS;//伙食费首笔款预算
	private Double PXFQT_SBKYS;//培训费其他首笔款预算
	private Double SJF_SBKYS;//实践费首笔款预算
	private Double CPYCF_SBKYS;//彩排演出费首笔款预算
	private Double BZZLF_SBKYS;//布展展览费首笔款预算
	private Double KCSXF_SBKYS;//考察实习费首笔款预算
	private Double SJFQT_SBKYS;//实践费其他首笔款预算
	private Double JJZZED;//基金资助额度
	private GUID SF;//省份
	private String RCPYXMLX;//人才培养项目类型
	private Integer JZPXSJ;//集中培训时间（天）
	private Integer PXZSC;//培训总时长（天）
	private String XMLXRXM;//项目联系人姓名
	private String XMLXRGDDH;//项目联系人固定电话
	private Integer PXRS;//培训人数
	
	
	
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
	public String getXMLXRXM() {
		return XMLXRXM;
	}
	public void setXMLXRXM(String xMLXRXM) {
		XMLXRXM = xMLXRXM;
	}
	public String getXMLXRGDDH() {
		return XMLXRGDDH;
	}
	public void setXMLXRGDDH(String xMLXRGDDH) {
		XMLXRGDDH = xMLXRGDDH;
	}
	public String getRCPYXMLX() {
		return RCPYXMLX;
	}
	public void setRCPYXMLX(String rCPYXMLX) {
		RCPYXMLX = rCPYXMLX;
	}
	public GUID getSF() {
		return SF;
	}
	public void setSF(GUID sF) {
		SF = sF;
	}
	public Double getJJZZED() {
		return JJZZED;
	}
	public void setJJZZED(Double jJZZED) {
		JJZZED = jJZZED;
	}
	public Double getJSSKF_SBKYS() {
		return JSSKF_SBKYS;
	}
	public void setJSSKF_SBKYS(Double jSSKF_SBKYS) {
		JSSKF_SBKYS = jSSKF_SBKYS;
	}
	public Double getCSZLF_SBKYS() {
		return CSZLF_SBKYS;
	}
	public void setCSZLF_SBKYS(Double cSZLF_SBKYS) {
		CSZLF_SBKYS = cSZLF_SBKYS;
	}
	public Double getCLF_SBKYS() {
		return CLF_SBKYS;
	}
	public void setCLF_SBKYS(Double cLF_SBKYS) {
		CLF_SBKYS = cLF_SBKYS;
	}
	public Double getJTF_SBKYS() {
		return JTF_SBKYS;
	}
	public void setJTF_SBKYS(Double jTF_SBKYS) {
		JTF_SBKYS = jTF_SBKYS;
	}
	public Double getZSF_SBKYS() {
		return ZSF_SBKYS;
	}
	public void setZSF_SBKYS(Double zSF_SBKYS) {
		ZSF_SBKYS = zSF_SBKYS;
	}
	public Double getHSF_SBKYS() {
		return HSF_SBKYS;
	}
	public void setHSF_SBKYS(Double hSF_SBKYS) {
		HSF_SBKYS = hSF_SBKYS;
	}
	public Double getPXFQT_SBKYS() {
		return PXFQT_SBKYS;
	}
	public void setPXFQT_SBKYS(Double pXFQT_SBKYS) {
		PXFQT_SBKYS = pXFQT_SBKYS;
	}
	public Double getSJF_SBKYS() {
		return SJF_SBKYS;
	}
	public void setSJF_SBKYS(Double sJF_SBKYS) {
		SJF_SBKYS = sJF_SBKYS;
	}
	public Double getCPYCF_SBKYS() {
		return CPYCF_SBKYS;
	}
	public void setCPYCF_SBKYS(Double cPYCF_SBKYS) {
		CPYCF_SBKYS = cPYCF_SBKYS;
	}
	public Double getBZZLF_SBKYS() {
		return BZZLF_SBKYS;
	}
	public void setBZZLF_SBKYS(Double bZZLF_SBKYS) {
		BZZLF_SBKYS = bZZLF_SBKYS;
	}
	public Double getKCSXF_SBKYS() {
		return KCSXF_SBKYS;
	}
	public void setKCSXF_SBKYS(Double kCSXF_SBKYS) {
		KCSXF_SBKYS = kCSXF_SBKYS;
	}
	public Double getSJFQT_SBKYS() {
		return SJFQT_SBKYS;
	}
	public void setSJFQT_SBKYS(Double sJFQT_SBKYS) {
		SJFQT_SBKYS = sJFQT_SBKYS;
	}
	public String getKHHMC() {
		return KHHMC;
	}
	public void setKHHMC(String kHHMC) {
		KHHMC = kHHMC;
	}
	public String getKHHHH() {
		return KHHHH;
	}
	public void setKHHHH(String kHHHH) {
		KHHHH = kHHHH;
	}
	public Double getPXF_SBKYS() {
		return PXF_SBKYS;
	}
	public void setPXF_SBKYS(Double pXF_SBKYS) {
		PXF_SBKYS = pXF_SBKYS;
	}
	public String getSKDWMC() {
		return SKDWMC;
	}
	public void setSKDWMC(String sKDWMC) {
		SKDWMC = sKDWMC;
	}
	public String getSKDWZH() {
		return SKDWZH;
	}
	public void setSKDWZH(String sKDWZH) {
		SKDWZH = sKDWZH;
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
	
	public double getYBFJE() {
		return YBFJE;
	}
	public void setYBFJE(double yBFJE) {
		YBFJE = yBFJE;
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
	
	

	

}
