import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String args[]){
		int n, num1=1, num2=0;
		String r = "";
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		r = Fibo(n,num1,num2);
		JOptionPane.showMessageDialog(null,"A Sequ�ncia Fibonacci �: " + Fibo(n,num1,num2));
	}
	
	//Fun��o passando 3 par�metros
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
