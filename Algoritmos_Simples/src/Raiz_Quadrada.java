
import javax.swing.JOptionPane;
public class Raiz_Quadrada {
	public static void main(String args[]){
		int r,n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para calcular seu quadrado: "));
		r = calc(n);
		System.out.println(r);
	}
	
	//Fun��o
	
	static int calc(int qrd){
		qrd = qrd * qrd;
		return qrd;
	}
}
