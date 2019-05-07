import javax.swing.JOptionPane;
public class Bhaskara {
	public static void main(String args[]){
		Double va = Double.parseDouble(JOptionPane.showInputDialog("Digite A: "));
		Double vb = Double.parseDouble(JOptionPane.showInputDialog("Digite B: "));
		Double vc = Double.parseDouble(JOptionPane.showInputDialog("Digite C: "));
		Calcraiz(va,vb,vc);
	}
	
	
	//Procedimento passando 3 parâmetros
	static void Calcraiz(double a, double b, double c)
	{
		double d,x1,x2;

		d = (b*b) - (4*a*c);
		JOptionPane.showMessageDialog(null,"O Valor do Delta é: " + d);

		if(d >= 0){
			x1 = ((-b + Math.sqrt(d))) / (2*a);
			x2 = ((-b - Math.sqrt(d)) / (2*a));
			JOptionPane.showMessageDialog(null,"As Raizes são: " + "X1: " + x1 + "\nX2: " + x2);
		}
		else{
			JOptionPane.showMessageDialog(null,"A raiz não existe!");
		}
	}
}
