package org.ics.annies;

public class Account {
	
	private String nbr;
	private double balance;
	
	public String getNbr() {
		return nbr;
	}
	
	public void setNbr(String newNbr) {
		nbr = newNbr;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void credit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}