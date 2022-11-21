package week3.day1;

public class Calculator {
	
	
public void add(int a, int b) {
	
	System.out.println("Add method with 2 int args ");
	System.out.println(a+b);
	
	
}
	 
public void add(int a, int b, int c) {
	System.out.println("Add method with 3 int args ");
	System.out.println(a+b+c);
	
		
}

public void sub(double e, double f) {
	
	System.out.println("Sub method with 2 Double args ");
	System.out.println(e-f);
	
	
}

public void sub(int a, int b) {
	
	System.out.println("Sub method with 2 int args ");
	System.out.println(a+b);
	
	
}

public void mul(int a, double f) {
	
	System.out.println("Mul method with 1 int and 1 Double args ");
	System.out.println(a+f);
	
	
}

public void mul(double e, double f) {
	
	System.out.println("Sub method with 2 Double args ");
	System.out.println(e-f);
	
	
}

public static void main(String[] args) {
	
	Calculator Cal = new Calculator();
	Cal.add(10,30,30);
	Cal.add(10,40);
	Cal.sub(30.0,10.15);
	Cal.sub(50,30);
	Cal.mul(10,35.6);
	Cal.mul(41.5,35.6);
	
	
	
}

}
