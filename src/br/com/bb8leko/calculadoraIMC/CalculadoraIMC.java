package br.com.bb8leko.calculadoraIMC;

public class CalculadoraIMC {
	
    private double imc(double altura, double peso) {
    	double alt = altura / 100;
    	double imc = peso / (alt * alt);
    	return imc; 
    }

    public static void main(String[] args) {
		CalculadoraIMC calc = new CalculadoraIMC();
		System.out.println("IMC: " + calc.imc(162, 78));
	}
}
