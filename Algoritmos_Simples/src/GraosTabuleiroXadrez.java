
import javax.swing.JOptionPane;

public class GraosTabuleiroXadrez {
	public static void main(String args[]){
		double n,cas;
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero: "));
		cas = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de casas: "));
		Carrega(n,cas);

	}
	
	//Procedimento passando 2 par�metros
	static void Carrega(double n,double cas){
		int aux;
		for (int i = 1; i <= cas; i++) {
			System.out.print("Casa: " + i + " ");
		}
		System.out.println("");
		for (int cta = 0; cta <= n; cta++) {
			aux = (int) Math.pow(2, cta);
			System.out.print("Qtd: " + aux+ " ");
		}
	}
}
