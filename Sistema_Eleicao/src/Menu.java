import java.io.IOException;
import javax.swing.JOptionPane;

public class Menu {
	public static void main(String args[]) throws IOException{
		Metodos t = new Metodos();
		Abstrata[] votacao = new Abstrata[100];
		int opc = 0;
		String menu = "1- Carregar Sess�o/N�mero Eleitor" + "\n2- Classificar por Sess�o" + "\n3- Gravar Registros" + "\n4- Mostrar Indicadores" + "\n9- Finalizar Programa";

		//EscolhaCaso
		while (opc != 9){
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu,opc));
			switch(opc){

			case 1: votacao = t.Carrega(votacao);
			JOptionPane.showMessageDialog(null,"Dados gerados!");
			break;

			case 2: votacao = t.Organiza(votacao);
			JOptionPane.showMessageDialog(null,"Sess�es Classificadas!");
			break;

			case 3: votacao = t.Grava(votacao);
			JOptionPane.showMessageDialog(null,"Arquivo Gerado!");
			break;

			case 4: Menu.Indicador(votacao);
			break;

			case 9:JOptionPane.showMessageDialog(null,"Finalizando...");
			break;

			default:
				JOptionPane.showMessageDialog(null,"Op��o Inv�lida!");
			}

		}
	}

	//Menu 2
	public static void  Indicador (Abstrata[] votacao){
		int opc =0;
		String menu = "         ESTAT�STICA DE VOTA��O 2018         " + "\n1- Quantidade de Eleitores por Sess�o" + "\n2- Sess�o com Maior e Menor n�mero de Eleitores"
				+ "\n3- Quantidade de votos por Candidato" + "\n4- 10 Primeiros colocados" + "\n9- Finaliza Consulta";
		while (opc != 9){
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu,opc));
			switch(opc){

			case 1:MetodosIndicadores.QtdEleitor(votacao);
			break;

			case 2:MetodosIndicadores.MaiorMenor(votacao);
			break;

			case 3:MetodosIndicadores.QtdCand(votacao);
			break;

			case 4:MetodosIndicadores.DezVotados(votacao);
			break;

			case 9:
				break;

			default:
				JOptionPane.showMessageDialog(null,"Op��o Inv�lida!");

			}

		}
	}
}

