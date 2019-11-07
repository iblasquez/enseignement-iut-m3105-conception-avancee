package fr.unilim.iut.atm;


import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ATMTest {

	ATM atm = new ATM();
	BankNote bankNote_of_10Euros = new BankNote(10,"Euros");
	BankNote bankNote_of_20Euros = new BankNote(20,"Euros");
	BankNote bankNote_of_50Euros = new BankNote(50,"Euros");

	@Test
	public void should_dispense_one_10EurosBankNote_when_withdraw_10Euros() {
		int amount = 10;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(1)
									.containsExactly(new BankNotesBundle(bankNote_of_10Euros,1));
		}

	@Test
	public void should_dispense_one_20EurosBankNote_when_withdraw_20Euros() {
		int amount = 20;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(1)
									.containsExactly(new BankNotesBundle(bankNote_of_20Euros,1));
	}

	@Test
	public void should_dispense_one_20EurosBankNote_and_one_10EurosBankNote_when_withdraw_30Euros() {
		int amount = 30;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(2)
									.containsExactlyInAnyOrder( new BankNotesBundle(bankNote_of_20Euros,1),
																new BankNotesBundle(bankNote_of_10Euros,1)); 
	}

	@Test
	public void should_dispense_two_20EurosBankNotes_when_withdraw_40Euros() {
		int amount = 40;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(1)
									.containsExactly(new BankNotesBundle(bankNote_of_20Euros,2));
	}

	@Test
	public void should_dispense_one_50EurosBankNote_when_withdraw_50Euros() {
		int amount = 50;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(1)
									.containsExactly(new BankNotesBundle(bankNote_of_50Euros,1));
	}

	@Test
	public void should_dispense_one_50EurosBankNote_and_one_10EurosBankNote_when_withdraw_60Euros() {
		int amount = 60;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(2)
									.containsExactlyInAnyOrder(new BankNotesBundle(bankNote_of_50Euros,1), 
													 new BankNotesBundle(bankNote_of_10Euros,1));
	}

	@Test
	public void should_dispense_one_50EurosBankNote_and_one_20EurosBankNote_when_withdraw_70Euros() {
		int amount = 70;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(2)
									.containsExactlyInAnyOrder(new BankNotesBundle(bankNote_of_50Euros,1), 
													 new BankNotesBundle(bankNote_of_20Euros,1));
		}

	@Test
	public void should_dispense_two_50EurosBankNote_and_one_10EurosBankNote_when_withdraw_110Euros() {
		int amount = 110;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(2)
									.containsExactlyInAnyOrder(new BankNotesBundle(bankNote_of_50Euros,2), 
													new BankNotesBundle(bankNote_of_10Euros,1));
	}

	@Test
	public void should_dispense_six_50EurosBankNotes_and_one_20EurosBankNote_and_one_10EurosBankNote_when_amount_is_330Euros() {
		int amount = 330;
		Money money = atm.withdraw(amount);
		assertThat(money.getNotes()).hasSize(3)
									.containsExactlyInAnyOrder(new BankNotesBundle(bankNote_of_50Euros, 6), 
													 new BankNotesBundle(bankNote_of_20Euros, 1),
													 new BankNotesBundle(bankNote_of_10Euros, 1));

	}
}