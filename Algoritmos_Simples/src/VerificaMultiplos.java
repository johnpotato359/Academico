import javax.swing.JOptionPane;
public class VerificaMultiplos {
    public static void main(String args []){
    
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        Multiplo(n1,n2);   
    }
    
    
  //Procedimento passando 2 par�metros
    static void Multiplo(int a, int b){
    
      if (a > b){
  
       if(a % b == 0)
       {
         JOptionPane.showMessageDialog(null,("� m�ltiplo"));  
           
       }
       else{
           JOptionPane.showMessageDialog(null,("N�o � m�ltiplo"));
       }
    }
           else if (a < b){
       
           if(b % a == 0){
                     JOptionPane.showMessageDialog(null,("� m�ltiplo"));
            }
           
           else{
                     JOptionPane.showMessageDialog(null,("N�o � m�ltiplo"));
            }
       }
    }
}
    

