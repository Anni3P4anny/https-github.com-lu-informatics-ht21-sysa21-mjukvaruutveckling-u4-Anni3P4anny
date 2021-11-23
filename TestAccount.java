package org.ics.annies;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account();
		a.setNbr("1234");
		a.setBalance(10000);
		
		System.out.println("Kontonummer: " + a.getNbr());
		System.out.println("Saldo: " + a.getBalance());
		
		a.credit(500);
		
		System.out.println("Nytt saldo: " + a.getBalance());
		
		a.withdraw(500);
		
		System.out.println("Nytt saldo: " + a.getBalance());
		

	}

}
