
import javax.swing.JOptionPane;


public class Diferenca_Valor {
	public static void main(String args[]){
		int Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		int Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor: "));
		Compara(Valor1,Valor2);
	}

	//Procedimento passando 2 parâmetros
	static void Compara(int a, int b)
	{
		int dif;

		if(a > b){
			dif = a - b;
		}
		else{
			dif = b - a;
		}
		JOptionPane.showMessageDialog(null,"A diferença do maior valor pelo menor é: " + dif);
	}
}

