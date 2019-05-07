import java.util.Arrays;
import javax.swing.JOptionPane;

public class Matriz_Produtos {
	public static void main(String args[]){
		int matriz[][] = new int [4][3];
		CarregarMatriz(matriz);
		MostraMatriz(matriz);
		Calculos(matriz);
	}

	//Preencher Matriz
	static int[][] CarregarMatriz(int matriz[][]){
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cada produto: "));
			}
		}
		return matriz;


	}
	static void MostraMatriz(int matriz[][]){
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matriz[i][j] + "     ");
			}
			System.out.println("    ");
		}

	}

	static void Calculos(int matriz[][]){
		int mês [] = new int [3];
		int semana [] = new int [4];
		//Soma Linha
		for (int i = 0; i <= 3; i++) {
			int soma=0;
			for (int j = 0; j <= 2; j++) {
				semana[soma] += matriz[i][j];
			}
			System.out.println("Produtos vendidas na semana " + i + " foram: " + Arrays.toString(semana));
		}  

		//Soma Coluna
		int coluna=0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				mês[j] += matriz[i][j];
			}

		}
		System.out.println("A Quantidade de produtos vendido a cada semana: " + Arrays.toString(mês));

		//Soma Total
		int soma=0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				soma += matriz[i][j];
			}
		}
		System.out.println("Total de produtos vendidos no mês: " + soma);
	}
}