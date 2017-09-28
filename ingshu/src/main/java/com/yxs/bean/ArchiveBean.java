package com.yxs.bean;

import java.io.Serializable;

public class ArchiveBean implements Serializable {

	private Integer archiveId;//档案ID
	private String  archiveCode;//档案编码
	private String archiveTime;//档案日期
	private Integer auditState;//审核状态
	private Integer archiveState;//档案状态
	private String bank;//开户行
	private String bankCard;//银行卡号
	private String socialCard;//社保卡号
	private String familyInfor;//家庭关系信息
	private String positiveTime;//建档时间
	private String leaveTime;//离开时间
	private String hireDate;//雇用时间
	private String transferPosition;//调岗时间
	private Integer del;//操作状态
	private String idCard;//身份证号
	private DeptBean db;
	private UserBean ub;
	private RoleBean rb;
	private SalaryBean sb;
	private ResumeBean rsb;
	
	public Integer getArchiveId() {
		return archiveId;
	}
	public void setArchiveId(Integer archiveId) {
		this.archiveId = archiveId;
	}
	public String getArchiveCode() {
		return archiveCode;
	}
	public void setArchiveCode(String archiveCode) {
		this.archiveCode = archiveCode;
	}
	public String getArchiveTime() {
		return archiveTime;
	}
	public void setArchiveTime(String archiveTime) {
		this.archiveTime = archiveTime;
	}
	public Integer getAuditState() {
		return auditState;
	}
	public void setAuditState(Integer auditState) {
		this.auditState = auditState;
	}
	public Integer getArchiveState() {
		return archiveState;
	}
	public void setArchiveState(Integer archiveState) {
		this.archiveState = archiveState;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getSocialCard() {
		return socialCard;
	}
	public void setSocialCard(String socialCard) {
		this.socialCard = socialCard;
	}
	public String getFamilyInfor() {
		return familyInfor;
	}
	public void setFamilyInfor(String familyInfor) {
		this.familyInfor = familyInfor;
	}
	public String getPositiveTime() {
		return positiveTime;
	}
	public void setPositiveTime(String positiveTime) {
		this.positiveTime = positiveTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getTransferPosition() {
		return transferPosition;
	}
	public void setTransferPosition(String transferPosition) {
		this.transferPosition = transferPosition;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	public DeptBean getDb() {
		return db;
	}
	public void setDb(DeptBean db) {
		this.db = db;
	}
	public UserBean getUb() {
		return ub;
	}
	public void setUb(UserBean ub) {
		this.ub = ub;
	}
	public RoleBean getRb() {
		return rb;
	}
	public void setRb(RoleBean rb) {
		this.rb = rb;
	}
	public SalaryBean getSb() {
		return sb;
	}
	public void setSb(SalaryBean sb) {
		this.sb = sb;
	}
	public ResumeBean getRsb() {
		return rsb;
	}
	public void setRsb(ResumeBean rsb) {
		this.rsb = rsb;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
}