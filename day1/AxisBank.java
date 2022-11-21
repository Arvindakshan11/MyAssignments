package week3.day1;

public class AxisBank extends BankInfo {
	
public void deposit() {
		System.out.println("Deposit: 320000");

	}
public static void main(String[] args) {
	AxisBank BI = new AxisBank();
	BI.saving();
	BI.fixed();
	BI.deposit();
	
}

}
