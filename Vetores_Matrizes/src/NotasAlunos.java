import javax.swing.JOptionPane;
public class NotasAlunos {
    public static void main (String args[]){
    double media;
    double vetornotas1 [] = new double [4];
    NotasUm(vetornotas1);
    JOptionPane.showMessageDialog(null, "Notas Carregadas!");
    media = ClassificaMedia(vetornotas1);
    JOptionPane.showMessageDialog(null,"A média do grupo é: " + media);
    JOptionPane.showMessageDialog(null,"A Quantidade de notas acima da média é: " + TotAcima(vetornotas1, media));
    PosicaoAbaixo(vetornotas1, media);
    }
 
    //Inserir notas
    static double[] NotasUm(double vet1[]){
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a N1 do " + i + "Âº Aluno"));
        }
    return vet1;
    }
    
    //Classificar Media
    static double ClassificaMedia(double vetornotas1[]){
        double media,tot=0;
        for (int i = 0; i < vetornotas1.length; i++) {
                tot = tot + vetornotas1[i];
        }
        media = tot/4;
        return media;
    }
    
    //Acima da Media
    static double TotAcima(double vetornotas1[], double media){
        double cta=0;
        for (int i = 0; i < vetornotas1.length; i++) {
            if(vetornotas1[i] > media){
                cta++;
                        }
                
        }
        return cta;
    }
    
    //Abaixo da Media
    static void PosicaoAbaixo(double a[], double b){
        for (int i = 0; i < a.length; i++) {
            if(a[i] < b){
            JOptionPane.showMessageDialog(null,"O Valor " + a[i] + "Está¡ abaixo da média");
            }
                
        }
    
    }
    }
