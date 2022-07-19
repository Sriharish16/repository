
public class Application {

	public static void main(String[] args) {

	Calsi calc = new Calsi();
	
	System.out.println("Addition of a and b:"+calc.Addition(10, 20));
	System.out.println("Subraction of a and b:"+calc.Subraction(40, 5));
	System.out.println("Multiplication of a and b:"+calc.Multiplication(40, 5));
	System.out.println("Division of and b:"+calc.Division(50, 5));
	System.out.println("Percentage of a and b:"+calc.Percentage(831, 1200)+"%");
	}

}
