package ZExtraClasses;

public class Student extends Person {
	
	
	int rollNo;
	
	Student(int rollNo){
		
		super(22,"Jignesh");
		this.rollNo=rollNo;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3= new String("xyz");
		String s1= "xyz";
		String s2="XYZ";
		String s4= new String("xyz");
		System.out.println(s4==s3);
		System.out.println(s4.equals(s3));
		
		
		
/*
		Student st= new Student(22);
		st.getName();
		
		Person p= new Student(23);
		p.getName();
		
		Person pt= new Person();
		pt.getName();*/
	}

	//@Override
	/*public void getName() {
		
		System.out.println(name+""+""+id+""+rollNo );
		
		// TODO Auto-generated method stub
		
	}*/

}
