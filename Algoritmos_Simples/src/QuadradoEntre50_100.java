
import javax.swing.JOptionPane;

public class QuadradoEntre50_100 {
	public static void main(String args[]){
		int i=10;
		String d = "";
		d = calc(i);
		System.out.println(d);
	}

	//Fun��o passando 1 par�metros
	static String calc(int i){
		int c=0;
		String str = "";
		while(i<150){

			c = (int) Math.pow(i,2);
			str += c + "\n";
			i++;
		}
		return str;

	}
}
