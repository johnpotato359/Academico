
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String args[]){
		int n;
		String r = "";
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tabuada que deseja calcular: "));
		r = Tabuada(n);
		System.out.println(r);
	}
	
	//Função passando 1 parâmetros
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
