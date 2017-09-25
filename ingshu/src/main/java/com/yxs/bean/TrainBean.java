/*
 * 培训Bean层
 * 
 */
package com.yxs.bean;

import java.io.Serializable;

public class TrainBean  implements Serializable {
   private int  traId;
   private String traName;//培训名称
   private  String traTeacher;//培训老师
   private String  traStateTime;//培训开始时间
   private  String  traEddTime;//培训结束时间
   private  String  traRequired;//培训目的
   private  String  traIntro;//培训简介
   private String   traResouce;//培训资料
   private  String  traState;//审核状态
   private  String  traOpinion;//审核意见
   private  int  traResult;//培训反馈（状态值     优     良   差）
   private  String  trasummary;//培训总结
   private  String  evaluationResult;//考核结果
   
public TrainBean(int traId, String traName, String traTeacher, String traStateTime, String traEddTime,
		String traRequired, String traIntro, String traResouce, String traState, String traOpinion, int traResult,
		String trasummary, String evaluationResult) {
	super();
	this.traId = traId;
	this.traName = traName;
	this.traTeacher = traTeacher;
	this.traStateTime = traStateTime;
	this.traEddTime = traEddTime;
	this.traRequired = traRequired;
	this.traIntro = traIntro;
	this.traResouce = traResouce;
	this.traState = traState;
	this.traOpinion = traOpinion;
	this.traResult = traResult;
	this.trasummary = trasummary;
	this.evaluationResult = evaluationResult;
}
public TrainBean() {
	super();
	// TODO Auto-generated constructor stub
}
public int getTraId() {
	return traId;
}
public void setTraId(int traId) {
	this.traId = traId;
}
public String getTraName() {
	return traName;
}
public void setTraName(String traName) {
	this.traName = traName;
}
public String getTraTeacher() {
	return traTeacher;
}
public void setTraTeacher(String traTeacher) {
	this.traTeacher = traTeacher;
}
public String getTraStateTime() {
	return traStateTime;
}
public void setTraStateTime(String traStateTime) {
	this.traStateTime = traStateTime;
}
public String getTraEddTime() {
	return traEddTime;
}
public void setTraEddTime(String traEddTime) {
	this.traEddTime = traEddTime;
}
public String getTraRequired() {
	return traRequired;
}
public void setTraRequired(String traRequired) {
	this.traRequired = traRequired;
}
public String getTraIntro() {
	return traIntro;
}
public void setTraIntro(String traIntro) {
	this.traIntro = traIntro;
}
public String getTraResouce() {
	return traResouce;
}
public void setTraResouce(String traResouce) {
	this.traResouce = traResouce;
}
public String getTraState() {
	return traState;
}
public void setTraState(String traState) {
	this.traState = traState;
}
public String getTraOpinion() {
	return traOpinion;
}
public void setTraOpinion(String traOpinion) {
	this.traOpinion = traOpinion;
}
public int getTraResult() {
	return traResult;
}
public void setTraResult(int traResult) {
	this.traResult = traResult;
}
public String getTrasummary() {
	return trasummary;
}
public void setTrasummary(String trasummary) {
	this.trasummary = trasummary;
}
public String getEvaluationResult() {
	return evaluationResult;
}
public void setEvaluationResult(String evaluationResult) {
	this.evaluationResult = evaluationResult;
}
   
   
}
