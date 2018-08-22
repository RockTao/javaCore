package com.imooc.adaptModel;


public class NoteBook {

	private ThreePlugIf plug;
	
	public NoteBook(ThreePlugIf plug) {
		this.plug = plug;
		
	}
	
	// 使用插座充电
	public void charge() {
		plug.powerWithThree();
	}
	
	public static void main(String[] args) {
		GBTwoPlug two= new GBTwoPlug();
		ThreePlugIf three  = new TwoPlugAdapter(two);
		NoteBook nBook= new NoteBook(three);
		nBook.charge();
		
		
		System.out.println("---------------");
		three = new TwoPlugAdapterExtends();
		nBook = new NoteBook(three);
		nBook.charge();
	}
}
