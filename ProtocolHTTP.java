
public class ProtocolHTTP extends ProtocolDeco{

	public ProtocolHTTP(BasicProtocol prot) {
		super(prot);
	}
	
	@Override
	public void transfer(Account acc1, Account acc2) {
		System.out.println("Transfering " + acc1.amount + "from account with source " + acc1.source +  
				" to account of source " + acc2.source + " via HTTP");
	}
	
	@Override
	public void sendInfo(Account acc) {
		System.out.println("Transfered completed\n" + "Account with id: " + acc.id + " transfered " + acc.amount);
	}
	
	@Override
	public void receiveInfo() {
		System.out.println("I am receiving info in http protocol");
	}

}
