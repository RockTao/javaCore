package com.imooc.adaptModel;


/**
 *二相转三相插座适配器
 * @author root
 *
 */
public class TwoPlugAdapter implements ThreePlugIf {
	
	private GBTwoPlug plug;
	
	 public TwoPlugAdapter( GBTwoPlug plug) {
		 this.plug = plug;
	}
	@Override
	public void powerWithThree() {
		System.out.println("通过转换");
		plug.powerWithTwo();

	}

}
