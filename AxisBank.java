package assignment.week3;

public class AxisBank extends BankInfo{

	public void deposit() {
		
	}
	
	public static void main(String[] args) {
	
		AxisBank B=new AxisBank();
		B.saving();
		B.deposit(); //overriden from BankInfo class
		B.fixed();

	}

}
