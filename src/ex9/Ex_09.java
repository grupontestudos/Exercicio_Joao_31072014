package ex9;
import javax.swing.JOptionPane;
import interfaces.*;

public class Ex_09 {
	public static void main(String[] args) {
    
	ChuckNorris chuckNorris = new ChuckNorris();
    Double valorDeposito;
	Double valorTotal;
	
    valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
    valorTotal = chuckNorris.calculaRendimento(valorDeposito);
    
    JOptionPane.showMessageDialog(null, "Valor Depositado: "+valorDeposito+"\nValor total + rendimento: "+valorTotal);
	
	}
}
