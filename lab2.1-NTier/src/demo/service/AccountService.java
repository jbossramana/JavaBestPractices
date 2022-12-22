package demo.service;

import demo.dao.AccountDao;
import demo.dao.IAccountDao;

public class AccountService implements IAccountService {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		
		IAccountDao accountDao = new AccountDao();
		
		return "Service.."+accountDao.getInfo();
	}

}
