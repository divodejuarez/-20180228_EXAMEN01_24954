
public class BankC extends BankX{
	
	public BankC() {
		p = new ProtocolXML(new BasicProtocol());
	}
	
	public void transfer(Account acc1, Account acc2) {
		p.transfer(acc1, acc2);
	}
	
}
