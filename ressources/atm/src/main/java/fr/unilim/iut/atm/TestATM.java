package fr.unilim.iut.atm;

public class TestATM {

	private static final String SEPARATOR_LINE = "----------------------------------------------------------------";

	public static void main(String[] args) {

		ATM atm = new ATM();

		int amount = 10;
		Money money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);
		
		System.out.println(SEPARATOR_LINE);
		
		amount = 20;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 30;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 40;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 50;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 60;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 70;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 110;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);

		System.out.println(SEPARATOR_LINE);
		
		amount = 330;
		money = atm.withdraw(amount);
		System.out.println("Montant demandé : " + amount);
		System.out.println("Billets distribués : " + money);
	}

}
