
public abstract class ProtocolDeco implements Protocol{
	protected BasicProtocol prot;
	
	public ProtocolDeco(BasicProtocol prot) {
		this.prot = prot;
	}
	
	public void transfer(Account acc, Account acc2) {
		prot.transfer(acc, acc2);
	}
	
	public void sendInfo(Account acc) {
		prot.sendInfo(acc);
	}
	
	public void receiveInfo() {
		prot.receiveInfo();
	}
}
