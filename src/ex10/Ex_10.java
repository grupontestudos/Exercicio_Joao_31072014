package ex10;
import interfaces.ChuckNorris;

import javax.swing.JOptionPane;

public class Ex_10 {
	public static void main(String[] args) {
		
		ChuckNorris chuckNorris = new ChuckNorris();
		double valor;
		int parcelas;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
		parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas"));
		
		JOptionPane.showMessageDialog(null, "Valor das parcelas: " + chuckNorris.divideEmParcelas(valor, parcelas));
		
		
		
	}
}
