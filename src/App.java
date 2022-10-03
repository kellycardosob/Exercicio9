import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; 

		
		System.out.println("Digite a temperatura em Fahrenheit");
		Fahrenheit = entrada.nextInt();
		
		Celsius = 5* ( Fahrenheit -32 ) / 9;

		System.out.println("A temperatura convertida para Celsius é " + Celsius + " graus" );
		
    }
}