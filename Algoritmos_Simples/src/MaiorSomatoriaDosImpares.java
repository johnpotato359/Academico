import javax.swing.JOptionPane;

public class MaiorSomatoriaDosImpares {
	public static void main (String args[]){
		int n1,n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		JOptionPane.showMessageDialog(null,"A Soma Dos n�meros �mpares � = " + Calc(n1,n2));
		Compara(n1,n2);
	}
	
	//Fun��o passando 2 par�metros
	public static int Calc(int n1, int n2){
		int tot=0;
		if(n1 > n2){
			for (int i = n2; i < n1; i++) {
				if(i%2 != 0){
					tot = tot + i;    
				}
			}
		}
		else{
			for (int i = n1; i < n2; i++) {
				if(i%2 != 0){
					tot = tot + i;    

				}
			}

		}
		return tot;
	}

	//Procedimento passando 2 par�metros
	public static void Compara(int n1, int n2){
		if(n1 > n2){
			JOptionPane.showMessageDialog(null,"O Maior � = " + n1);
		}
		else{
			JOptionPane.showMessageDialog(null,"O Maior � = " + n2);
		}
	}


}

