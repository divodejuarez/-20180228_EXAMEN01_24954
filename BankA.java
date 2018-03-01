
public class BankA extends BankX{
	
	public BankA() {
		p = new ProtocolFTP(new BasicProtocol());
	}
	
	public void transfer(Account acc1, Account acc2) {
		p.transfer(acc1, acc2);
	}
	
}
