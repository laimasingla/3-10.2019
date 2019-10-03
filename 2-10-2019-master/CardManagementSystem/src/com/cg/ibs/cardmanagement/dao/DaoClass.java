package com.cg.ibs.cardmanagement.dao;



import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardTransaction;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardTransaction;
import com.cg.ibs.common.bean.AccountBean;
import com.cg.ibs.common.bean.CustomerBean;
import com.cg.ibs.common.bean.IBSUser;

public class DaoClass  implements CustomerDao , BankDao{

	
	

	private static Map<String ,DebitCardTransaction> Debit_Card_Transaction_Details = new HashMap<String , DebitCardTransaction>();
	private static Map<String ,CreditCardTransaction> Credit_Card_Transaction_Details = new HashMap<String , CreditCardTransaction>();
	private static Map<String, CaseIdBean> Query_Details = new HashMap<String, CaseIdBean>();
    private static Map<String, DebitCardBean> Debit_Card_Details = new HashMap<String, DebitCardBean>();
	private static Map<String, CreditCardBean> Credit_Card_Details = new HashMap<String, CreditCardBean>();
	
	
	static{
		
		DebitCardBean debit1= new DebitCardBean(new BigInteger("1234567890"), new BigInteger("1234567891012131"),true, "Laima", 067,1234,LocalDate.now(),"7894561239632587","Platinum");
		DebitCardBean debit2= new DebitCardBean(new BigInteger("1234547890"), new BigInteger("1234562391012131"),true, "Pragya", 057,1034,LocalDate.now(),"7894261239632587","Gold");
		DebitCardBean debit3= new DebitCardBean(new BigInteger("0234567890"), new BigInteger("3234567891012131"),true, "Shubham", 167,2234,LocalDate.now(),"7890561239632587","Silver");
		
		Debit_Card_Details.put(debit1.getDebitCardNumber().toString(),debit1);
		Debit_Card_Details.put(debit2.getDebitCardNumber().toString(),debit2);
		Debit_Card_Details.put(debit3.getDebitCardNumber().toString(),debit3);
		
		CreditCardBean credit1= new CreditCardBean(new BigInteger("9012345678"),new BigInteger("1234567891012132",true, " "))
		
	}
	public void newDebitCard(CaseIdBean customIdBean) {
		// TODO Auto-generated method stub
		Query_Details.put(customIdBean.getCaseIdTotal(),customIdBean);
		
		
	}@Override
	public void viewAndReplyPendingQueries() {
		// TODO Auto-generated method stub
		String statusOfCard="";
		
		
	}











}