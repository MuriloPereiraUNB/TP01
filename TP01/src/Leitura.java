import java.util.Scanner;

public class Leitura {
	
	public static int lerInteiro() {
		return new Scanner(System.in).nextInt();
	}
	
	public static double lerTemp() {
		System.out.println("Leitura: ");
		return new Scanner(System.in).nextDouble();
	}

}
