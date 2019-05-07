import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String args[]){
		int n, num1=1, num2=0;
		String r = "";
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		r = Fibo(n,num1,num2);
		JOptionPane.showMessageDialog(null,"A Sequência Fibonacci é: " + Fibo(n,num1,num2));
	}
	
	//Função passando 3 parâmetros
	static String Fibo(int n,int num1,int num2){
		String str = "";
		for (int i = 0; i <= n; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			str += num1 + "\n";
		}       
		return str;
	}
}
