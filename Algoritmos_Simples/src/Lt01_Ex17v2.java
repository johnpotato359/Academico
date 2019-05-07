
import javax.swing.JOptionPane;
public class Lt01_Ex17v2 {
	public static void main(String args[]){

		Double Tp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Tempo de Percurso: "));
		Double Vm  = Double.parseDouble(JOptionPane.showInputDialog("Digite a Velocidade Media: "));
		Litros(Tp,Vm);  
	}
	
	
	
	//Procedimento passando 2 parâmetros
	static void Litros(double a, double b)
	{
		double qtdl;

		qtdl = (a*b) / 12;
		JOptionPane.showMessageDialog(null,"A Quantidade de Litros Gastos foi: " + qtdl);
	}
}
