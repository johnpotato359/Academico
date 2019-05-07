import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class Metodos {

	public Abstrata[] Carrega(Abstrata[] t){
		int CTA;
		Random rand = new Random();
		for(CTA = 0; CTA < 100; CTA++){
			t[CTA] = new Abstrata();
		}

		for(CTA = 0; CTA < 100; CTA++){
			t[CTA].NmrSec = rand.nextInt(11);
			t[CTA].NmrCand = rand.nextInt(301);

		}

		return t;
	}

	public Abstrata[] Organiza(Abstrata[] t){
		int CTA,CTAB;

		for(CTA = 0;CTA < 99; CTA++){
			for(CTAB = CTA +1;CTAB < 100; CTAB++){
				if(t[CTA].NmrSec > t[CTAB].NmrSec){
					Abstrata aux = t[CTA];
					t[CTA] = t[CTAB];
					t[CTAB] = aux;
				}
			}
		}
		return t;
	}

	public Abstrata[] Grava(Abstrata[] t) throws IOException{
		int CTA;
		String filename = "Votação2018.txt";
		BufferedWriter w = new BufferedWriter(new FileWriter(filename));

		for(CTA = 0;CTA < 100;CTA++){
			w.write(Integer.toString(t[CTA].NmrSec));
			w.newLine();
			w.write(Integer.toString(t[CTA].NmrCand));
			w.newLine();
		}
		w.close();
		return t;
	}
}
