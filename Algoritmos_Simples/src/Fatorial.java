import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String args[]){
		int n,r;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular sua fatorial: "));
		r = fat(1,n);
		System.out.println(r);
	}
	
	//Função passando 2 parâmetros
	public static int fat(int i,int num){
		i = 1;
		while(num > 1){
			i = i*num;
			num--;
		}
		return i;

	}    
}
