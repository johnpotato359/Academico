
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String args[]){
		int n;
		String r = "";
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da tabuada que deseja calcular: "));
		r = Tabuada(n);
		System.out.println(r);
	}
	
	//Fun��o passando 1 par�metros
	static String Tabuada(int n){
		int calc=0;
		String str = "";
		for (int cta = 0; cta <= 10; cta++) {
			calc = cta *  n;
			str += calc + "\n";
		}
		return str;
	}
}
