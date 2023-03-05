
public class BankAccount {
	
	private Integer accountNumber;
	private String accountHolderName;
	private String accountType;
	
	public BankAccount(Integer accountNumber, String accountHolderName, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	
	
	public Integer getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
