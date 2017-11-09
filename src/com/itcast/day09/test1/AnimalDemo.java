package com.itcast.day09.test1;

 class AnimalDemo {
	
	public static void main(String[] args){
        
		/**
		 * test1
		 */
//		Dog a1 = new Dog();
//		a1.setName("小黄狗");
//		a1.setAge(18);
//				
//		a1.eat();
//		System.out.println("我是"+a1.getName()+",我今年"+a1.getAge()+"岁！"); 
		
		/**
		 * test2
		 */
//		Dog a2 = new Dog("小白狗",20);
//		
//		a2.eat();
//		System.out.println(a2.getName()+","+a2.getAge());
		
		
		/**
		 * test3 多态
		 */
		
		Animal a3 = new Dog("小多态",21);
		a3.eat();
		
	}
	
	
	

}
