import javax.swing.JOptionPane;
public class DiagonalPrincipal{
	public static void main(String args[]){
		int M[][] = new int [4][4];
		CarregaMatriz(M);
		MostraMatriz(M);
	}

	//Preencher Matriz
	static void CarregaMatriz(int a[][]){
		int e = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				if(i == j){
					a[i][j] = (int) Math.pow(4,e);
					e += 1;
				}
			}
		}
	}

	//Exibir Matriz
	static void MostraMatriz(int a[][]){
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + "    ");
			}
			System.out.println("  ");
		}

	}
}
