
public class Espiral {
	public static void main(String args[]){
		int m[][] = new int [8][8];
		CarregarMatriz(m);
		MostrarMatriz(m);
	}

	static int [][] CarregarMatriz(int m[][]){
		for (int i = 1; i <= 4; i++) {
			for (int j = i-1; j <= 8-i; j++) {
				for (int k = i-1; k <= 8-i; k++) {
					m[j][k] = i;
				}
			}
		}

		return m;
	}

	static void MostrarMatriz(int m[][]){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(m[i][j] + "     ");
			}
			System.out.println("     ");
		}


	}
}
