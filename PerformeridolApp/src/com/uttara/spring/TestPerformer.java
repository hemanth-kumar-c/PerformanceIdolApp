package com.uttara.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()-> starting");
		
		System.out.println("main()-> starting.. Spring Container");
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("main()-> started.... Spring Container");
		Performer p1= (Performer) ctx.getBean("ramu");
		Performer p2= (Performer) ctx.getBean("ramu");
		System.out.println("p1==p2? "+(p1==p2));// True coz beans are instantiated and managed as singleton
		p1.perform();
		Performer p3= (Performer) ctx.getBean("somu");
		p3.perform();
		Performer p4= (Performer) ctx.getBean("mamu");
		p4.perform();
		Performer p5= (Performer) ctx.getBean("bheemu");
		p5.perform();
		
		System.out.println("main()-> ended ");
		
	}

}
