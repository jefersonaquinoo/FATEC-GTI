package fatec;

import javax.swing.*;

public class MostrarDobro {

    public static void main(String args[]){
        String numero = JOptionPane.showInputDialog("Informe um numero: ");
        int n = Integer.valueOf(numero);
        while(n != 0){
            JOptionPane.showMessageDialog(null, "O dobro de "
                    + n + " é: " + (n + n));
            numero = JOptionPane.showInputDialog("Informe um numero: ");
            n = Integer.valueOf(numero);
        }
        JOptionPane.showMessageDialog(null, "Ultimo numero digitado é: " + n);
    }
}
