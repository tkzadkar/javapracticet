package InputOutputVariablesDatatypes;

public class Calculator {
	
	byte by = 127;
	short sh = 32767;
	int  i = 214748364;
	long lo = 9223372036854775807l;
	
	double db = 7890.90;
	float fl = -5766.98f;
	
	char ch = 'A';
	char ch1 = 'a';
	char ch2 = '1';
	char ch3 = '@';
	
	boolean boo = true;
	boolean boo1 =  false ;
	
	String str = "Its raining since yesterday night";
	
	//Naming Standarde 
	
	
	
	
	public static void main(String[] args) {
	
		
		new Calculator ();
		
		// Non Primitive data types
		//Reference datatype
		Calculator calci = new Calculator ();
		Calculator calci1 = new Calculator ();
		Calculator calci2 = new Calculator ();
		
		
		
		calci.addition();
		
		System.out.println("The Address Of THe Variable is "  + calci);
		
	}
	
	
	public void addition () {
		System.out.println("addition");
		
	}
	public void multiply () {
		
	}
	public void subtraction () {
		
	}
	public void devision () {
		
	}
	
	
	
	
	
	
	
	
}
	
	