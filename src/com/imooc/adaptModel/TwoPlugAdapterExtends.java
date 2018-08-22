package com.imooc.adaptModel;


/**
 * 采用继承方式的层插座适配器
 * @author root
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		System.out.println("采用继承方式的层插座适配器");
		this.powerWithTwo();
		
	
	}

}
