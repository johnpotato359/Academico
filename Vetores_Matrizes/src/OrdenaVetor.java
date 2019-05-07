import javax.swing.JOptionPane;
public class OrdenaVetor {
	public static void main(String args[]){
		double vet[] = new double [10];
		double[] vetor = CarregaVetor(vet);
		OrdenaMostra(vetor);
	}

	//CarregarVetor
	static double[] CarregaVetor(double vet[]){
		for (int i = 0; i < 10; i++) {
			vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		}
		return vet;
	}

	//Ordenar e Exibir
	static void  OrdenaMostra(double[] a){
		double aux=0;
		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < 10; j++) {
				if(a[i] > a[j]){
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		System.out.print("| ");
		for (int cta = 0; cta < 10; cta++) {
			System.out.print(a[cta] + " | ");

		}
	}

}
