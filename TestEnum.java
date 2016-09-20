package com.mayank.practice;

public enum TestEnum {
	ABC(1);
	@Override
	public String toString() {
		return "hello";
		
	}
	private int value;
	
	
	
	private TestEnum(int value) {
		this.value = value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEnum test  = TestEnum.ABC;
		System.out.println(test);

	}

}
