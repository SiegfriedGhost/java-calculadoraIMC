package br.com.bb8leko.calculadoraIMC;

//Calculadora IMC
public class CalculadoraIMC {
	//M�todo IMC
    private double imc(double altura, double peso) {
    	double alt = altura / 100;
    	double imc = peso / (alt * alt);
    	return imc; 
    }
    //M�todo Main
    public static void main(String[] args) {
		CalculadoraIMC calc = new CalculadoraIMC();
		System.out.println("IMC: " + calc.imc(170, 78));
	}
}
