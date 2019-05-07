import javax.swing.JOptionPane;
public class BuscaVetor{
	public static void main(String args[]){
		int vet[] = new int [5];
		int busca;
		CarregaVetor(vet);
		OrdenaVetor(vet);
		busca = Integer.parseInt(JOptionPane.showInputDialog("Digite um número que queira fazer busca binária: "));
		BuscaBinaria(vet,busca);
	}
	
	//Carregar Vetor
	static void CarregaVetor(int a[]){
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}

	}
	
	
	//Ordenar Vetor
	static void OrdenaVetor(int a[]){
		int aux=0;
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if(a[i] > a[j]){
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;

				}
			}
		}
	}
	
	
	//Busca Binaria
	static int BuscaBinaria(int a[], int busca){
		int inicio=0,meio,fim;

		fim = a.length - 1;
		while(inicio <= fim){
			meio = (inicio + fim) / 2;
			if(a[meio] == busca){
				return meio;
			}
			else if (a[meio] < busca){
				inicio = meio + 1;
			}
			else if (a[meio] < busca){

				fim = meio - 1;
			}

		}
		return -1;
	}
}