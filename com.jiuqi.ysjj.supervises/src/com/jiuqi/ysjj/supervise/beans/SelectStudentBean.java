package com.jiuqi.ysjj.supervise.beans;

import com.jiuqi.dna.core.type.GUID;

/**
 * ѧԱ����
 * @author chang
 *
 */
public class SelectStudentBean {
	private GUID recid;//
	private String xyxm;//ѧԱ����
	private String mz;//����
	private String xl;//ѧ��
	private String sdzy;//����רҵ
	private String zy;//ְҵ
	private String lxdh;//��ϵ�绰
	private GUID ssglrecid;//�����������ϵ
	private boolean SFTG;//�Ƿ��������
	
	private String ZJLX;//֤������
	private String ZJHM;//֤������
	private String State;//ѧԱ״̬
	
	private String defineid;//���ݱ�ʶ
	
	
	
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
	public SelectStudentBean() {
		super();
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
	
	

}
