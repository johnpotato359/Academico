import javax.swing.JOptionPane;
public class CalculaInvestimento {
	public static void main(String args[]){

		JOptionPane.showMessageDialog(null,"Digite 1 para POUPANÇA ou 2 para RENDA FIXA");
		float tdi = Float.parseFloat(JOptionPane.showInputDialog("Digite o Tipo de Investimento: "));
		float vdi = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Investimento: "));
		Investimento(tdi,vdi);
	}
	
	//Procedimento passando 2 parâmetros
	static void Investimento(float tdi, float vdi){

		float vn;

		if (tdi == 1){
			vn = (float) (vdi + (vdi*0.03));
			JOptionPane.showMessageDialog(null,"O seu valor do investimento na conta POUPANÇA de 30 dias é: R$" + vn);
		}

		else if (tdi == 2){
			vn =(float) (vdi + (vdi*0.05));
			JOptionPane.showMessageDialog(null,"O seu valor do investimento na conta de RENDA FIXA de 30 dias é: R$" + vn);
		}
	}
}
