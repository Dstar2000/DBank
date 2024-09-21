package oops;

import java.util.Scanner;

class DBank{
	private double bal=5000;
	private int pwd;
	public void Deposite(double money)
	{
		System.out.println("Please Enter your Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal-money;
			System.out.println("Money deposited successfully.. "+money);
			System.out.println("Total Balance: "+bal);
		}
		else {
			System.out.println("Incorrect Password....!");
		}
	}
	
	public void Credit(double money)
	{
		System.out.println("Please Enter your Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal-money;
			System.out.println("Money credited successfully... "+money);
			System.out.println("Total Balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect Password.....!");
		}
	}
	public void CheckBalance()
	{
		System.out.println("Plese enter your password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Total Balance: "+bal);
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
}
public class User {
	public static void main(String[] args) {
		DBank b=new DBank();
		
		int ch;
		System.out.println("1. Deposit money");
		System.out.println("2. Credit money");
		System.out.println("3. Check balance");
		
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:b.Deposite(50);
		break;
		case 2:b.Credit(100);
		break;
		case 3:b.CheckBalance();
		break;
		default:System.out.println("Invalid Choice....!");
		break;
		}
	}
}
