package interfaces;

public interface ChuckNorrisI {
	
	public double divisao(double number1, double number2);
	public double multiplicacao(double number1, double number2);
	public double subtracao(double number1, double number2);
	public double soma (double number1, double number2);
	public double transformaCelsiusEmFarenheit(Double cel);
	public double converteDolaresEmReais(Double dolares, Double cotacao);
	public double calculaRendimento(Double valorDeposito);
	public double divideEmParcelas(Double valor, int parcelas);
	public double calculoCombustivel(double distancia, double combustivel);
	public double calculaComissao(double salario, double vendas);
	public double calculaMedia(double n1, double n2, double n3);
	public void calculaAuxiliar(int n1, int n2, int aux);
	
}
