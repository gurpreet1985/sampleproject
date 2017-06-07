package com.selenium.overriding;

public class Test {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.getinterestrate();
		System.out.println(b.getinterestrate());
		
		Sbi sbi = new Sbi();
		sbi.getinterestrate();
		System.out.println(sbi.getinterestrate());
		
		Icic icic = new Icic();
		icic.getinterestrate();
		System.out.println(icic.getinterestrate());
		

	}

}
