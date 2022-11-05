package week1.day1;

public class Mobile {
	String mobileBrandName = "OnePlus 10";
	char mobileLogo = '+';
	short noOfMobilePiece = 10;
	int modelNumber = 587456;
	long mobileImeiNumber = 87945612301L;
	float mobilePrice = 45000.00F;
	boolean isDamaged = false;
	
	public void makeCall() {
		System.out.println("Call to Mobile");

	}
	
	public void sendMsg() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		//ClassName ojectName = new ClassName
		Mobile myMobile = new Mobile();
		//Creating an object to call or execute a method
		/*myMobile.makeCall();
		myMobile.sendMsg();*/
		
		System.out.println(myMobile.mobileBrandName);
		System.out.println(myMobile.mobileLogo);
		System.out.println(myMobile.noOfMobilePiece);
		System.out.println(myMobile.modelNumber);
		System.out.println(myMobile.mobileImeiNumber);
		System.out.println(myMobile.mobilePrice);
		System.out.println(myMobile.isDamaged);

	}

}
