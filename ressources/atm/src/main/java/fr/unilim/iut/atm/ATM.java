package fr.unilim.iut.atm;


public class ATM {

	private static final String CURRENCY = "Euros";

	public Money withdraw(int amount) {

		Money money = Money.NO;

		// Dispense 50 Euros Notes
		if (amount >= 50) {
			int numberof50BankNotes = amount / 50;
			money = money.add(new BankNotesBundle(new BankNote (50,CURRENCY), numberof50BankNotes));
		}
		amount = amount % 50;

		// Dispense 20 Euros Notes
		if (amount >= 20) {
			int numberof20BankNotes = amount / 20;
			money = money.add(new BankNotesBundle(new BankNote (20,CURRENCY), numberof20BankNotes));
		}

		amount = amount % 20;

		// Dispense 10 Euros Notes
		if (amount >= 10) {
			int numberof10BankNotes = amount / 10;
			money = money.add(new BankNotesBundle(new BankNote (10,CURRENCY), numberof10BankNotes));
		}
	
		return money;
	}

}
