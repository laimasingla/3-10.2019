package com.cg.ibs.cardmanagement.cardbean;

import java.math.BigInteger;
import java.time.LocalDate;

public class DebitCardBean {
	private BigInteger accountNumber;
	private BigInteger debitCardNumber;
	private boolean debitCardStatus;
	private String nameOnDebitCard;
	private int debitCvvNum;
	private int debitCurrentPin;
	private LocalDate debitDateOfExpiry;
	private String UCI ;
	private String debitCardType;
	
	public BigInteger getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUCI() {
		return UCI;
	}
	public void setUCI(String uCI) {
		UCI = uCI;
	}
	public String getDebitCardType() {
		return debitCardType;
	}
	public void setDebitCardType(String debitCardType) {
		this.debitCardType = debitCardType;
	}
	
	
	public DebitCardBean(BigInteger bigInteger, BigInteger bigInteger2, boolean b, String string, int i, int j,
			LocalDate now, String uCI2, String debitCardType2) {
		// TODO Auto-generated constructor stub
	}
	public BigInteger getDebitCardNumber() {
		return debitCardNumber;
	}
	public void setDebitCardNumber(BigInteger debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	public boolean isDebitCardStatus() {
		return debitCardStatus;
	}
	public void setDebitCardStatus(boolean debitCardStatus) {
		this.debitCardStatus = debitCardStatus;
	}
	public String getNameOnDebitCard() {
		return nameOnDebitCard;
	}
	public void setNameOnDebitCard(String nameOnDebitCard) {
		this.nameOnDebitCard = nameOnDebitCard;
	}
	public int getDebitCvvNum() {
		return debitCvvNum;
	}
	public void setDebitCvvNum(int debitCvvNum) {
		this.debitCvvNum = debitCvvNum;
	}
	public int getDebitCurrentPin() {
		return debitCurrentPin;
	}
	public void setDebitCurrentPin(int debitCurrentPin) {
		this.debitCurrentPin = debitCurrentPin;
	}
	public LocalDate getDebitDateOfExpiry() {
		return debitDateOfExpiry;
	}
	public void setDebitDateOfExpiry(LocalDate debitDateOfExpiry) {
		this.debitDateOfExpiry = debitDateOfExpiry;
	}

}
