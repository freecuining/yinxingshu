package com.yxs.bean;

import java.util.Date;

public class ResumeBean {
	private int user_Id;//
    private int resume_Id;// 应聘职位编码
    private String name;//姓名
    private int resume_Sex;//性别
    private String resume_Email;//Email
    private String resume_Phone;//联系电话
    private String local_Address;//户口所在地
    private String Home_Assress;//住址
    private String political;//政治面貌
    private String card_Id;//身份证号
    private String salary_Require;//薪资要求
    private String graduate_school;//毕业院校
    private int education;//学历
    private String major;    //专业
    private int job_State;//是否在职
    private int fresh_Student;//是否是应届生
    private int work_Year;//工作经验
    private String person_Resume;//个人履历
    private String preson_File;//建立附件
    private int recommend_State;//招聘类型
    private Date recommend_time;//登记时间
    private String resommend_Idea;//面试意见
    private String interview_Result;//面试结果
    private int attribute_109;//
    private String attribute_105;//
    private int attribute_92; //   
	public ResumeBean(int user_Id, int resume_Id, String name, int resume_Sex, String resume_Email, String resume_Phone,
			String local_Address, String home_Assress, String political, String card_Id, String salary_Require,
			String graduate_school, int education, String major, int job_State, int fresh_Student, int work_Year,
			String person_Resume, String preson_File, int recommend_State, Date recommend_time, String resommend_Idea,
			String interview_Result, int attribute_109, String attribute_105, int attribute_92) {
		super();
		this.user_Id = user_Id;
		this.resume_Id = resume_Id;
		this.name = name;
		this.resume_Sex = resume_Sex;
		this.resume_Email = resume_Email;
		this.resume_Phone = resume_Phone;
		this.local_Address = local_Address;
		Home_Assress = home_Assress;
		this.political = political;
		this.card_Id = card_Id;
		this.salary_Require = salary_Require;
		this.graduate_school = graduate_school;
		this.education = education;
		this.major = major;
		this.job_State = job_State;
		this.fresh_Student = fresh_Student;
		this.work_Year = work_Year;
		this.person_Resume = person_Resume;
		this.preson_File = preson_File;
		this.recommend_State = recommend_State;
		this.recommend_time = recommend_time;
		this.resommend_Idea = resommend_Idea;
		this.interview_Result = interview_Result;
		this.attribute_109 = attribute_109;
		this.attribute_105 = attribute_105;
		this.attribute_92 = attribute_92;
	}
	public ResumeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public int getResume_Id() {
		return resume_Id;
	}
	public void setResume_Id(int resume_Id) {
		this.resume_Id = resume_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getResume_Sex() {
		return resume_Sex;
	}
	public void setResume_Sex(int resume_Sex) {
		this.resume_Sex = resume_Sex;
	}
	public String getResume_Email() {
		return resume_Email;
	}
	public void setResume_Email(String resume_Email) {
		this.resume_Email = resume_Email;
	}
	public String getResume_Phone() {
		return resume_Phone;
	}
	public void setResume_Phone(String resume_Phone) {
		this.resume_Phone = resume_Phone;
	}
	public String getLocal_Address() {
		return local_Address;
	}
	public void setLocal_Address(String local_Address) {
		this.local_Address = local_Address;
	}
	public String getHome_Assress() {
		return Home_Assress;
	}
	public void setHome_Assress(String home_Assress) {
		Home_Assress = home_Assress;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getCard_Id() {
		return card_Id;
	}
	public void setCard_Id(String card_Id) {
		this.card_Id = card_Id;
	}
	public String getSalary_Require() {
		return salary_Require;
	}
	public void setSalary_Require(String salary_Require) {
		this.salary_Require = salary_Require;
	}
	public String getGraduate_school() {
		return graduate_school;
	}
	public void setGraduate_school(String graduate_school) {
		this.graduate_school = graduate_school;
	}
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getJob_State() {
		return job_State;
	}
	public void setJob_State(int job_State) {
		this.job_State = job_State;
	}
	public int getFresh_Student() {
		return fresh_Student;
	}
	public void setFresh_Student(int fresh_Student) {
		this.fresh_Student = fresh_Student;
	}
	public int getWork_Year() {
		return work_Year;
	}
	public void setWork_Year(int work_Year) {
		this.work_Year = work_Year;
	}
	public String getPerson_Resume() {
		return person_Resume;
	}
	public void setPerson_Resume(String person_Resume) {
		this.person_Resume = person_Resume;
	}
	public String getPreson_File() {
		return preson_File;
	}
	public void setPreson_File(String preson_File) {
		this.preson_File = preson_File;
	}
	public int getRecommend_State() {
		return recommend_State;
	}
	public void setRecommend_State(int recommend_State) {
		this.recommend_State = recommend_State;
	}
	public Date getRecommend_time() {
		return recommend_time;
	}
	public void setRecommend_time(Date recommend_time) {
		this.recommend_time = recommend_time;
	}
	public String getResommend_Idea() {
		return resommend_Idea;
	}
	public void setResommend_Idea(String resommend_Idea) {
		this.resommend_Idea = resommend_Idea;
	}
	public String getInterview_Result() {
		return interview_Result;
	}
	public void setInterview_Result(String interview_Result) {
		this.interview_Result = interview_Result;
	}
	public int getAttribute_109() {
		return attribute_109;
	}
	public void setAttribute_109(int attribute_109) {
		this.attribute_109 = attribute_109;
	}
	public String getAttribute_105() {
		return attribute_105;
	}
	public void setAttribute_105(String attribute_105) {
		this.attribute_105 = attribute_105;
	}
	public int getAttribute_92() {
		return attribute_92;
	}
	public void setAttribute_92(int attribute_92) {
		this.attribute_92 = attribute_92;
	}


    
}
