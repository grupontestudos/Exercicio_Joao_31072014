package ex6;
import interfaces.ChuckNorris;
import javax.swing.JOptionPane;

public class Ex_06 {
public static void main(String[] args) {
	
	ChuckNorris chuckNorris = new ChuckNorris();
	int a;
	int b;
	int aux = 0;
    
	a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A:"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B:"));
    
	chuckNorris.calculaAuxiliar(a, b, aux);
	 
   }
}
