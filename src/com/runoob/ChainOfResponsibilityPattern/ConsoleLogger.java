package com.runoob.ChainOfResponsibilityPattern;

/**
 * 步骤 2
创建扩展了该记录器类的实体类。
 * @author root
 * date: Aug 23, 2018 9:37:56 PM.<br/>
 */

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {    
		System.out.println("Standard Console::Logger: " + message);
	}
}