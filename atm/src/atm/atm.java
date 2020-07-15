package atm;


import java.util.Scanner;
public class atm {
public static void main(String[]args) {

	System.out.println("welcome to atm machine");
	
	System.out.println("press 1 for withdraw");
System.out.println("press 2 for check balance");
System.out.println("press 3 for deposit");
System.out.println("press 4 for debit apply");
System.out.println("press 5 for exit");
int balance=10000;
int withdraw,deposit;
System.out.println("choose the operation to be perform");
Scanner s=new Scanner(System.in);
int n=s.nextInt();

switch(n)
{
case 1:
	System.out.println("enter the amount of money to be taken");
	withdraw=s.nextInt();
	if(withdraw<balance) {
		balance=balance-withdraw;
		System.out.println("take your money");
		System.out.println("the amout debit "+withdraw);
		System.out.println("the amount left "+balance);
	}
	else
	{
		System.out.println("insufficient balance");
	}
	System.out.println();
	break;
case 2:
	System.out.println("te amount in your account "+balance);
	
	System.out.println();
	break;
case 3:
	deposit=s.nextInt();
	balance =balance+deposit;
	System.out.println("the amount after deposit in your bank "+balance);
	System.out.println();
	break;
case 4:
	Scanner sc=new Scanner(System.in);
	System.out.println("debit card form");
	
System.out.println("enter your name");
	String name=sc.nextLine();
	
	 System.out.println("your name "+name);
	System.out.println("enter your account number");
	 String c=sc.nextLine();

	System.out.println("YOUR ACCOUNT NO "+c);
System.out.println("ENTER YOUR ADDHAR CARD");
String d=sc.nextLine();
	System.out.println("YOUR ADDHAR CARD"+d);
	System.out.println("ENTER PINCODE");
	String e=sc.nextLine();
	System.out.println("your pincode  "+e);
System.out.println("ENTER YOUR MOBILE NUMBER");
String f=sc.nextLine();
System.out.println("your mobile number   "+f);
	break;
case 5:
	System.exit(0);
}
s.close();
}}
