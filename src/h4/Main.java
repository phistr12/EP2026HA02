package h4;

public class Main {
	public static void main (String[] args) {
		
		int a;
		int x; 
		
		
		// a 
		a = 3;
		x = 5; 
		int b = a * x; // b ist vielfaches von a
		
		int div = b / a ;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("x= " + x);
		System.out.println("Division a: " + div);
		
		//b  // ich weiß nicht genau, wie ich die verschiedenen Beispiele hochladen soll
		a = -3; 
		x = -4; 
		b = a * x;
		div = b / a; 
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("x= " + x);
		System.out.println("Division b: " + div);
		
		// c
		
		a = 5;  
		b = 0; 
		div = b / a; 
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("x= " + x);
		System.out.println("Division c: " + div);

		
		// d
		
		a = 1; 
		b = 10; 
		div = b / a; 
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("Division d: " + div); // Fehlermeldung: Exception in thread "main" java.lang.ArithmeticException: / by zero

		
		// e
		
		a = 10; 
		b = 7; 
		div = b / a; 
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("Division e: " + div); // stimmt, bei 7/5 wäre die nächstkleinse 1, 7/10 => Ausgabe: 0; 
		
		
		//f 
		a = 10; 
		b = -6; 
		div = a/b; 
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("Division f: " + div);
		
		// g 
		a = - 10;
		b = 6; 
		div = a/b;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("Division g: " + div);
		
		//h 
		
		a = -10; 
		b = -6; 
		div = a / b; 
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("Division h" + div);
	}
	
	
	
}
