package oops;

public class studentinfo {
//this only class ke data mamber ko access karne ke liye karenge.
	//kisi function ko dot maarke use karte hai to uska address this me save hota hai.
	public static void main(String[] args) {
		student s=new student();
		System.out.println(s.age);

		System.out.println(s.name);

		s.age=19;
		s.name="Ayush";
		System.out.println(s.age);

		System.out.println(s.name);
          student s1=new student();
          
		s1.age=20;
		s1.name="Patel";
		System.out.println(s1.age);

		System.out.println(s1.name);
		s.into_yourself();
		s1.into_yourself();
		test(s,s1);
		System.out.println(s.name+" "+s.age);
		
		System.out.println(s1.name+" "+s1.age);
	 // String str;
		student.fun();
		

	}
	public static void test(student s2,student s3)
	{
		s2=new student();//new student ki jagah s3 lenge to heap me changes nhi hoga or same rahega no change.
		//isme a.age karke ghar me ghuske changes kar rhe hai to change reflect hoga agar saada s2 likhte to nhi to change.
		int temp1=s2.age;
		s2.age=s3.age;
		s3.age=temp1;
		
		s3=new student();
	    String temp2=s2.name;
		s2.name=s3.name;
		s3.name=temp2;
		
	}
}
