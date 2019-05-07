
public class MatrizOito_Oito {
	static int s1=0,s2=0;
	public static void main(String args[]){
		int m[][] = new int [2][8];
		CarregarMatriz(m);
		SomarLinhas(m);
		Mostrar(m,s1,s2);
	}

	//Preencher Matriz
	public static void CarregarMatriz(int a[][]){
		int c=0,e=0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				if(a[0][j] == 0){
					a[i][j] = c + 1;
					c += 1;

				}
				else{
					a[i][j] = (int)Math.pow(2, e);
					e += 1;

				}
			}
		}
	}

	//Somar Linhas
	static void SomarLinhas(int a[][]){
		for (int j = 0; j < 8; j++) {
			s1 += a[0][j];
			s2 += a[1][j];
		}

	}

	//Exibir Matriz
	static void Mostrar(int a[][], int b, int c){
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(a[i][j] + "     ");
			}
			System.out.println("     ");
		}
		System.out.println("A soma da linha 1 é: " + b + "\n A soma da linha 2 é: " + c);

	}
}

