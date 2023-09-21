package in.shashi.bean;

public class A {
	 private B b;
	 
	 public A() {
		 
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
