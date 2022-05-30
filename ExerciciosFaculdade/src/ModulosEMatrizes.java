
import javax.swing.JOptionPane;


public class ModulosEMatrizes {


public static void somar (int vetor[]){


    int somatoria=0;
    for(int i=0;i<vetor.length;i++){
         somatoria=somatoria+=vetor[i];
        }
        JOptionPane.showMessageDialog(null,"a somatoria é: "+somatoria);
}


public static int produto(int vetor[]){


    int prod=1;
    for(int i=0;i<vetor.length;i++){
        prod=prod*vetor[i];
    }
    return prod;
}


    public static void main(String[] args) {


        int somatoria =0,vetor[]={2,4,6,8,10};
        int result;
        somar (vetor);
        result=produto(vetor);
JOptionPane.showMessageDialog(null,"A produtoria é : "+result);
System.exit(0);
    }
}