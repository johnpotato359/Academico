
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicho
 */
import javax.swing.JOptionPane;
public class VelocidadeMedia {
	public static void main(String args[]){

		float v = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de voltas: "));
		float c = Float.parseFloat(JOptionPane.showInputDialog("Digite a extens�o do circuito(em metros): "));
		float d = Float.parseFloat(JOptionPane.showInputDialog("Digite a dura��o do percurso(em minutos): "));
		Calc(v,c,d);
	}
	
	//Procedimento passando 3 par�metros
	static void Calc(float a,float b,float c){

		float vm;

		vm = (a*b) / c;

		JOptionPane.showMessageDialog(null,("A Velocidade m�dia �:" + vm + " KM/H"));
	}
}
