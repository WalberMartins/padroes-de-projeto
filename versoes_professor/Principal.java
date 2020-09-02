import java.util.Arrays;

public class Principal {
	static final char ZERO = '0';
	static final char UM = '1';
	private static final int ARQUITETURA = 8;
	private static int cont;	

	public static void main(String[] args) {
		
		char x[] = "00000001".toCharArray();
		char y[] = "00000010".toCharArray();
		char z = ZERO;
		
		char r[] = adder(x, y, z);
		
		System.out.println("input: " + Arrays.toString(x) + " " + Arrays.toString(y) + " " + z);
		System.out.println("output: " + Arrays.toString(r));
		System.out.println("cont: " + cont);
		
		
	}
	
	private static char[] adder (char a[], char b[], char c) {
	
		char s[] = new char [ARQUITETURA];
		
		for(int i = s.length - 1; i >= 0; i--) {
			
			char r[] = fullAdder(a[i], b[i], c);
			
			s[i] = r[0];
			
			c = r[1];
		}		
		
		return s;
	}
	
	private static char[] fullAdder (char a, char b, char c) {
		char sc[] = new char[2];
		
		char p[] = halfAdder(a, b);
		char s[] = halfAdder(p[0], c);
		
		
		sc[0] = s[0];
		sc[1] = or(p[1], s[1]);
		
		return sc;
	}
	
	private static char[] halfAdder (char a, char b) {
		char sc[] = new char[2];
		
		char n4 = nand(a, b);
		char n1 = nand(n4, a);
		char n2 = nand(n4, b);
		char n5 = nand(n4, n4);
		char n3 = nand(n1, n2);
		
		sc[0] = n3;
		sc[1] = n5;
		
		return sc;
	}
	
	private static char or(char a, char b) {
		
		char p = nand(a, a);
		char q = nand(b, b);
		
		return nand(p, q);
	}
	
	private static char nand (char a, char b) {
		
		cont++;
		
		if(a == UM && b == UM) {
			return ZERO;
		}
		
		return UM;		
	}
}
