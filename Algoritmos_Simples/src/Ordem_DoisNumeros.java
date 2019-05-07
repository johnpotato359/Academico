import javax.swing.JOptionPane;
public class Ordem_DoisNumeros {
	public static void main(String args[]){

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outr número: "));
		Ordem(n1,n2);
	}
	
	//Procedimento passando 2 parâmetros
	static void Ordem(int a , int b){
		if (a == b){
			JOptionPane.showMessageDialog(null,"Digite números Diferentes!");
		}
		else if (a > b){
			JOptionPane.showMessageDialog(null,b + "\n" + a);
		}
		else{
			JOptionPane.showMessageDialog(null,a + "\n" + b);
		}

	}
}
