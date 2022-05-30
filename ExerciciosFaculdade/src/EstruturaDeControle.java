import javax.swing.*;


public class EstruturaDeControle {


    public static void main(String[] args) {


        int num1, num2, p=1;
        char op=0;
        String msg="" , msgEntr="Digite (1) para produto\nDigite (2) para produtória\n";
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);




        switch(op)
        {
            case '1':
            {
                if(num1>0&&num1>0)
                {
                    p=num1 * num2;
                    msg = msg+"produto de "+num1+" por "+num2+" = "+p+"\n\n";
                }
                break;
            }
            case '2':
            {
                for(int i=1;i<=num2; i=i+1)
                {
                    p=p*num1;
                }
                msg=msg+"produtória de "+num1+", "+num2+" vezes é: "+p+"\n\n";
                break;
            }
            default: JOptionPane.showMessageDialog(null,"Opção invalida, Não foi possivel calcular resultado.");



        }
        if (op>='1' && op<='3') 
        {
            JOptionPane.showMessageDialog(null,msg);
        }
        System.exit(0);



    }
}