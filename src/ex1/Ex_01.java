package ex1;
import interfaces.*;
import javax.swing.JOptionPane;

public class Ex_01 {

	public static void main(String[] args) {

		ChuckNorris chuckNorris = new ChuckNorris();
		double n1;
		double n2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
		JOptionPane.showMessageDialog(null, "Resultado da soma:" + chuckNorris.soma(n1, n2));

	}

}
