package ex4;
import interfaces.ChuckNorris;

import javax.swing.JOptionPane;


public class Ex_04 {
public static void main(String[] args) {
	
	ChuckNorris chuckNorris = new ChuckNorris();
	String nome;
	double salario;
	double vendas;
		
	nome = JOptionPane.showInputDialog("Digite o nome");
	salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
    vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas: "));

    JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSalário do Mês : R$"+salario+"\nVendas: R$"+vendas+"\nSalário Líquido: R$"+chuckNorris.calculaComissao(salario, vendas));
	
}
}
