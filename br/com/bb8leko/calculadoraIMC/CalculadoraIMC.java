package br.com.bb8leko.calculadoraIMC;

//Calculadora IMC
public class CalculadoraIMC {
	//Método IMC
    private double imc(double altura, double peso) {
    	double alt = altura / 100;
    	double imc = peso / (alt * alt);
    	return imc; 
    }
    //Método Main
    public static void main(String[] args) {
		CalculadoraIMC calc = new CalculadoraIMC();
		System.out.println("IMC: " + calc.imc(170, 78));
	}
}
