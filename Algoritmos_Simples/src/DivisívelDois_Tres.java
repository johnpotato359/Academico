import javax.swing.JOptionPane;
public class DivisívelDois_Tres {
	public static void main(String args[]){

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		Divisivel(n1);
	}
	
	
	//Procedimento passando 1 parâmetros
	static void Divisivel(int a){
		if (a % 2 == 0 && a % 3 == 0)
		{
			JOptionPane.showMessageDialog(null,"O número é divisível por 2 e 3!");
		}

		else if(a % 2 == 0)
		{
			JOptionPane.showMessageDialog(null,"Onúmero é divisível apenas por 2");
		}
		if ( a % 3 == 0)
		{
			JOptionPane.showMessageDialog(null,"O número é divisível apenas por 3");
		}
		else if(a % 2 != 0 && a % 3 != 0)
		{
			JOptionPane.showMessageDialog(null,"O número não é divisível por 2 e nem por 3 !");
		}

	}
}
