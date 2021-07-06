package Adapter.variant1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// adapter
public class BankCustomer extends BankDetails implements CreditCard {

	public void giveBankDetails() {

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Press 1 to check default example or 2 to enter data manually: ");
			String choice = br.readLine();

			if (choice.equals("1")) {
				setAccHolderName("Test customer name");
				setAccNumber(1234567890L);
				setBankName("Some bank");

			} else if (choice.equals("2")) {
				System.out.print("\nEnter the account holder name: ");
				String customerName = br.readLine();
				setAccHolderName(customerName);

				System.out.print("\nEnter the account number:");
				long accNumber = Long.parseLong(br.readLine());
				setAccNumber(accNumber);

				System.out.print("\nEnter the bank name :");
				String bankName = br.readLine();
				setBankName(bankName);
			} else {
				System.out.print("\nError!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {

		long accNumber = getAccNumber();
		String accHolderName = getAccHolderName();
		String bankName = getBankName();

	    return String.format("The credit card for account number '%d' of '%s' in '%s' bank.", accNumber, accHolderName, bankName);

	  }

}
