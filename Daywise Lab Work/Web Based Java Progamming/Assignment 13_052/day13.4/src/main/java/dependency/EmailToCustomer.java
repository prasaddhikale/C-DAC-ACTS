package dependency;

public class EmailToCustomer implements MessageService {

	public EmailToCustomer() {
		// TODO Auto-generated constructor stub
		System.out.println("In ctor of Email Service!!");
	}

	@Override
	public void informCustomer(byte[] data) {
		// TODO Auto-generated method stub
		System.out.println("Sending email to customer, balance changed by " + data);
	}

}
