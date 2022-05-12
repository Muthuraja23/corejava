package com.chainsys.unittest;

import com.chainsys.introduction.Bank;
/**
 * 
 * @author muth3126
 *
 */
public class BankTest {

	public static void testDeposit() {
		System.out.println("Before Balance " + Bank.currentBalance);
		Bank.deposit(10000);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentBalance);
		int withdraw = Bank.withdraw(5000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("Muthuraja", 987654321);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}
}



