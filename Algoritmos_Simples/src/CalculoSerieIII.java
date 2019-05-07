import javax.swing.JOptionPane;

public class CalculoSerieIII {
    public static void main(String args[]){
    double res=0;
    int j=1;
    Calcula(res, j);
    JOptionPane.showMessageDialog(null, Calcula(res,j));
    }
    
  //Função passando 2 parâmetros
    static double Calcula(double res, int j){
        for (int i = 1; i <= 50; i++) {
            res +=( i / (double)j);
            j+=2;
        }
        return  res;
    }
}
