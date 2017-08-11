package com.ibm.developerworks;

import java.util.logging.Logger;

public class HelloWorld extends Person {

	
	public HelloWorld(){
		
		super(22,"jignesh",24);
		
	}
	
	public void printAudit(StringBuffer sb){
		
		sb.append(getAge()).append(getName()).append(getId());
		
		
		
	}
	
	
	public void audit(Logger l){
		
		StringBuffer sb = new StringBuffer();
		printAudit(sb);
		l.info(sb.toString());
		
	}
	
	
	public static void main(String[] args) {
		
		Logger l= Logger.getLogger(HelloWorld.class.getName());	
		
		
		HelloWorld hw= new HelloWorld();
		hw.audit(l);
		
		
		
	}

}



			
		
	 
	 
	 
 