import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String args[]){
		int n,r;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para calcular sua fatorial: "));
		r = fat(1,n);
		System.out.println(r);
	}
	
	//Fun��o passando 2 par�metros
	public static int fat(int i,int num){
		i = 1;
		while(num > 1){
			i = i*num;
			num--;
		}
		return i;

	}    
}
