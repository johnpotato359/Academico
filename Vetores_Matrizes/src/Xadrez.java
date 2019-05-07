
import java.util.Random;
public class Xadrez {
	public static void main(String args[]){
		int M[][] = new int [8][8];
		int V[] = new int[7];
		Random n = new Random();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				M[i][j] = n.nextInt(7) + 1;

				V[M[i][j]-1]++;

				System.out.print("  " + M[i][j]);
			}
			System.out.println("");
		}

		System.out.println("SOMA:\nPeão:" + V[0] + "\t Torre: " + V[1] +"\t Bispo: " + V[2]
				+ "\t Cavalo: " + V[3] + "\t Rainha: " + V[4] + "\t Rei: " + V[5] + "\t Vazio: " + V[6]);

	}

}
