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
	String opcao;
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
	
	opcao = JOptionPane.showInputDialog("Deseja calcular o valor de outro carro (Digite N para parar de calcular ou qualquer outra tecla para continuar calculando)?");
	if (opcao.equals("")){
	JOptionPane.showMessageDialog(null, "A opção não pode ser deixada em branco.");
	opcao = JOptionPane.showInputDialog("Deseja calcular o valor de outro carro (Digite N para parar de calcular ou qualquer outra tecla para continuar calculando)?");
	}
	} 
	while (!opcao.equals("N"));
	}

	
	//Método de execução do exercício 21
	@Override
	public void executaExercicio21() {
	String nome;
	int idade;
	Character sexo;
	String saude;
		
	for (int i = 1; i < 10; i++) {
		
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		sexo = JOptionPane.showInputDialog("Digite o sexo: ('M' para masculino e 'F' para feminino: )").charAt(0);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		saude = JOptionPane.showInputDialog("Digite o seu estado de saúde (O para ótima, B para boa e R para regular)");
		
		if ((idade>18 && sexo.equals('M')) && ((saude.equals("B") || saude.equals("O")))){
		JOptionPane.showMessageDialog(null, "Olá "+nome+", você pode servir as forças armadas. ");	
		}else{
		JOptionPane.showMessageDialog(null, "Olá "+nome+", você não pode servir as forças armadas");	
		}	
	}
  }
	
	//Método de execução do exercício 22
	@Override
	public void executaExercicio22() {
    double precoCusto;
    double precoVenda;
    double mediaCusto = 0;
    double mediaVenda = 0;
    double somaCusto = 0;
    double somaVenda = 0;
    for (int i = 1; i < 10; i++) {
	precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra"));
	precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda"));
	somaCusto = somaCusto+precoCusto;
	somaVenda = somaVenda+precoVenda;
	mediaCusto = (somaCusto/i);
	mediaCusto = (somaVenda/i);
	if (precoCusto < precoVenda){
	JOptionPane.showMessageDialog(null, "Lucro");
	}else if (precoCusto > precoVenda){
	JOptionPane.showMessageDialog(null, "Prejuízo");	
	}else{
	JOptionPane.showMessageDialog(null, "Nem um nem outro");	
	}
	}
    JOptionPane.showMessageDialog(null, "Média Custo: " + mediaCusto);
    JOptionPane.showMessageDialog(null, "Média Custo: " + mediaVenda);	
	}
	
	//Método de execução do exercício 23
	@Override
	public void executaExercicio23() {
    double numero;
    
    numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
    
    if (numero > 80){
    JOptionPane.showMessageDialog(null, "O número é maior que 80.");	
    }else if (numero <25){
    JOptionPane.showMessageDialog(null, "O número é menor que 25.");	
    }else if (numero == 40){
    JOptionPane.showMessageDialog(null, "O número é igual a 40");	
    }else
    JOptionPane.showMessageDialog(null, "O número não se encontra em nenum dos intervalos especificados.");	
	}
	
	//Método de execução do exercício 24
	@Override
	public void executaExercicio24() {
	double numero;
    for (int i = 1; i < 10; i++) {
	numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
	if (numero > 0){
	JOptionPane.showMessageDialog(null, "Positivo");	
	}else if(numero < 0){
	JOptionPane.showMessageDialog(null, "Negativo");	
	}else
	JOptionPane.showMessageDialog(null, "Neutro");	
    }		
	}
	
	//Método de execução do exercício 25
	@Override
	public void executaExercicio25() {
	double numero1;
	double numero2;
	for (int i = 1; i < 10; i++) {
	numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
	numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
	if (numero1 == numero2){
	JOptionPane.showMessageDialog(null, "Números iguais");
	}
	if (numero1 != numero2){
	JOptionPane.showMessageDialog(null, "Números diferentes");
	}
	if (numero1>numero2){
	JOptionPane.showMessageDialog(null, "O primeiro é maior do que o segundo");		
	}
	if (numero1 < numero2) {
	JOptionPane.showMessageDialog(null, "O primeiro é menor do que o segundo");	
	}	
	}
	}
	
	//Método de execução do exercício 26
	@Override
	public void executaExercicio26() {
	int numero = 0;
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	switch (numero) {
	case 1 : JOptionPane.showMessageDialog(null, "Um");
	break;
	case 2 : JOptionPane.showMessageDialog(null, "Dois");
	break;
	case 3 : JOptionPane.showMessageDialog(null, "Três");
	break;
	case 4 : JOptionPane.showMessageDialog(null, "Quartro");
	break;
	case 5 : JOptionPane.showMessageDialog(null, "Cinco");
	break;
	default: JOptionPane.showMessageDialog(null, "Número inválido");
		break;
	}
	}
	
	//Método de execução do exercício 27
	@Override
	public void executaExercicio27() {
	double valor = 0;
	String combustivel;
	double total;
	double desconto = 0;
	
	do {
	valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro"));
	combustivel = JOptionPane.showInputDialog("Digite o tipo de combustível \nA - Álcool \nG - Gasolina \nD - Diesel");
	if(combustivel.equals("A")){
	    desconto = valor*0.25;	
	}
	if(combustivel.equals("G")){
		desconto = valor*0.21;	
		}
	if(combustivel.equals("D")){
		desconto = valor*0.14;	
	}
	total = valor - desconto;
	JOptionPane.showMessageDialog(null, "Desconto: " +desconto+ "\nTota: "+total);
	valor = Double.parseDouble(JOptionPane.showInputDialog("Deseja continuar"));
	} while (valor != 0);		
	}
	
	//Método de execução do exercício 28
	@Override
	public void executaExercicio28() {
	String nome;
	double salario;
	double salarioMinimo = 724;
	double reajuste = 0;
	double salarioTotal = 0;
	double folhaPagamento = 0;
    
	for (int i = 1; i < 5; i++) {
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));		
		
		if(salario  < (salarioMinimo * 3)){
			reajuste = salario*0.5;
			salarioTotal = salario+reajuste;
			JOptionPane.showMessageDialog(null, nome+ ": Reajuste de 50%.\nSalário Anterior: "+salario+"\nApós Reajuste: "+salarioTotal);
		}
		
		if(salario  > (salarioMinimo * 3) && salario < (salarioMinimo * 10)){
			reajuste = salario*0.20;
			salarioTotal = salario+reajuste;
			JOptionPane.showMessageDialog(null, nome+ "Reajuste de 20%.\nSalário Anterior: "+salario+"\nApós Reajuste: "+salarioTotal);
		}
		
		if(salario  > (salarioMinimo * 10) && salario  < (salarioMinimo * 20)){
			reajuste = salario*0.15;
			salarioTotal = salario+reajuste;
			JOptionPane.showMessageDialog(null, nome+ "Reajuste de 15%.\nSalário Anterior: "+salario+"\nApós Reajuste: "+salarioTotal);
		}
		
		if(salario  > (salarioMinimo * 20)){
			reajuste = salario*0.10;
			salarioTotal = salario+reajuste;
			JOptionPane.showMessageDialog(null, nome+ "Reajuste de 10%.\nSalário Anterior: "+salario+"\nApós Reajuste: "+salarioTotal);
		}
		
		folhaPagamento = folhaPagamento+reajuste;
		
	}
	    JOptionPane.showMessageDialog(null, "A empresa terá que aumentar R$" + folhaPagamento+" na folha de pagamento");
    }
	
	//Método de execução do exercício 29
	@Override
	public void executaExercicio29() {
	int mes;
	mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês"));
	switch (mes) {
	case 1: JOptionPane.showMessageDialog(null, "Janeiro");
	break;
	case 2: JOptionPane.showMessageDialog(null, "Fevereiro");
	break;
	case 3: JOptionPane.showMessageDialog(null, "Março");
	break;
	case 4: JOptionPane.showMessageDialog(null, "Abril");
	break;
	case 5: JOptionPane.showMessageDialog(null, "Maio");
	break;
	case 6: JOptionPane.showMessageDialog(null, "Junho");
	break;
	case 7: JOptionPane.showMessageDialog(null, "Julho");
	break;
	case 8: JOptionPane.showMessageDialog(null, "Agosto");
	break;
	case 9: JOptionPane.showMessageDialog(null, "Setembro");
	break;
	case 10: JOptionPane.showMessageDialog(null, "Outubro");
	break;
	case 11: JOptionPane.showMessageDialog(null, "Novembro");
	break;
	case 12: JOptionPane.showMessageDialog(null, "Dezembro");
	break;
	default: JOptionPane.showMessageDialog(null, "Mês inválido");
		break;
	}
    }
	
	@Override
	public void executaExercicio30() {
	String nome;
	int idade;
	Character sexo;
	double salario;
	double abono;
	
	nome = JOptionPane.showInputDialog("Digite o nome: ");
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
	sexo = JOptionPane.showInputDialog("Digite o sexo: ").charAt(0);
	salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
	
	if (sexo.equals('M') && idade >= 30){ 
	abono = 100;
	salario = salario+abono;
	}
	if (sexo.equals('M') && idade < 30){ 
		abono = 50;
		salario = salario+abono;
	}
	if (sexo.equals('F') && idade >= 30){ 
		abono = 200;
		salario = salario+abono;
	}
	if (sexo.equals('F') && idade < 30){ 
		abono = 80;
		salario = salario+abono;
	}
    JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSalário Líquido: "+salario);
	
	
	
	}
	
}
