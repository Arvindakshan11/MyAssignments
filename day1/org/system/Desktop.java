package week3.day1.org.system;

public class Desktop extends Computer {
	
	
public void desktopSize() {
		
		System.out.println("Desktop Size: 11");
		
	}
public static void main(String[] args) {

	Desktop MyDevice = new Desktop ();
	MyDevice.computerModel();
	MyDevice.desktopSize();	
	
}

}
