package com.imooc.ChainOfResponsibilityPattern;

public class PriceHandlerFactory {

	/**
	 * 创建PrieHandler的工厂方法
	 * 
	 * 
	 * 工厂方法在于返回值
	 * @return
	 */
		public static PriceHandler createPriceHandler() {
			PriceHandler sales= new Sales();
			PriceHandler lead= new Lead();
	
			PriceHandler man =new Manager();
			PriceHandler dir = new Director();
			PriceHandler vPrieHandler = new VicePresident();
			PriceHandler ceo= new CEO();
			sales.setSuccessor(lead);
			lead.setSuccessor(man);
			man.setSuccessor(dir);
			dir.setSuccessor(vPrieHandler);
			vPrieHandler.setSuccessor(ceo);
			
			return sales;
		}

}
