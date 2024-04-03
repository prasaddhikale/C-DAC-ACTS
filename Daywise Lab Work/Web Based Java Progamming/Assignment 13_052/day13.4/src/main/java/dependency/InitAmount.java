package dependency;

public class InitAmount implements MessageService {
	
	public InitAmount() {
		// TODO Auto-generated constructor stub
		System.out.println("In ctor for initial amount of ATM");
	}

	@Override
	public void informCustomer(byte[] data) {
		// TODO Auto-generated method stub
		System.out.println("Setting initial balance of Atm to: " + data);
	}

}
