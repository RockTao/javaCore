package com.imooc.ChainOfResponsibilityPattern;


/**
 * 价格处理人，负责处理客户折扣申请
 * @author root
 * date: Aug 23, 2018 9:42:37 PM.<br/>
 */
public abstract class PriceHandler {
	/**
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}	
	
	/**
	 * 处理折扣申请
	 */
	public abstract void processDiscount(float discount) ;
}
