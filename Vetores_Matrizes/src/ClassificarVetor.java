import javax.swing.JOptionPane;
public class ClassificarVetor {
	public static void main(String args[]){
		int vetor[] = new int [5];
		vetor = CarregaVetor(vetor);
		ComparaValores(vetor);
		JOptionPane.showMessageDialog(null,"\n A média dos valores do vetor é: " +ClassificaMedia(vetor));


	}

	//Preencher Vetor
	public static int[ ] CarregaVetor(int vt[ ]){
		for (int i = 0; i < vt.length; i++) {
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}
		return vt;    
	}

	//Comparar Valores
	static void ComparaValores(int a[]){
		int maior = a[0];
		int menor = a[0];

		for (int i = 1; i < 5; i++) {
			if(a[i] > maior){
				maior = a[i];
			}
			else if(a[i] < menor){
				menor = a[i];
			}
		}
		JOptionPane.showMessageDialog(null,"O Maior Valor é: " + maior + "\n O menor valor é: " + menor);
	}

	//Classificar Media
	public static int ClassificaMedia(int vt[ ]){
		int soma=0, media=0;
		for (int i = 0; i < vt.length; i++) {
			soma = soma + vt[i];
		}
		media = soma / 5;
		return media;    
	}

}
