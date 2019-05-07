import javax.swing.JOptionPane;


public class CalculoSerieII {
	public static void main(String args[]){
		double e,n,fat=0;

		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		e = 1;
		Calcula(n,e,fat);   
		JOptionPane.showMessageDialog(null,"A soma da sequência Ã©: " + Calcula(n,e,fat));        
	}
	
	//Função passando 3 parâmetros
	static double Calcula(double n, double e, double fat){
		for (int i = 1; i <= n; i++) {
			fat = 1;
			for (int j = 1; j <= i; j++) {
				fat *= j;
			}
			e = e + (1/fat);
		}
		return e;
	}
}
