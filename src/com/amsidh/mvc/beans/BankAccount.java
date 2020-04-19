package com.amsidh.mvc.beans;

import java.util.HashSet;
import java.util.Set;

public class BankAccount {
    private Integer bankAccountNumber;
    private String bankName;
    private Double balance;
    private Set<Nominee> nominee=new HashSet<>();
	public Integer getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(Integer bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Set<Nominee> getNominee() {
		return nominee;
	}
	public void setNominee(Set<Nominee> nominee) {
		this.nominee = nominee;
	}
	public void setNominee(Nominee nominee){
		getNominee().add(nominee);
	}
    
}
