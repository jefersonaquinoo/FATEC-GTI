package fatec;

import javax.swing.*;

public class ContadorNumeros {

    public static void main(String args[]){
        int cont = 0;
        String numero = JOptionPane.showInputDialog("Informe um numero: ");
        int n = Integer.valueOf(numero);
        while(n != 0){
            cont ++;
            numero = JOptionPane.showInputDialog("Informe um numero: ");
            n = Integer.valueOf(numero);
        }
        JOptionPane.showMessageDialog(null, "Quantidade de numeros digitados: " + cont);

    }
}
