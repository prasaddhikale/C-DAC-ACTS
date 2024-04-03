package dependent;

import dependency.MessageService;
import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport myTransport;
	private MessageService myMessage;
	private double myAmount;

	public ATMImpl(double initAmt) {
		myAmount = initAmt;
		System.out.println("in cnstr of " + getClass().getName() + " " + myAmount);
	}
	
	public void setMyTransport(Transport myTransport) {
		this.myTransport = myTransport;
	}

	public void setMyMessage(MessageService myMessage) {
		this.myMessage = myMessage;
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);// dependent obj is calling dependency's method to inform the bank
		myMessage.informCustomer(data);
		myAmount += amt;
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
		myMessage.informCustomer(data);
		myAmount -= amt;
	}

	// custom init method
	public void myInit() {
		System.out.println("in init " + myTransport);// not null
	}

	// custom destroy method
	public void myDestroy() {
		System.out.println("in destroy " + myTransport);// not null
	}
	//factory method based D.I
	/*public static ATMImpl myFactoryMethod(Transport t12) {
		System.out.println("in factory method "+t12);
		return new ATMImpl(t12);
	}*/

}
