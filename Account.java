
public class Account implements Observer{
	
	public Observable obs;
	public BankX b;
	
	public Account(Observable obs, BankX b) {
		this.obs = obs;
		this.b = b;
	}
	
	int id;
	String name;
	String source;
	String year;
	int amount;
	String alias;
	
	
	@Override
	public void transferCompleted() {
		System.out.println("My transfer got completed");
	}
	
	public void unsuscribe() {
		obs.removeObserver(this);
	}
	
}
