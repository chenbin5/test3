package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

public class SelectProjectBean {
	private GUID recid;  //��Ŀ�걨����Recid
	private String JGDWMC;//��������λ������
	private String XMBH;//��Ŀ���(BILLCODE)
	private String XMMC;//��Ŀ����
	private double SQJLZZJEXX;//���뽱��������Сд��
	private double YBFJE;//��Ŀ�Ѳ������
	private String SBXMLX;//�걨��Ŀ����
	private String YSML;//��������
	private String XMCZLX;//��Ŀ��������
	private long XMTJRQ;//��Ŀ�ύ����
	private String ZCD;//ע���(���ļ�¼)
	private String SFTBXM;//�Ƿ��ر���Ŀ
	
	private String CHRY;//������Ա����
	private GUID CHRYID;//������ԱRecid
	private String FHRY;//������Ա����
	private GUID FHRYID;//������ԱRecid
	
	private GUID SSQY;//��������
	private String ZZJGDM;//��֯��������
	private GUID SFTBXM1;//�Ƿ��ر���Ŀ��GUID���ͣ�
	
	private String sffpcs;//�Ƿ�������
	private String sffpfs;//�Ƿ���临��
	
	private String SKDWMC;//�տλ����
	private String SKDWZH;//�տλ�˺�
	private String KHHMC;//����������
	private String KHHHH;//�������к�
	private Double PXF_SBKYS;//��ѵ���ױʿ�Ԥ��
	private Double JSSKF_SBKYS;//��ʦ�ڿη��ױʿ�Ԥ��
	private Double CSZLF_SBKYS;//�������޷��ױʿ�Ԥ��
	private Double CLF_SBKYS;//���Ϸ��ױʿ�Ԥ��
	private Double JTF_SBKYS;//��ͨ���ױʿ�Ԥ��
	private Double ZSF_SBKYS;//ס�޷��ױʿ�Ԥ��
	private Double HSF_SBKYS;//��ʳ���ױʿ�Ԥ��
	private Double PXFQT_SBKYS;//��ѵ�������ױʿ�Ԥ��
	private Double SJF_SBKYS;//ʵ�����ױʿ�Ԥ��
	private Double CPYCF_SBKYS;//�����ݳ����ױʿ�Ԥ��
	private Double BZZLF_SBKYS;//��չչ�����ױʿ�Ԥ��
	private Double KCSXF_SBKYS;//����ʵϰ���ױʿ�Ԥ��
	private Double SJFQT_SBKYS;//ʵ���������ױʿ�Ԥ��
	private Double JJZZED;//�����������
	private GUID SF;//ʡ��
	private String RCPYXMLX;//�˲�������Ŀ����
	private Integer JZPXSJ;//������ѵʱ�䣨�죩
	private Integer PXZSC;//��ѵ��ʱ�����죩
	private String XMLXRXM;//��Ŀ��ϵ������
	private String XMLXRGDDH;//��Ŀ��ϵ�˹̶��绰
	private Integer PXRS;//��ѵ����
	
	
	
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
