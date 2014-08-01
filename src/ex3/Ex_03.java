package ex3;
import interfaces.ChuckNorris;

import javax.swing.JOptionPane;


public class Ex_03 {
public static void main(String[] args) {

	ChuckNorris chuckNorris = new ChuckNorris();
	
	double distancia;
	double combustivel;
	
	distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida"));
	combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o combustível gasto"));
    
	JOptionPane.showMessageDialog(null, "Consumo do carro:" +chuckNorris.calculoCombustivel(distancia, combustivel)+ " Km/L");
 
   }
}
