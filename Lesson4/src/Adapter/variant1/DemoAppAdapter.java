package Adapter.variant1;

// client
public class DemoAppAdapter {

	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomer();
	    targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}
}

/* Результат (консоль):

Press 1 to check default example or 2 to enter data manually: 1
The Account number '1234567890' of 'Test customer name' in 'Some bank' bank.
Process finished with exit code 0

ОПИСАНИЕ:

*/