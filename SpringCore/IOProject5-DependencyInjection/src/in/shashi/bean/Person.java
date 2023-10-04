package in.shashi.bean;

public class Person {
	
	private String pname;
	private int pid;
	private String paddress;
	private float pincome;
	
	
	static {
		System.out.println("********************************Person Loading*****************************************************");
	}
	public Person() {
		System.out.println("Setter Injection need zero arg constructor");
		System.out.println("Object has been loadend");
	}
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPaddress() {
		return paddress;
	}
	
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
	public float getPincome() {
		return pincome;
	}
	
	public void setPincome(float pincome) {
		this.pincome = pincome;
	}
	
	
	public Person(String pname, int pid, String paddress, float pincome) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.paddress = paddress;
		this.pincome = pincome;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " +pname+"Id: " +pid+ "Address: "+paddress+"Income: "+ pincome;
	}
	
	
	
	
	
	

}
