package com.yxs.bean;

import java.io.Serializable;

public class SalaryBean implements Serializable {
	private int salaryId;      //工资id
	private String code;       //工资编号
	private String name;       //薪酬标准名称
	private String maker;	   //工资制作人
	private String register;   //工资登记人
	private String registerTime;       //登记时间
	private String basePay;    //基本工资
	private String addPay;     //绩效奖金
	private String trafficPay; //交通补助
	private String phonePay;   //电话补助
	private String footPay;    //餐补
	private String housePay;   //住房补助
	private String awayPay;    //出差补助
	private String overTimePay;       //加班补助
	private String salaryRemark;      //工资备注
	private int salaryTotal;   //工资总额
	private int salarySate;    //工资审核状态
	private int salaryDel;     //工资删除状态
	
	
	
	
	public SalaryBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SalaryBean(int salaryId, String code, String name, String maker, String register, String registerTime,
			String basePay, String addPay, String trafficPay, String phonePay, String footPay, String housePay,
			String awayPay, String overTimePay, String salaryRemark, int salaryTotal, int salarySate, int salaryDel) {
		super();
		this.salaryId = salaryId;
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.register = register;
		this.registerTime = registerTime;
		this.basePay = basePay;
		this.addPay = addPay;
		this.trafficPay = trafficPay;
		this.phonePay = phonePay;
		this.footPay = footPay;
		this.housePay = housePay;
		this.awayPay = awayPay;
		this.overTimePay = overTimePay;
		this.salaryRemark = salaryRemark;
		this.salaryTotal = salaryTotal;
		this.salarySate = salarySate;
		this.salaryDel = salaryDel;
	}
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getBasePay() {
		return basePay;
	}
	public void setBasePay(String basePay) {
		this.basePay = basePay;
	}
	public String getAddPay() {
		return addPay;
	}
	public void setAddPay(String addPay) {
		this.addPay = addPay;
	}
	public String getTrafficPay() {
		return trafficPay;
	}
	public void setTrafficPay(String trafficPay) {
		this.trafficPay = trafficPay;
	}
	public String getPhonePay() {
		return phonePay;
	}
	public void setPhonePay(String phonePay) {
		this.phonePay = phonePay;
	}
	public String getFootPay() {
		return footPay;
	}
	public void setFootPay(String footPay) {
		this.footPay = footPay;
	}
	public String getHousePay() {
		return housePay;
	}
	public void setHousePay(String housePay) {
		this.housePay = housePay;
	}
	public String getAwayPay() {
		return awayPay;
	}
	public void setAwayPay(String awayPay) {
		this.awayPay = awayPay;
	}
	public String getOverTimePay() {
		return overTimePay;
	}
	public void setOverTimePay(String overTimePay) {
		this.overTimePay = overTimePay;
	}
	public String getSalaryRemark() {
		return salaryRemark;
	}
	public void setSalaryRemark(String salaryRemark) {
		this.salaryRemark = salaryRemark;
	}
	public int getSalaryTotal() {
		return salaryTotal;
	}
	public void setSalaryTotal(int salaryTotal) {
		this.salaryTotal = salaryTotal;
	}
	public int getSalarySate() {
		return salarySate;
	}
	public void setSalarySate(int salarySate) {
		this.salarySate = salarySate;
	}
	public int getSalaryDel() {
		return salaryDel;
	}
	public void setSalaryDel(int salaryDel) {
		this.salaryDel = salaryDel;
	}


	@Override
	public String toString() {
		return "SalaryBean [salaryId=" + salaryId + ", code=" + code + ", name=" + name + ", maker=" + maker
				+ ", register=" + register + ", registerTime=" + registerTime + ", basePay=" + basePay + ", addPay="
				+ addPay + ", trafficPay=" + trafficPay + ", phonePay=" + phonePay + ", footPay=" + footPay
				+ ", housePay=" + housePay + ", awayPay=" + awayPay + ", overTimePay=" + overTimePay + ", salaryRemark="
				+ salaryRemark + ", salaryTotal=" + salaryTotal + ", salarySate=" + salarySate + ", salaryDel="
				+ salaryDel + "]";
	}
	
	
	

}
