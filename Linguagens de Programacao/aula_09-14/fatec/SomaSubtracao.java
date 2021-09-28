/*2. Ler 2 valores verificar 
se o primeiro é maior que o segundo, se for subtrair, 
  senão somar.*/

package fatec;

import javax.swing.*;

public class SomaSubtracao {

    public static void main(String args[]){
        String numero1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
        String numero2 = JOptionPane.showInputDialog("Informe o segundo numero: ");

        int n1 = Integer.valueOf(numero1);
        int n2 = Integer.valueOf(numero2);

        if (n1 > n2){
            int sub = n1 - n2;
            JOptionPane.showMessageDialog(null,"O número " + n1 +
                    " é maior que " + n2 + ", a subtração é: " + sub);
        } else if (n1 < n2){
            int soma = n1 + n2;
            JOptionPane.showMessageDialog(null,"O número " + n2 +
                    " é maior que " + n1 + ", a soma é: " + soma);
        } else {
            JOptionPane.showMessageDialog(null,"Os números são iguais!");
        }

    }
}
