package interfaces;

import javax.swing.JOptionPane;


public class ChuckNorris implements ChuckNorrisI{

	@Override
	public double transformaCelsiusEmFarenheit(Double cel) {
	return 9*cel+160;
	}

	@Override
	public double converteDolaresEmReais(Double dolares, Double cotacao) {
	return cotacao*dolares;
	}

	@Override
	public double calculaRendimento(Double valorDeposito) {
		return valorDeposito + (valorDeposito*0.7);
	}

	@Override
	public double divideEmParcelas(Double valor, int parcelas) {
		return valor/parcelas;
	}

	@Override
	public double soma(double number1, double number2) {
		return number1+number2;
	}

	@Override
	public double divisao(double number1, double number2) {
		return number1/number2;
	}

	@Override
	public double multiplicacao(double number1, double number2) {
		return number1*number2;
	}

	@Override
	public double subtracao(double number1, double number2) {
		return number1-number2;
	}

	@Override
	public double calculoCombustivel(double distancia, double combustivel) {
		return combustivel/distancia;
	}

	@Override
	public double calculaComissao(double salario, double vendas) {
		return salario+(vendas*0.15);
	}

	@Override
	public double calculaMedia(double n1, double n2, double n3) {
	return (n1+n2+n3)/3;	
	}

	@Override
	public void calculaAuxiliar(int n1, int n2, int aux) {
	aux = n1;
	n1 = n2;
	n2 = aux;
	JOptionPane.showMessageDialog(null, "Valor A: "+n1+"\nValor B: "+n2);		
	}

	
}
