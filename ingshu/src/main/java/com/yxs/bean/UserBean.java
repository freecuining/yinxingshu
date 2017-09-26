package com.yxs.bean;

import java.io.Serializable;

	public class UserBean implements Serializable{

		private int userId;//用户ID
		private int deptId;//部门ID
		private String userCode;//编码
		private String loginName;//登录账号
		private String password;//密码
		private String userName;//用户姓名
		private int sex;//性别
		private String idCard;//身份证
		private String phone;//办公电话
		private String mobilePhone;//手机
		private String userEmail;//邮箱
		private String address;//地址
		private String img;//头像图片
		private String userRemark;//备注
		private int loginCount;//登录次数
		private int del;
		private String addTime;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public String getUserCode() {
			return userCode;
		}
		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}
		public String getLoginName() {
			return loginName;
		}
		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getSex() {
			return sex;
		}
		public void setSex(int sex) {
			this.sex = sex;
		}
		public String getIdCard() {
			return idCard;
		}
		public void setIdCard(String idCard) {
			this.idCard = idCard;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getMobilePhone() {
			return mobilePhone;
		}
		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public String getUserRemark() {
			return userRemark;
		}
		public void setUserRemark(String userRemark) {
			this.userRemark = userRemark;
		}
		public int getLoginCount() {
			return loginCount;
		}
		public void setLoginCount(int loginCount) {
			this.loginCount = loginCount;
		}
		public int getDel() {
			return del;
		}
		public void setDel(int del) {
			this.del = del;
		}
		public String getAddTime() {
			return addTime;
		}
		public void setAddTime(String addTime) {
			this.addTime = addTime;
		}
		public UserBean(int userId, int deptId, String userCode, String loginName, String password, String userName,
				int sex, String idCard, String phone, String mobilePhone, String userEmail, String address, String img,
				String userRemark, int loginCount, int del, String addTime) {
			super();
			this.userId = userId;
			this.deptId = deptId;
			this.userCode = userCode;
			this.loginName = loginName;
			this.password = password;
			this.userName = userName;
			this.sex = sex;
			this.idCard = idCard;
			this.phone = phone;
			this.mobilePhone = mobilePhone;
			this.userEmail = userEmail;
			this.address = address;
			this.img = img;
			this.userRemark = userRemark;
			this.loginCount = loginCount;
			this.del = del;
			this.addTime = addTime;
		}
		public UserBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	}