import javax.swing.JOptionPane;

public class Ordena_QuatroNumeros {
	public static void main(String args[]){

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite N1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite N2: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite N3: "));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("DIgite N4: "));
		Organizar(n1,n2,n3,n4);
	}

	
	//Procedimento passando 4 parâmetros
	static void Organizar(int a, int b, int c, int d){

		if (d>c)
		{
			JOptionPane.showMessageDialog(null,a + "\n" + b + "\n"  + c + "\n" + d);
		}
		else if (d<a)
		{
			JOptionPane.showMessageDialog(null,d + "\n" + a + "\n"  + b + "\n" + c);
		}
		else if (d<b && d>a)
		{
			JOptionPane.showMessageDialog(null,a + "\n" + d + "\n"  + b + "\n" + c);
		}
		else if(d>b && d<c)
		{
			JOptionPane.showMessageDialog(null,a + "\n" + b + "\n" + d + "\n" + c);
		}

	}
}
