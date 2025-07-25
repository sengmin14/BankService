package bankController;

import bankService.BankService;
import bankService.HanaBankServiceImpl;
import bankService.KbBankServiceImpl;
import bankService.ShinhanBankServiceImpl;

public class BankController {
	BankService bank = new HanaBankServiceImpl();
	
	public void test() {
		bank.getName();
	}
	
}
