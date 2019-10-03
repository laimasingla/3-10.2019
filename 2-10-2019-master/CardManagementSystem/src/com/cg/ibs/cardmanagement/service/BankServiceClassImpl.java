package com.cg.ibs.cardmanagement.service;

import com.cg.ibs.cardmanagement.dao.BankDao;
import com.cg.ibs.cardmanagement.dao.CustomerDao;
import com.cg.ibs.cardmanagement.dao.DaoClass;

public class BankServiceClassImpl implements BankService {
	
	
	
	private BankDao bankDao;
	public BankServiceClassImpl(){
		bankDao=new DaoClass ();
	}

	@Override
	public void viewAllPendingQueries() {
		// TODO Auto-generated method stub
		bankDao.viewAndReplyPendingQueries();
		
	}

}
