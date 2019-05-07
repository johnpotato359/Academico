/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
import javax.swing.JOptionPane;
public class Calculo_Salario {
    static Double SalarioBruto, SalarioLiquido;
    
    
        public static void main(String args[]){
        SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALARIO BRUTO"));
        
        ProcedureSalario();
        JOptionPane.showMessageDialog(null,"\n Salario Liquido =" + SalarioLiquido);
        }
        
        
        static void ProcedureSalario()
        {
            Double Desconto;
            if(SalarioBruto < 500){
                Desconto = 0.0;
            }
            else if (SalarioBruto >=500 && SalarioBruto < 800){
                Desconto = 0.05;
            }
            else {
                Desconto = 0.15;
            }
        SalarioLiquido = (SalarioBruto - (SalarioBruto * Desconto));
        }
}
