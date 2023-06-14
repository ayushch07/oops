package oops;

public class exception_handling {
  private String str="Hello";
  private int a;
  public exception_handling (String str, int a )
  {
	  this.a=a;
	  this.str=str;
  }
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
public int getA() {
	return a;
}
public void setA(int a){
//	 if(a<0)
//	 {
//		 throw new Exception("Negative not allowed");
//	 }
	//ye khali exception dikhata hai aage program nhi chalata.
	try {
		if(a<0)
		{throw new Exception("Negative not allowed");
			
		}
	//	this.a = a; agar yaha likhe to nicheka nhi chalega.
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Hey welcome");
	}
	this.a=a;
	
	
}
  
}
