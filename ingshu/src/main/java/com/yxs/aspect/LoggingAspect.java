package com.yxs.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 记录相关dao方法的日志
 * @author asdcuining
 *
 */
@Aspect
@Component
public class LoggingAspect {

	private Logger log = Logger.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(* com.xhhy.dao.*.*(..))")
	public void expre(){}
	
	@Before("expre()")
	public void beforeMethod(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		String className = jp.getTarget().getClass().getName();
		log.warn("=============="+className+"类的"+methodName+"方法开始执行============");
	}
	
	@After("expre()")
	public void afterMethod(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		String className = jp.getTarget().getClass().getName();
		log.warn("=============="+className+"类的"+methodName+"执行完毕============");
	}
}
