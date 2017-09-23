package com.yxs.util;

import java.util.Date;

/**
 * 定时器，定时向统计表中插入统计数据
 * @author asdcuining
 *
 */
public class JobUtil {

	private int counter = 0;

	// 这个类是在指定时间就会输出时间以及计数值
	protected void execute() {
		System.out.println(new Date());
		System.out.println("(" + counter++ + ")");
	}

}
