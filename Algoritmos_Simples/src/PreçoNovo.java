import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class Pre�oNovo {
    public static void main(String args[]){
    
    float pt = Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o atual: "));
    float mm = Float.parseFloat(JOptionPane.showInputDialog("DIgite a m�dia mensal: "));
    Calc(pt,mm);
    }
    
    
  //Procedimento passando 2 par�metros
    static void Calc(float a,float b){
    
    float np;
        
    if (b < 500 && a < 30)
    {
        np =(float) (a*0.10) + a;
        JOptionPane.showMessageDialog(null,("O Novo Pre�o �:R$" + np));
    }
    else if (b >= 500 && b<1000 && a >= 30 && a<80)
    {
        np = (float) (a*0.15) + a;
        JOptionPane.showMessageDialog(null,("O Novo Pre�o �:R$" + np));
    }
    else if(b >= 1000 && a >= 80)
    {
        np = (float) (a - (a*0.05));
        JOptionPane.showMessageDialog(null,("O Novo Pre�o �:R$" + np));
    }
    else
    {
        np = a;
        JOptionPane.showMessageDialog(null,("O Novo Pre�o �:R$" + np));
    }
    
    }
}
