
import javax.swing.JOptionPane;


 
public class Percurso_Gasolina {
	static Double TempoPercurso, VelocidadeMedia,Qtdl; 
	public static void main(String args[]){

		TempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o Tempo de Percurso: "));
		VelocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a Velocidade Media: "));

		ProcedureLitros();
		JOptionPane.showMessageDialog(null,"\n A Quantidade De Litros gastos é: " + Qtdl);
	}


	//Procedimento
	static void ProcedureLitros()
	{


		Qtdl = (TempoPercurso * VelocidadeMedia) / 12;


	}
}
