package com.imooc.ChainOfResponsibilityPattern;

import java.util.Random;

/**
 * 客户，折扣申请
 * @author root
 * date: Aug 23, 2018 9:52:08 PM.<br/>
 */
public class Customer {
	
	
	private PriceHandler prieHandler;
	public void setPrieHandler(PriceHandler prieHandler) {
		this.prieHandler = prieHandler;
	}
	public void  requestDiscount(float discount) {
		prieHandler.processDiscount(discount);
	}

	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPrieHandler(PriceHandlerFactory.createPriceHandler());
		
		Random rand = new Random();
		for(int i=1 ;i< 100;i++) {
			System.out.print("i="+ i);
			customer.requestDiscount(rand.nextFloat());
		}
		
	}
}
