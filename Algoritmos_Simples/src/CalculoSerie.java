import javax.swing.JOptionPane;

public class CalculoSerie {
	public static void main(String args[]){
		double num,result;
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		result = Calc(num);
		System.out.println(result);
	}
	
	//Função passando 1 parâmetros
	static double Calc(double num){
		float cta=1,result=0,aux;
		while(cta <= num){
			aux = 1 / cta;
			cta++;
			result += aux;

		}
		return result;
	}
}