import javax.swing.JOptionPane;


class MetodosIndicadores {
	public static void QtdEleitor (Abstrata [] t){
		int CTA;
		int VT [] = new int [11];
		String S = "";

		for(CTA = 0 ;CTA <100 ; CTA++){
			VT[t[CTA].NmrSec]++;
		}

		for(CTA = 0; CTA < 11; CTA++){
			S = S + "A Sess�o Eleitoral " + CTA +  " obteve o total de " + VT[CTA] + " de votos" + "\n";
		}
		JOptionPane.showMessageDialog(null,S);
	}

	public static void QtdCand (Abstrata[] t){
		int CTA;
		int VT [] = new int [301];
		String S = "";

		for(CTA = 0;CTA< 100;CTA++){
			VT[t[CTA].NmrCand] = VT[t[CTA].NmrCand] + 1;
		}

		for(CTA = 0;CTA < 301;CTA++){
			S = S + "O Candidato " + CTA + " " + VT[CTA]+ "\n";
		}
		System.out.println(S);
	}

	public static void MaiorMenor (Abstrata[] t) {
		int CTA,maior = 0, menor = 0;
		int vt[] = new int [11];
		for(CTA=0;CTA < 100; CTA++){
			vt[t[CTA].NmrSec] = vt[t[CTA].NmrSec] + 1;
		}
		for (CTA = 0; CTA < 10; CTA++){
			if(vt[CTA+1] > vt[CTA]){
				maior = CTA + 1;

			}
			if(vt[CTA+1] < vt[CTA]){
				menor = CTA + 1;

			}
		}
		JOptionPane.showMessageDialog(null, "A Sess�o com Maior n�mero de Eleitores �: " + maior + 
				"\n A Sess�o com Menor n�mero de Eleitores �: " + menor);  


	}

	public static void DezVotados (Abstrata[] t){
		int CTA,CTAB;
		String S = "";
		int vt[] = new int [301];
		int votos [] = new int [10];
		int candidato[] = new int [10];

		for(CTA = 0; CTA < 100; CTA++){

			vt[t[CTA].NmrCand] = vt[t[CTA].NmrCand] + 1;

		}
		for(CTAB = 0; CTAB < 10 ; CTAB++){
			for(CTA = 0; CTA < 301; CTA++){
				if(vt[CTA] > votos[CTAB]){
					votos[CTAB] = vt[CTA];
					candidato[CTAB] = CTA;
					vt[CTA] = 0;

				}
			}

		}
		for(CTA = 0; CTA < 10; CTA++){
			S = S +  CTA+1 + "º colocado: Candidato " + candidato[CTA] + " com " + votos[CTA] + " votos" + "\n";

		}
		JOptionPane.showMessageDialog(null,S);
	}

}

