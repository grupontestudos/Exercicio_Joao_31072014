package interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @author João Lucas Fernandes, Aug 1, 2014
 */
public class Main implements MainInterface{

	//Método de execução do exercício 1
	@Override
	public void executaExercicio01(){
	double numero1;
	double numero2;
		
	numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
	numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
	
	JOptionPane.showMessageDialog(null, "Resultado da soma:" + (numero1 + numero2));
	}
	
	//Método de execução do exercício 2
	@Override
	public void executaExercicio02(){
	double numero1;
	double numero2;
			
	numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
	numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
	double soma = numero1+numero2;
	double subtracao = numero1 - numero2;
	double multiplicacao = numero1 * numero2;
	double divisao = numero1/numero2;
		
	JOptionPane.showMessageDialog(null, "Soma:"+soma+
			                            "\nSubtração: "+subtracao+
			                            "\nMultiplicação: "+multiplicacao+
			                            "\nDivisão: "+divisao);
	}
	
	//Método de execução do exercício 3
	@Override
	public void executaExercicio03(){
    double distancia;
	double combustivel;
	double calculoCombustivel;
	
	distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida"));
	combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o combustível gasto"));
	
	calculoCombustivel = combustivel/distancia;
	
	JOptionPane.showMessageDialog(null, "Consumo do carro:" +calculoCombustivel+ " Km/L");
		
	}
	
	//Método de execução do exercício 4
	@Override
	public void executaExercicio04(){
	String nome;
	double salario;
	double vendas;
	double calculoComissao;
	
	nome = JOptionPane.showInputDialog("Digite o nome: ");
	salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
	vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas: "));
	
	calculoComissao = salario+(vendas*0.15);
	
	JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSalário do Mês : R$"+salario+"\nVendas: R$"+vendas+"\nSalário Líquido: R$"+calculoComissao);
		
	}
	
	//Método de execução do exercício 5
	@Override
	public void executaExercicio05(){
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double media;
	
	nome = JOptionPane.showInputDialog("Digite o nome");
	nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
	nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
	nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
	
	media = (nota1+nota2+nota3)/3;

	JOptionPane.showMessageDialog(null, "Média do aluno "+nome+" :\n"+media);
		
	}
	
	//Método de execução do exercício 6
	@Override
	public void executaExercicio06(){
	int a;
	int b;
	int aux = 0;
	    
	a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A:"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B:"));
	
	aux = a;
	a = b;
	b = aux;
	
	JOptionPane.showMessageDialog(null, "Valor de A: "+a+". Valor de B: "+b);
	}
	
	//Método de execução do exercício 7
	@Override
	public void executaExercicio07(){
	double far;
	double cel;
		
	cel = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
	far = (9*cel+160)/5;
		
	JOptionPane.showMessageDialog(null, "Temperatura em Farenheit"+far);
	}
	
	//Método de execução do exercício 8
	@Override
	public void executaExercicio08(){
    double dolares;
    double cotacao;
    double reais;
    double conversao;
    
    dolares = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares"));
    cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar"));
    
    conversao = cotacao*dolares;
    reais = conversao;
    	
	JOptionPane.showMessageDialog(null, "Valor em reais: "+reais);
	}
	
	//Método de execução do exercício 9
	@Override
	public void executaExercicio09(){
    double valorDeposito;
	double valorTotal;
	
	valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
	
	valorTotal = valorDeposito + (valorDeposito*0.7);
	
	JOptionPane.showMessageDialog(null, "Valor Depositado: "+valorDeposito+"\nValor total + rendimento: "+valorTotal);
	}
	
	//Método de execução do exercício 10
	@Override
	public void executaExercicio10(){
	double valor;
	int parcelas;
	double valorParcelas;
	
	valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
	parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas"));
	
	valorParcelas = valor/parcelas;
	JOptionPane.showMessageDialog(null, "Valor das parcelas: " + valorParcelas);
		
	}
	
	//Método de execução do exercício 11
	@Override
	public void executaExercicio11() {
    double preco;
    double percent;
    double precoTotal;
    
    preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra"));
    percent = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual"));
    
	precoTotal = preco+(preco*(percent/100));
	
	JOptionPane.showMessageDialog(null, "O preço total do produto + percentual é: " + precoTotal);
	}

	//Método de execução do exercício 12
	@Override
	public void executaExercicio12() {
	double distribuidor = 0.28;
	double impostos = 0.45;
	double custoFabrica;
	double valorTotal;
	
	custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de custo do carro: "));
    valorTotal = custoFabrica+(custoFabrica*distribuidor)+(custoFabrica*impostos);
    
    JOptionPane.showMessageDialog(null, "O valor total do carro com as taxas é de: "+valorTotal);	
	}

	//Método de execução do exercício 13
	@Override
	public void executaExercicio13() {
	double numero;
	
	numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
	
	if (numero > 10){
	JOptionPane.showMessageDialog(null, "O número digitado é maior que 10!");
	}
	else{
	JOptionPane.showMessageDialog(null, "O número digitado é menor ou igual a 10!");	
	}
	}

	//Método de execução do exercício 14
	@Override
	public void executaExercicio14() {
	double numero1;
	double numero2;
	
    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
    
    if (numero1 > numero2){
    JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo.");
    }
    else if (numero1 == numero2){
   	JOptionPane.showMessageDialog(null, "O primeiro número é igual ao segundo.");	
    }
    else
    JOptionPane.showMessageDialog(null, "O primeiro número é menor do que o segundo.");	
    }
	
	//Método de execução do exercício 15
	@Override
	public void executaExercicio15() {
    double numero;
    
    numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
    
    if (numero > 100 && numero < 200){
    JOptionPane.showMessageDialog(null, "O número está no intervalo entre 100 e 200!");
    }else
    JOptionPane.showMessageDialog(null, "O número não está no intervalo entre 100 e 200!");
	}
		
	//Método de execução do exercício 16
	@Override
	public void executaExercicio16() {
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double media;
	
	nome = JOptionPane.showInputDialog("Digite o nome: ");
	nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
	nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
	nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
	
	DecimalFormat df = new DecimalFormat("0.00");
	media = nota1+nota2+nota3/3;
	
	if (media >= 7){
	  JOptionPane.showMessageDialog(null, "Olá, "+nome+" você obteve a média: " +df.format(media)+", e foi aprovado!");	
	} else if (media < 5){
	  JOptionPane.showMessageDialog(null, "Olá, "+nome+" você obteve a média: " +df.format(media)+", e foi reprovado!");
	} else
	  JOptionPane.showMessageDialog(null, "Olá, "+nome+" você obteve a média: " +df.format(media)+", e está de recuperação!");  
	}
	
	//Método de execução do exercício 17
	@Override
	public void executaExercicio17(){
	int numero;
	List<Integer> listaNumeros = new ArrayList<>();	
	
	 for (int i = 0; i < 10; i++) {
	  numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição "+i));
	   if(numero >= 10 && numero <= 80){
	   listaNumeros.add(numero);	
	   }
	 }
	  JOptionPane.showMessageDialog(null, "Números no intervalo entre 10 e 80: " +listaNumeros);
    }
	
	//Método de execução do exercício 18
	public void executaExercicio18(){
	String nome;
	int idade;
	
	for (int i = 0; i < 10; i++) {
	nome = JOptionPane.showInputDialog("Digite o nome: ");
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
	if (idade >= 18){
	JOptionPane.showMessageDialog(null, nome+": Maior de idade.");	
	}else
	JOptionPane.showMessageDialog(null, nome+": Menor de idade.");
	}
	}
	
	//Método de execução do exercício 19
	@Override
	public void executaExercicio19(){
	String nome;
	char sexo;
    
    for (int i = 0; i < 10; i++) {
      nome = JOptionPane.showInputDialog("Digite o seu nome");
      sexo = JOptionPane.showInputDialog("Digite o seu sexo (M para masculino e F para feminino): ").charAt(0);	
	  
      if(sexo == 'M'){
      JOptionPane.showMessageDialog(null, "Olá " +nome+", você escolheu o sexo masculino. ");  	
      }else if(sexo == 'F'){
      JOptionPane.showMessageDialog(null, "Olá " +nome+", você escolheu o sexo feminino. ");  
      }else
      JOptionPane.showMessageDialog(null, "Sexo inválido. Preencha com M para masculino e com F para feminino. ");	
	 }
    }
	
	
	//Método de execução do exercício 20
	@Override
	public void executaExercicio20(){
	String modelo;
	int ano;
	double valor;
	double percentual;
	double desconto;
	double total;
	char opcao;
	do {
	modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
	valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro: "));
	ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: "));
	if (ano <= 2000){
    percentual = 0.12;
	}
	else{
	percentual = 0.07;	
	}
	desconto = valor*percentual;
	total = valor-desconto;
	JOptionPane.showMessageDialog(null, "O valor do carro "+modelo+" é de: "+valor+", e com o desconto de "+desconto+" cai para: "+total);
	opcao = JOptionPane.showInputDialog("Deseja calcular o valor de outro carro (Digite N para parar de calcular ou qualquer outra tecla para continuar calculando)?").charAt(0);
	} 
	while (opcao != 'N');
	}
}
