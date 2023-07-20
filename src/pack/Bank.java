package pack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

class Account{
	
	int aNo;
	double balance;
	long contact;
	String name;
	String date;
	static Scanner s= new Scanner(System.in);
	static Writer fw;//Declaring Writer
	public int getaNo() {
		return aNo;
	}

	public double getBalance() {
		return balance;
	}
	
	public long getContact() {
		return contact;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Account [name="+ name+", aNo=" + aNo + ", balance=" + balance + ", contact=" + contact + ", date="
				+ date + "]\n********************************************************************************* ";
	}
	
	Account(){}
	Account(int a, String n, long c, String d ){
		
		aNo= a;
		contact= c;
		name= n;
		date= d;	
	}
	
	public void streamOut() {
		
		File file= new File("D:\\PassBook\\"+getName()+".txt");//Allocating a memory for a file 
		
		try {
			file.createNewFile();//created
			fw= new FileWriter(file,true);// File is passed where it has to be Written
			fw.write("\nDetails of Account Holder\n********************************************************************************* \n"+toString());
			fw.flush();//mandatory
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void sep() {
		System.out.println("***********************************");
	}
	
	public void deposit(double amt) {
		balance+= amt;
		sep();
		System.out.println(getName()+" Deposited Succesfully..");
		streamOut();
		sep();
		System.out.println("New Balance is "+balance+"$");
		
	}
	public void withDraw(double amt) {
		
		if(balance>amt) {
			balance-= amt;
			sep();
			System.out.println(getName()+" WithDrawn Succesfully..");
			sep();
			streamOut();
			System.out.println("New Balance is "+balance+"$");
			sep();
		}
		else {
			sep();
			System.out.println("Insuficient Balance ..");}	
	}
}

public class Bank {

	static String bName= "Spring Bank";
	static String branch= "Vadapalani";
	static Scanner s= new Scanner(System.in);
	static Account accounts[]= {
		new Account(123, "Harsha", 12345678l, "29-07-2000"),
		new Account(234, "Akila", 12345678l, "20-07-2002"),
		new Account(345, "Dhanush", 12345678l, "07-07-2004"),
		new Account(567, "Kamiqu", 12345678l, "02-07-2004")};
	
	//static Account a= new Account(); 
	public static void transactionMethod(Account la) {
		boolean b= true;
		do {
			
			System.out.println("1.Deposit\n2.WithDraw\n3.Check Balance\n4.Exit");
			Account.sep();
			int choice= s.nextInt();
			switch(choice) {
			case 1:{Account.sep();
				System.out.println("Deposit Selected");
				Account.sep();
			System.out.println("Enter amount to be Deposited ");
			Account.sep();
			la.deposit(s.nextInt());
			Account.sep();
				break;}
			case 2:{Account.sep();
				System.out.println("WithDraw Selected");
				Account.sep();
			System.out.println("Enter amount to be WithDrawn ");
			Account.sep();
			la.withDraw(s.nextInt());
			Account.sep();
				break;}
			case 3:{Account.sep();
				System.out.println("Check Balance Selected");
				Account.sep();
			System.out.println("Balance : "+ la.getBalance()+"$");
			Account.sep();
				break;}
			case 4:{
				b=false;
				Account.sep();
			//	la.streamOut();
				System.out.println("Pass book Updated Succesfuly");
				Account.sep();
				System.out.println("ThankYou");
		//		Account.sep();
				break;}
			default :{Account.sep();
				System.out.println("invalid Input ");
			Account.sep();}
			}
		}while(b);
	}
	
	Bank(){}
	public static void main(String[] args) {
		
		accounts[0].deposit(1200);
		accounts[1].deposit(1500);
		accounts[2].deposit(1400);
		accounts[3].deposit(1700);
		
		boolean a= true;
		do {
			Account.sep();
			System.out.println("Enter a account Holder ");
			Account.sep();
			System.out.println("1.Harsha\n2.akila\n3.Dhanush\n4.kamiqu\n5.Exit");
			Account.sep();
			int choice= s.nextInt();
		//	Account.sep();
			switch(choice) {
			case 1:{Account.sep();
				System.out.println(accounts[0].getName()+"Account Selected");
				Account.sep();
			Bank.transactionMethod(accounts[0]);
			break;}
			case 2:{Account.sep();
				System.out.println(accounts[1].getName()+"Account Selected");
				Account.sep();
			Bank.transactionMethod(accounts[1]);
			break;}
			case 3:{Account.sep();
				System.out.println(accounts[2].getName()+"Account Selected");
				Account.sep();
			Bank.transactionMethod(accounts[2]);
			break;}
			case 4:{Account.sep();
				System.out.println(accounts[3].getName()+"Account Selected");
				Account.sep();
			Bank.transactionMethod(accounts[3]);
			break;}
			case 5:{a=false;
			Account.sep();
				System.out.println("ThankYou");
				Account.sep();
			break;}
			default:{Account.sep();
				System.out.println("No Account Holder");
				Account.sep();
			break;}
			}
			
		}while(a);

	}
}
