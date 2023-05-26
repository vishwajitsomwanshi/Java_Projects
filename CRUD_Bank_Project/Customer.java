package school;

public class Customer {
		private String name;
		private String address;
		private long moNo;
		private String product;
		
		public Customer(String name, String address, long moNo, String product){
			this.name = name;
			this.address = address;
			this.moNo = moNo;
			this.product = product;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getMoNo() {
			return moNo;
		}
		public void setMoNo(long moNo) {
			this.moNo = moNo;
		}
		public String getProduct() {
			return product;
		}
		public void setProduct(String product) {
			this.product = product;
		}
		
}
