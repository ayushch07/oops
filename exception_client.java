package oops;

public class exception_client {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		exception_handling s=new exception_handling("Rajma",23);
		s.setStr("Naman");
		s.setA(25);
		System.out.print(s.getA()+" "+s.getStr());
		exception_handling s1=new exception_handling("Rajma",23);
		s1.setStr("Chaman");
		s1.setA(-25);
		System.out.print(s1.getA()+" "+s1.getStr());

	}

}
