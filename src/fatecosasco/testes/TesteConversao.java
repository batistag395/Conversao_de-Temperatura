package fatecosasco.testes;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import fatecosasco.conversao.ConverteTemperatura;

public class TesteConversao {
	
	public double celsius;
	public double fahrenheit;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String padrao = "###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		
		
		System.out.print("Digite o valor em graus celsius: ");
		
		double celsius = sc.nextDouble();
		
		
		System.out.print("Digite o valor em graus fahrenheit: ");
		
		double fahrenheit = sc.nextDouble();
		
		System.out.printf("O valor de celsius para fahrenheit é: " + df.format(ConverteTemperatura.paraFahrenheit(celsius)) + " %n");
		
		System.out.printf("O valor de celsius para fahrenheit é: " + df.format(ConverteTemperatura.paraCelsius(fahrenheit))  );
		
		
		sc.close();
	}

}
