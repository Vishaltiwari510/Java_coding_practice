package com.stackroute.practice.assignment21April;

public class EngineImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Engine engine = new Engine("P1000",50, 6000, 90, 75);
	
     Petrol p1 = new Petrol("P1000",50, 6000, 90, 75,996, 3, "11.0:1");
     
     Diesel d1 = new Diesel("D1000",50, 6000, 90, 75,1248, 4, "17.6:1");
     Electric e1 = new Electric("E1000",50, 6000, 90, 75, "AC", 360);
     CNG c1 = new CNG("C1000",50, 6000, 90, 75,75, 3, "11.0:1");
     EngineService engineService  = new EngineService();
     System.out.println("Petrol Engine Details: -------------------------");
     engineService.displayCarEngine(p1);
     System.out.println();
     System.out.println("Electric Engine Details: -------------------------");
     engineService.displayCarEngine(e1);
     System.out.println();
     System.out.println("CNG Engine Details: -------------------------");
     engineService.displayCarEngine(c1);
     System.out.println();
     System.out.println("Diesel Engine Details: -------------------------");
     engineService.displayCarEngine(d1);
	}
  
	
}
