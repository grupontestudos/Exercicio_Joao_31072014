package ex2;
import interfaces.ChuckNorris;

import javax.swing.JOptionPane;

public class Ex_02 {

	public static void main(String[] args) {
		ChuckNorris chuckNorris = new ChuckNorris();
	   
		double n1;
		double n2;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
		JOptionPane.showMessageDialog(null, "Soma:"+chuckNorris.soma(n1, n2)+
				                            "\nSubtração: "+chuckNorris.subtracao(n1, n2)+
				                            "\nMultiplicação: "+chuckNorris.multiplicacao(n1, n2)+
				                            "\nDivisão: "+chuckNorris.divisao(n1, n2));
		
	}
}
