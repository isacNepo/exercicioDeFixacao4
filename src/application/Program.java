package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre com o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Valor inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
			if(resposta == 's') {
				System.out.print("Entre com o deposito inicial: ");
				double depositoInicial = sc.nextDouble();
				account = new Account(conta, titular, depositoInicial);
			}
			else {
				account = new Account(conta, titular);
			}
			
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		account.deposito(valorDeposito);
		System.out.println("Atualização da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com valor do saque: ");
		double valorSaque = sc.nextDouble();
		account.saque(valorSaque);
		System.out.println("Atualização da conta: ");
		System.out.println(account);
		
		sc.close();

	}

}
