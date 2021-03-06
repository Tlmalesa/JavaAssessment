package com.enviro.assessment.grad001.TshegofatsoMalesa;
import java.math.BigDecimal;
public class SystemDB extends CurrentAccount {
	
	public SystemDB(int id,String accountNum,BigDecimal balance) {
		this.setID(id);
		this.setAccountNum(accountNum);
		this.setBalance(balance);
		this.getDateCreated();
		this.setAnnualInterestRate(balance);
		
	}
	public SystemDB(int id,String accountNum,BigDecimal balance,BigDecimal overdraftAmount) {
		
		this.setID(id);
		this.setAccountNum(accountNum);
		this.setBalance(balance);
		this.setOverdraft(overdraftAmount);
		this.getDateCreated();
		this.setAnnualInterestRate(overdraftAmount);
		
	}

}
