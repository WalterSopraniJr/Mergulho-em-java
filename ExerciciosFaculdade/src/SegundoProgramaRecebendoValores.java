import javax.swing.*;

public class SegundoProgramaRecebendoValores {

	public static void main (String entrada[])
    {
        int n1, n2, mod;
        double pot;
        String msg="";


        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro: "));


        mod = n1 / n2;
        pot = Math.pow(n1, n2);


        msg = msg + "quociente da divis�o de " + n1 + " por " + n2 + " = " + mod + "\n";


        msg = msg + "pot�ncia de " + n1 + " por " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);


        System.exit(0);
    }
}