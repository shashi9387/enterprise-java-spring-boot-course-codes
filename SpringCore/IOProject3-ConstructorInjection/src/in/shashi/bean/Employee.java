package in.shashi.bean;

public class Employee {

		private int eno;
		private String ename;
		private String eaddress;
		private float esalary;
		
		static {
			System.out.println("ok");
		}
		public Employee() {
			System.out.println("nnnnno");
		}
		
		public Employee(int eno, String ename , String eaddress , float esalary) {
			this.ename=ename;
			this.eaddress=eaddress;
			this.eno=eno;
			this.esalary=esalary;
			
		}
		@Override
		public String toString(){
			
			return "Employee [eno=" + eno + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress + "]";
			}
		
		
		
		
		

}
