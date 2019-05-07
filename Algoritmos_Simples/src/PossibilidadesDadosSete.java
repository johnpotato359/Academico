import javax.swing.JOptionPane;

public class PossibilidadesDadosSete {
    public static void main(String args[]){
    int d1 = 0,d2 = 0;
    Possibilidades(d1,d2);
    
    }
    
  //Procedimento passando 2 parâmetros
    static void Possibilidades(int d1, int d2){
        int tot = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i + j == 7){
                   JOptionPane.showMessageDialog(null, i+ " + " + j + " = 7");
                }
            }
        }
        
    }
}
