import javax.swing.JOptionPane;
public class Divis�velDois_Tres {
	public static void main(String args[]){

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		Divisivel(n1);
	}
	
	
	//Procedimento passando 1 par�metros
	static void Divisivel(int a){
		if (a % 2 == 0 && a % 3 == 0)
		{
			JOptionPane.showMessageDialog(null,"O n�mero � divis�vel por 2 e 3!");
		}

		else if(a % 2 == 0)
		{
			JOptionPane.showMessageDialog(null,"On�mero � divis�vel apenas por 2");
		}
		if ( a % 3 == 0)
		{
			JOptionPane.showMessageDialog(null,"O n�mero � divis�vel apenas por 3");
		}
		else if(a % 2 != 0 && a % 3 != 0)
		{
			JOptionPane.showMessageDialog(null,"O n�mero n�o � divis�vel por 2 e nem por 3 !");
		}

	}
}
