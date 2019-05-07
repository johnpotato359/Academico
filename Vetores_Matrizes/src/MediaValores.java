import javax.swing.JOptionPane;
public class MediaValores {
	public static void main(String args[]){
		int vetor[] = new int [5];
		int tot=0,opc = 0;
		double md=0.0;
		// Escolha Caso
		while ( opc != 9){
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classifica MÃ©dia entre 10 e 200 " 
					+ "\n 3 - Classifica Ã�mpares \n 4 - Mostra Valores \n  9- FIM"));
			switch(opc){
			case 1 :
				vetor = CarregaVetor(vetor);
				break;
			case 2:
				md = ClassificaMedia(vetor);
				JOptionPane.showMessageDialog(null,"Media Classificada entre 10 e 200");
				break;
			case 3:
				tot = ClassficaImp(vetor);
				JOptionPane.showMessageDialog(null,"Total de nÃºmeros de Ã­mpares somados!");
				break;
			case 4:
				MostraValores(md,tot);
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Fim");
				System.exit(0);
				break;
			default: JOptionPane.showMessageDialog(null,"OpÃ§Ã£o InvÃ¡lida!"); 
			}
		}

	}
	
	//Preencher Vetor
	public static int[ ] CarregaVetor(int vt[ ]){
		for (int cta = 0; cta < vt.length; cta++) {
			vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Nota: "));
		}
		return vt;
	}
	
	//Classificar Média
	public static double ClassificaMedia(int vt[ ]){
		int soma=0,cta=0;
		double media=0;
		for (int i = 0; i < vt.length; i++) {
			if(vt[i] > 10 && vt[i] < 200){
				soma = soma + vt[i];
				cta = cta + 1;
			}
			media = soma / cta;
		}
		return media;
	}
	
	//Classificar Ímpares
	public static int ClassficaImp(int vt[]){
		int tot=0;
		for (int i = 0; i < vt.length; i++) {
			if(vt[i] % 2 != 0){
				tot = tot + vt[i];
			}
		}
		return tot;
	}

	//Exibir Valores
	public static void MostraValores(double media,int total){
		System.out.println("A MÃ©dia dos valores entre 10 e 200 Ã©: " + media);
		System.out.println("A soma dos Ã­mpares Ã©: " +total );
	}
}