package com.varioustopic.revision;


interface sayHello{  
void print();  
}  




interface Show extends sayHello{  
void sayWelcome();  
}  



public class MainInterface implements Show{  
	
public void print(){
	System.out.println("Hello");
	} 

public void sayWelcome(){
	System.out.println("Welcome");
	}  
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainInterface obj = new MainInterface();  
		obj.print();  
		obj.sayWelcome();  
	}

}
