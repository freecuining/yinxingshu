package com.yxs.util;

/**
 * 状态值类
 * @author asdcuining
 *
 */
public interface State {

	public static final int UNDELETE = 0;//未删除
	public static final int DELETE = 1;//已删除
	
	public static final int QIYONG = 0;//启用
	public static final int JINYONG = 1;//禁用
	
	public static final int PAGESIZE = 8;//每页显示8条
	public static final int PAGECOUNT = 5;//显示5个页码号
	
	public static final int PASS = 0; //审核通过    工资
	public static final int LOSER = 1; // 审核失败
	public static final int AUDITING = 2; //审核中
	public static final int DRAFT = 3;   //起草
}
