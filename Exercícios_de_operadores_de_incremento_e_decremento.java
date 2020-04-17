
public class primeiraClasse {

	public static void main(String[] args) {
		
			int a = 5, b = 3;
					
			b = a * (a++);
			System.out.println("Exercício A:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    b = a * (--a);
		    System.out.println("Exercício B:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		   
		    b = a * ++a;
		    System.out.println("Exercício C:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		   
		    b = a * a--;
		    System.out.println("Exercício D:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a += b++;
		    System.out.println("Exercício E:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a += --b;
		    System.out.println("Exercício F:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a = b++ * ++a;
		    System.out.println("Exercício G:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a = (b++ % 2 ) * (++a *3);
		    System.out.println("Exercício H:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a = (--b % 2 ) * (++a /3 * b++);
		    System.out.println("Exercício I:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    b = (a * ++a) / (a * ++a);
		    System.out.println("Exercício J:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");

		    

		    
		    
		    
		    
		    
	}

}
