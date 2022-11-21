package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp() {
		System.out.println("Whatsapp Connected");

	}
	
	public void takeVedio() {
		System.out.println("Vedio turned ON - From SamrtPhone Class");

	}


	public static void main(String[] args) {
		
		SmartPhone obj = new SmartPhone ();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		obj.takeVedio();
		obj.connectWhatsapp();
		

	}

}
