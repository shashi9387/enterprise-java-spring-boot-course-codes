package in.shashi.bo;

public class CustomerBO {
	
	private String customerName;
	private String customerAddress;
	private float pAmount;
	private float time;
	private float rate;
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public float getpAmount() {
		return pAmount;
	}
	
	public void setpAmount(float pAmount) {
		this.pAmount = pAmount;
	}
	
	public float getTime() {
		return time;
	}
	
	public CustomerBO(String customerName, String customerAddress, float pAmount, int time, float rate) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.pAmount = pAmount;
		this.time = time;
		this.rate = rate;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public float getRate() {
		return rate;
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer Name : "+customerName+" Customer Address : "+customerAddress+" Principal Amount : "+pAmount+" Rate: "+rate+" Time: "+time+" Interest Amaunt: "+interest;
	}
	
	
	
}
