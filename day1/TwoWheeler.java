package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 325478912L;
	boolean isPunctured = false;
	String bikeName = "Yamaha FZ-S";
	double runningKM = 5000.32;

	public static void main(String[] args) {
		
		TwoWheeler myTwoWheeler = new TwoWheeler();
		System.out.println(myTwoWheeler.noOfWheels);
		System.out.println(myTwoWheeler.noOfMirrors);
		System.out.println(myTwoWheeler.chassisNumber);
		System.out.println(myTwoWheeler.isPunctured);
		System.out.println(myTwoWheeler.bikeName);
		System.out.println(myTwoWheeler.runningKM);	

	}
	

}
