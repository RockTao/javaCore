package com.imooc.ChainOfResponsibilityPattern;


/**
 * 销售ceo 55%的折扣
 * @author root
 * date: Aug 23, 2018 9:47:53 PM.<br/>
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <=0.55) {
			System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
		}else {
			System.out.format("%s拒绝了折扣：%.2f%n",this.getClass().getName(),discount);

		}
	}

}
