package ex8;
import interfaces.*;

import javax.swing.JOptionPane;

public class Ex_08 {
	public static void main(String[] args) {
    
	ChuckNorris chuckNorris = new ChuckNorris();
	
    Double dolares;
    Double cotacao;
    Double reais;
    
    dolares = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares"));
    cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar"));	
	reais = chuckNorris.converteDolaresEmReais(dolares, cotacao);
	
	JOptionPane.showMessageDialog(null, "Valor em reais: "+reais);
		
	}
}
