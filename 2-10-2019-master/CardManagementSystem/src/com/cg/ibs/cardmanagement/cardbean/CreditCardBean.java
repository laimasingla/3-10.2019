package com.cg.ibs.cardmanagement.cardbean;

import java.math.BigInteger;
import java.util.Date;

public class CreditCardBean {
	private BigInteger accountNumber;
	private BigInteger creditCardNumber;
	private boolean creditCardStatus;
	private String nameOnCreditCard;
	private int CreditCvvNum;
	private int creditCurrentPin;
	private Date creditDateOfExpiry;
	private String UCI ;
	private int creditScore;
	private BigInteger creditLimit;
	private String incomeTaxReturn;
	
	
	public BigInteger getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(BigInteger creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public boolean isCreditCardStatus() {
		return creditCardStatus;
	}
	public void setCreditCardStatus(boolean creditCardStatus) {
		this.creditCardStatus = creditCardStatus;
	}
	public String getNameOnCreditCard() {
		return nameOnCreditCard;
	}
	public void setNameOnCreditCard(String nameOnCreditCard) {
		this.nameOnCreditCard = nameOnCreditCard;
	}
	public int getCreditCvvNum() {
		return CreditCvvNum;
	}
	public void setCreditCvvNum(int creditCvvNum) {
		CreditCvvNum = creditCvvNum;
	}
	public int getCreditCurrentPin() {
		return creditCurrentPin;
	}
	public void setCreditCurrentPin(int creditCurrentPin) {
		this.creditCurrentPin = creditCurrentPin;
	}
	public Date getCreditDateOfExpiry() {
		return creditDateOfExpiry;
	}
	public void setCreditDateOfExpiry(Date creditDateOfExpiry) {
		this.creditDateOfExpiry = creditDateOfExpiry;
	}
	public int getCeditScore() {
		return creditScore;
	}
	public void setCeditScore(int ceditScore) {
		this.creditScore = ceditScore;
	}
	public BigInteger getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(BigInteger creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getIncomeTaxReturn() {
		return incomeTaxReturn;
	}
	public void setIncomeTaxReturn(String incomeTaxReturn) {
		this.incomeTaxReturn = incomeTaxReturn;
	}

}
