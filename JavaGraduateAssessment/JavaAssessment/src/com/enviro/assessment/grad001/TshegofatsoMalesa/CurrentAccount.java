package com.enviro.assessment.grad001.TshegofatsoMalesa;
import java.math.BigDecimal;

public class CurrentAccount extends SavingsAccount {
	private static BigDecimal maxOverdraft= new BigDecimal(100000.0) ;
	private static BigDecimal overdraft;
	
	public void setOverdraft(BigDecimal overdraftt) {
		overdraftt = maxOverdraft;
	}
	public BigDecimal getOverdraft() {
		return maxOverdraft;
	}
	public interface AccountServices{
	default public void withdrawls(String accountNum,BigDecimal amountWithdraw) {
		// TODO Auto-generated method stub
		while(amountWithdraw.compareTo(maxOverdraft) == -1 && amountWithdraw.compareTo(maxOverdraft) == 0)
		{
			
			amountWithdraw=overdraft.add(balance);
		}
		
	}
		
		
	}
}
