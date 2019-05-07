import javax.swing.JOptionPane;
public class ConcatenarVetor {
    public static void main(String args[]){
    int vetor1[] = {1, 2, 3};
    int vetor2[] = {4, 5, 6};
    int vetor3[] = new int [6];
    Concatena(vetor1, vetor2, vetor3);
    }
    
    static void Concatena(int a[],int b[], int c[]){
        for (int i = 0; i < 3; i++) {
            c[i] = a[i];
            JOptionPane.showInputDialog(null,c[i] + " | ");
        }
        
        for (int i = 0; i < 3; i++) {
            c[i] = b[i];
            JOptionPane.showInputDialog(null,c[i] + " | ");
        }
    }
}

