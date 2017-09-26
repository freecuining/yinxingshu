package com.yxs.bean;

import java.io.Serializable;

public class ArchiveBean implements Serializable {

	private Integer archiveId;//档案ID
	private Integer userId;//用户ID
	private Integer salaryId;//薪酬ID
	private String  archiveCode;//档案编码
	private String archivetime;//档案日期
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
	private Integer Del;//操作状态
	
	public ArchiveBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArchiveBean(Integer archiveId, Integer userId, Integer salaryId, String archiveCode, String archivetime,
			Integer auditState, Integer archiveState, String bank, String bankCard, String socialCard,
			String familyInfor, String positiveTime, String leaveTime, String hireDate, String transferPosition,
			Integer del) {
		super();
		this.archiveId = archiveId;
		this.userId = userId;
		this.salaryId = salaryId;
		this.archiveCode = archiveCode;
		this.archivetime = archivetime;
		this.auditState = auditState;
		this.archiveState = archiveState;
		this.bank = bank;
		this.bankCard = bankCard;
		this.socialCard = socialCard;
		this.familyInfor = familyInfor;
		this.positiveTime = positiveTime;
		this.leaveTime = leaveTime;
		this.hireDate = hireDate;
		this.transferPosition = transferPosition;
		Del = del;
	}
	public Integer getArchiveId() {
		return archiveId;
	}
	public void setArchiveId(Integer archiveId) {
		this.archiveId = archiveId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(Integer salaryId) {
		this.salaryId = salaryId;
	}
	public String getArchiveCode() {
		return archiveCode;
	}
	public void setArchiveCode(String archiveCode) {
		this.archiveCode = archiveCode;
	}
	public String getArchivetime() {
		return archivetime;
	}
	public void setArchivetime(String archivetime) {
		this.archivetime = archivetime;
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
		return Del;
	}
	public void setDel(Integer del) {
		Del = del;
	}
		
}
