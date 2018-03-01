
public class BankB extends BankX{
	
	public BankB() {
		p = new ProtocolHTTP(new BasicProtocol());
	}
	
	public void transfer(Account acc1, Account acc2) {
		p.transfer(acc1, acc2);
	}
	
}
