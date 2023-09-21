package in.shashi.bean;

public class A {
	 private B b;
	 
	 static {
			System.out.println("A.class file is loading...");
		}
		
		public A() {
			System.out.println("A object is instantiated...");
		}
		
	 public A(B b) {
		 this.b=b;
	 }
	 
	 public void setB(B b) {
		 this.b=b;
	 }
	 
	 @Override
	  public String toString() {
		return "A [b=" + b + "]";
		  
	  }
}
