package com.enviro.assessment.grad001.TshegofatsoMalesa;

import java.math.BigDecimal;

import com.enviro.assessment.grad001.TshegofatsoMalesa.SavingsAccount.AccountService;
import com.enviro.assessment.grad001.TshegofatsoMalesa.CurrentAccount.AccountServices;

public class MainTester {
	
	
	public static void main(String[] args) {
		
		class AccountServ implements AccountService{
			
		}
	   class AccountServi implements AccountServices{
			
		}
		// TODO Auto-generated method stub	
		AccountService accountService=new AccountServ();
		 AccountServices accountServices=new AccountServi();
		BigDecimal balance =new BigDecimal(2000.0);
		  SystemDB mySavings=new SystemDB(101,"1",balance);
		
		
		  BigDecimal withdraw =new BigDecimal(1000.0); 
		  BigDecimal deposit =new BigDecimal(1500.0); 
		  accountService.withdraw("1",withdraw);
		System.out.println();
		 accountService.Deposit("1",deposit);
        System.out.println("Interest amount:  " +  mySavings.getAnnualInterestRate());
        System.out.println("This account was created on " +  mySavings.getDateCreated());      
       
        
        System.out.println();
        
        BigDecimal balance1 =new BigDecimal(5000.0);
        SystemDB mySavings1=new SystemDB(102,"2",balance1);
        
         BigDecimal withdraw1 =new BigDecimal(1000.0); 
		  BigDecimal deposit1 =new BigDecimal(900.0);
		   accountService.withdraw("2",withdraw1);
		System.out.println();
		 accountService.Deposit("2",deposit1);
	     System.out.println("Interest amount:  " +  mySavings.getAnnualInterestRate());
	     
        System.out.println("This account was created on " + mySavings1.getDateCreated());
   
       System.out.println();
      
       BigDecimal balance2 =new BigDecimal(1000.0);
       BigDecimal overdraft =new BigDecimal(10000.0);
       
        SystemDB myCurrent=new SystemDB(103,"3",balance2,overdraft);
         BigDecimal withdraw2 =new BigDecimal(1000.0); 
	    accountServices.withdrawls("3",withdraw2);
		System.out.println();
        System.out.println("This account was created at " + myCurrent.getDateCreated());
			
	}

}
