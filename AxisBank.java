package week3.day1;

public class AxisBank extends BankInfo {

	
	public void deposit() {
		System.out.println("Deposit percentage in AxisBank is 10.5%");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank ab= new AxisBank();
		
		ab.deposit();
		ab.saving();
		ab.fixed();
		
	}

}
