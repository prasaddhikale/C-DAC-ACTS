package dependency;

public class MessageToCustomer implements MessageService {
	
	public MessageToCustomer() {
		// TODO Auto-generated constructor stub
		System.out.println("In ctor of Message Service!!");
	}

	@Override
	public void informCustomer(byte[] data) {
		// TODO Auto-generated method stub
		System.out.println("Sending mesage to customer, balance changed by " + data);
	}

}
