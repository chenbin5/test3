package com.jiuqi.ysjj.supervise.beans;

import java.util.List;

import com.jiuqi.dna.core.type.GUID;

/**
 * �걨��Ŀѡ��ťʵ����
 * @author ������
 *
 */
public class SelectSBXMProjectBean {
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
	
	
	private String XMSSDW;//��Ŀʵʩ��λ
	private String PXDD;//��ѵ�ص�
	private Integer PXRS;//��ѵ����
	private Integer PXZSC;//��ѵ��ʱ�����죩
	private Integer JZPXSJ;//������ѵʱ�䣨�죩
	private Integer ZSRS;//��������
	private String RCPYXMLX;//�˲�������Ŀ����
	private GUID rcpyxmlxid;
	private GUID ysmlid;
	
	private String XMFZRXM;//��Ŀ����������
	private GUID XMFZRXB;//��Ŀ�������Ա�
	private String XMFZRZW;//��Ŀ������ְ��
	private String XMFZRDZYX;//��Ŀ�����˵�������
	private String XMFZRGDDH;//��Ŀ�����˹̶��绰
	private String XMFZRSJ;//��Ŀ�������ֻ�
	private String XMFZRGZDW;//��Ŀ�����˹�����λ
	private String XMFZRTXDZ;//��Ŀ������ͨѶ��ַ
	
	private String XMLXRXM;//��Ŀ��ϵ������
	private GUID XMLXRXB;//��Ŀ��ϵ���Ա�
	private String XMLXRZW;//��Ŀ��ϵ��ְ��
	private String XMLXRDZYX;//��Ŀ��ϵ�˵�������
	private String XMLXRGDDH;//��Ŀ��ϵ�˹̶��绰
	private String XMLXRSJ;//��Ŀ��ϵ���ֻ�
	private String XMLXRGZDW;//��Ŀ��ϵ�˹�����λ
	private String XMLXRTXDZ;//��Ŀ��ϵ��ͨѶ��ַ
	
	private GUID SF;//ʡ��
	
	private List<TeacherResumeBean> teacherBean;//��ʦ��Ϣ
	
	
	
	
	
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
