
public class primeiraClasse {

	public static void main(String[] args) {
		
			int a = 5, b = 3;
					
			b = a * (a++);
			System.out.println("Exerc�cio A:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    b = a * (--a);
		    System.out.println("Exerc�cio B:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		   
		    b = a * ++a;
		    System.out.println("Exerc�cio C:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		   
		    b = a * a--;
		    System.out.println("Exerc�cio D:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a += b++;
		    System.out.println("Exerc�cio E:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a += --b;
		    System.out.println("Exerc�cio F:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a = b++ * ++a;
		    System.out.println("Exerc�cio G:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a = (b++ % 2 ) * (++a *3);
		    System.out.println("Exerc�cio H:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    a = (--b % 2 ) * (++a /3 * b++);
		    System.out.println("Exerc�cio I:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");
		    
		    b = (a * ++a) / (a * ++a);
		    System.out.println("Exerc�cio J:");
		    System.out.println("b = "+b);
		    System.out.println("a = "+a);
		    System.out.println("-----------");

		    

		    
		    
		    
		    
		    
	}

}
