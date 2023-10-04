package in.shashi.vo;

public class VO {
	
		private String customerName;
		private String customerAddress;
		private String pAmount;
		private String time;
		private String rate;
		
		static {
			
		}
		public VO(){
			
		}
		
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
		
		public String getpAmount() {
			return pAmount;
		}
		
		public void setpAmount(String pAmount) {
			this.pAmount = pAmount;
		}
		
		public String getTime() {
			return time;
		}
		
		public VO(String customerName, String customerAddress, String pAmount, String time, String rate) {
			
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			this.pAmount = pAmount;
			this.time = time;
			this.rate = rate;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		public String getRate() {
			return rate;
		}
		
		public void setRate(String rate) {
			this.rate = rate;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "";
		}
		
		
	

}
