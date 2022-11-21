package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		System.out.println("Selenium from TestTool Interface");
		
	}

	public void Java() {
		
		System.out.println("Java from Language Interface");
	}

	@Override
	public void ruby() {
		
		System.out.println("ruby from MultipleLanguage Abstractclass");
	}

	public static void main(String[] args) {
		
		Automation Obj = new Automation();
		Obj.python();
		Obj.Selenium();
		Obj.Java();
		Obj.ruby();
		
	}
	

}
