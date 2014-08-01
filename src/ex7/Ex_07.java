package ex7;
import interfaces.ChuckNorris;
import javax.swing.JOptionPane;

public class Ex_07 {
	public static void main(String[] args) {
		
		ChuckNorris chuckNorris = new ChuckNorris();
		
		Double far;
		Double cel;
		
		cel = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
		far = chuckNorris.transformaCelsiusEmFarenheit(cel);
		
		JOptionPane.showMessageDialog(null, "Temperatura em Farenheit"+far);
	}
}
