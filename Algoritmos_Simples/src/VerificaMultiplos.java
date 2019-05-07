import javax.swing.JOptionPane;
public class VerificaMultiplos {
    public static void main(String args []){
    
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um nÃºmero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro nÃºmero: "));
        Multiplo(n1,n2);   
    }
    
    
  //Procedimento passando 2 parâmetros
    static void Multiplo(int a, int b){
    
      if (a > b){
  
       if(a % b == 0)
       {
         JOptionPane.showMessageDialog(null,("É múltiplo"));  
           
       }
       else{
           JOptionPane.showMessageDialog(null,("Não é múltiplo"));
       }
    }
           else if (a < b){
       
           if(b % a == 0){
                     JOptionPane.showMessageDialog(null,("É múltiplo"));
            }
           
           else{
                     JOptionPane.showMessageDialog(null,("Não é múltiplo"));
            }
       }
    }
}
    

