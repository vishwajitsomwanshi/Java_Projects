package school;

public class Account {
		private String acHolderName;
		private long acNo;
		private String ifsc;
		private long cNo;
		private String branch;
		private int password;
		private double balance;
//		private double deposite;
//		private double widrawal;
		public Account(String acHolderName, long acNo, String ifsc, long cNo, String branch, int password,double balance) {
			this.acHolderName = acHolderName;
			this.acNo = acNo;
			this.ifsc = ifsc;
			this.cNo = cNo;
			this.branch = branch;
			this.password = password;
			this.balance=balance;
//			this.deposite = deposite;
//			this.widrawal = widrawal;
		}
		public String getAcHolderName() {
			return acHolderName;
		}
		public void setAcHolderName(String acHolderName) {
			this.acHolderName = acHolderName;
		}
		public long getAcNo() {
			return acNo;
		}
		
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		public long getcNo() {
			return cNo;
		}
		public void setcNo(long cNo) {
			this.cNo = cNo;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance=balance;
		}
//		public double getDeposite() {
//			return deposite;
//		}
//		public void setDeposite(double deposite) {
//			this.deposite = deposite;
//		}
//		public double getWidrawal() {
//			return widrawal;
//		}
//		public void setWidrawal(double widrawal) {
//			this.widrawal = widrawal;
		}
		

		
		