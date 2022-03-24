package fatecosasco.conversao;



public class ConverteTemperatura {
	double celsius;
	
	public static double paraFahrenheit( double celsius){
		//return celsius * 1.8 + 32;
		celsius = celsius * 1.8 + 32;
		return celsius;
	}
	public static double paraCelsius(double fahrenheit) {
		//return (fahrenheit - 32) * 5 / 9;
		
		fahrenheit = (fahrenheit - 32) * 5 / 9;
		return fahrenheit;
	}
	
}
