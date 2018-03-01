
public class Demo {

	public static void main(String[] args) {
		
		BankX bank = new BankA();
		
		Account acc = new Account(bank, bank);
		
		bank.addObserver(acc);
		
		acc.alias = "Rorois";
		acc.name = "rori";
		acc.id = 1354;
		acc.amount = 6554;
		
		

	}

}
