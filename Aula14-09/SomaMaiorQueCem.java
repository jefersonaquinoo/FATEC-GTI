package fatec;

import javax.swing.*;

public class SomaMaiorQueCem {

    public static void main(String args[]){
        int soma = 0;
        String numero = JOptionPane.showInputDialog("Informe um numero: ");
        int n = Integer.valueOf(numero);
        while(soma < 100){
            soma = soma + n;
            numero = JOptionPane.showInputDialog("Informe um numero: ");
            n = Integer.valueOf(numero);
        }
        JOptionPane.showMessageDialog(null, "A soma é maior que 100, valor: " + soma);


    }
}
