import javax.swing.JOptionPane;

public class Potencia {
	public static void main(String args[]){
		double n,e;
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
		e = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente: "));
		Carrega(n,e);
	}
	
	//Procedimento passando 2 parâmetros
	static void Carrega(double a, double b){
		double r;

		r = Math.pow(a, b);

		System.out.println(a +" ^ " + b + " = " + r);
	}
}
