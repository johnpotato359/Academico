
import javax.swing.JOptionPane;
public class Maior_Valor {
	public static void main(String args[]){
		Double Valor1 =  Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero: "));
		Double Valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
		Compara(Valor1,Valor2);
	}


	//Procedimento passando 2 par�metros
	static void Compara(double a, double b)
	{
		if(a > b){
			JOptionPane.showMessageDialog(null,"O Maior Valor �: " + a);
		}
		else if(a < b){
			JOptionPane.showMessageDialog(null,"O maior valor �: " + b);
		}
	}

}
