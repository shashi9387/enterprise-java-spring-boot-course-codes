package in.shashi.bean;

public class B {
 private A a;
	 
	 public B() {
		 
	 }
	 public B(A a) {
		 this.a=a;
	 }
	 
	 public void setA(A a) {
		 this.a=a;
	 }
	 
	 @Override
	  public String toString() {
		return "B [a=" + a + "]";
		  
	  }
}
