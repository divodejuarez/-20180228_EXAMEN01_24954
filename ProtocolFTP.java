import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProtocolFTP extends ProtocolDeco{
	
	private DateFormat datef = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	
	public ProtocolFTP(BasicProtocol prot) {
		super(prot);
	}
	
	@Override
	public void transfer(Account acc1, Account acc2) {
		System.out.println("Transfering " + acc1.amount + "from account with alias " + acc1.alias +  
				" to account with alias " + acc2.alias + " via FTP");
	}
	
	@Override
	public void sendInfo(Account acc) {
		System.out.println("Transfered: " + acc.amount + "\n" + "Date of transfer: " + datef.format(date));
	}
	
	@Override
	public void receiveInfo() {
		System.out.println("I am receiving information in FTP protocol");
	}

}
