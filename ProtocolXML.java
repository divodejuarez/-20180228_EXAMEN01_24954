
public class ProtocolXML extends ProtocolDeco{

	public ProtocolXML(BasicProtocol prot) {
		super(prot);
	}
	
	@Override
	public void transfer(Account acc1, Account acc2) {
		System.out.println("Transfering " + acc1.amount + "from account of id " + acc1.id + " with name" + acc1.name +  
					" to account with id " + acc2.id + " and name" + acc2.name + " via XML");
	}
	
	@Override
	public void sendInfo(Account acc) {
		System.out.println("Transfer success");
	}
	
	@Override
	public void receiveInfo() {
		System.out.println("I am receiving information in XML protocol");
	}

}
