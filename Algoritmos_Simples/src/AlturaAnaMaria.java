import javax.swing.JOptionPane;

public class AlturaAnaMaria {
    public static void main(String args[]){
    double ana = 1.1, maria = 1.5;
    int ano = 0;
    Classifica(ana, maria, ano);
    JOptionPane.showMessageDialog(null, "A Quantidade de anos �: " + Classifica(ana, maria, ano));
    }
    
  //Fun��o passando 3 par�metros
    static double Classifica (double ana, double maria, int ano){
        while( ana < maria){
        ana += 0.03;
        maria += 0.02;
        ano ++;
        }
        return ano;
    }
}
