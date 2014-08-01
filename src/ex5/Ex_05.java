package ex5;
import interfaces.ChuckNorris;

import javax.swing.JOptionPane;


public class Ex_05 {
public static void main(String[] args) {
	
	ChuckNorris chuckNorris = new ChuckNorris();
	
	String nome;
	Double n1;
	Double n2;
	Double n3;
	
	nome = JOptionPane.showInputDialog("Digite o nome");
	n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
	n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
	n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

    JOptionPane.showMessageDialog(null, "Média do aluno "+nome+" :\n"+chuckNorris.calculaMedia(n1, n2, n3));
	
}
}
