package com.imooc.ChainOfResponsibilityPattern;


/**
 * 销售小组长   15%的折扣
 * @author root
 * date: Aug 23, 2018 9:47:53 PM.<br/>
 */
public class Lead extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <=0.15) {
			System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
		}else {
			successor.processDiscount(discount);
		}
	}

}
