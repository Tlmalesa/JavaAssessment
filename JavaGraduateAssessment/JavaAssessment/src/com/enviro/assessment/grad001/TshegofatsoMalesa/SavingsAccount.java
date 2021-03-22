package com.enviro.assessment.grad001.TshegofatsoMalesa;
import java.math.BigDecimal;

public class SavingsAccount {
public static BigDecimal balance;
private static String accountNumber;
private static int idNumber;
private java.util.Date dateCreated;
private BigDecimal annualInterestRate;
private BigDecimal rate;

public SavingsAccount() {
	balance=new BigDecimal(1000.0);
	rate=new BigDecimal(0.014);
	accountNumber="";
	idNumber=0;
	
	dateCreated = new java.util.Date();
}
public void setBalance(BigDecimal balancee)
{
	balance=balancee;
	
}
public BigDecimal getBalance() {
	return balance;
}

public void setID(int id)
{
		idNumber=id;	
	
}
public int getId()
{
	return idNumber;
}

public void setAccountNum(String accountNum)
{
	accountNumber=accountNum;
	
}
public String getAccountNumber() {
	return accountNumber;
}

public BigDecimal getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(BigDecimal annualInterestRate) {
	this.annualInterestRate = annualInterestRate.multiply(rate);
}
public BigDecimal getMonthlyInterest(){
	BigDecimal annualRate=new BigDecimal(12);
	BigDecimal monthlyInterest=annualInterestRate.divide(annualRate) ;
	return monthlyInterest;
	
}

public java.util.Date getDateCreated() {
return dateCreated;
}
public interface AccountService{
	default public void withdraw(String accountNum,BigDecimal amountToWithdraw) {
		System.out.println("Deposit into account: " + accountNum);
		System.out.println("Withdrawal  from id number : " + idNumber);
		System.out.println("Amount : " + amountToWithdraw);
		if(amountToWithdraw.compareTo(balance) == 1) {
			System.out.println("Insuficient amount");
		}
		else {
			
			balance=balance.subtract(amountToWithdraw);
			System.out.println("New balance : " + balance);
		}
		System.out.println();
	}
default public void Deposit(String accountNum,BigDecimal amount) {

	System.out.println("Deposit into account: " + accountNum);
	System.out.println("Withdrawal  from id number : " + idNumber);
	System.out.println("Amount : " + amount);
	if(amount.compareTo(balance) == -1) {
	System.out.println("Deposit amount should be at least R1000");
	}
	else
	{
		balance =balance.add(amount);
		System.out.println("New balance : " + balance);
	}
	System.out.println();
	

 
}
}
}
