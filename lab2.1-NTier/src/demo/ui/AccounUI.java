package demo.ui;

import demo.service.AccountService;
import demo.service.IAccountService;

public class AccounUI implements IAccountUI {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		
		IAccountService accountService = new AccountService();
		
		return "UI.."+accountService.getInfo();
	}

}
