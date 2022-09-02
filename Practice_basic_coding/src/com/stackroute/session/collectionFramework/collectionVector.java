package com.stackroute.session.collectionFramework;

import java.util.Vector;

public class collectionVector {

	public static void main(String[] args) {
		//Vector of raw type, not the correct way to work with vector
		// it gives lots of warning also
		Vector v = new Vector(); 
		 int x=50;
		 String y="HelloWorld";
		 float z=10.5f;
		 v.add(x);
		 v.add(y);
		 v.add(z);
		 
		 v.insertElementAt("hell", 2);
		 
		 v.remove("hell");
		 v.remove(0);
		 System.out.println(v);
		 
	}

}
