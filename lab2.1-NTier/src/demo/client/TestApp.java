package demo.client;

import demo.ui.AccounUI;
import demo.ui.IAccountUI;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAccountUI accountUI = new AccounUI();
		System.out.println(accountUI.getInfo());
	}

}
