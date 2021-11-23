package org.ics.annies;
import java.util.Scanner;

public class AppAccount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double belopp;
		double saldo = 0;
		int svar;
		char avsluta = 'N';
		
		while (avsluta != 'J') {
			
			System.out.print("Insättning eller uttag (0-insättning, 1-uttag): ");
			svar = scan.nextInt();
		
			if (svar == 0) {
				System.out.print("Ange belopp: ");
				belopp = scan.nextDouble();
				saldo += belopp;
				System.out.println("Saldo: " + saldo);
			}
			
			if (svar == 1) {
				System.out.print("Ange belopp: ");
				belopp = scan.nextDouble();
				saldo -= belopp;
				System.out.println("Saldo : " + saldo);
			}
			
			System.out.print("Vill du avsluta? ");
			avsluta = scan.next().charAt(0);
			
			if (avsluta == 'J') {
				System.out.println("Saldo: " + saldo);
			
			}
		

		}

	}
	
}
