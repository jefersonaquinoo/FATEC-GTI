/*1. Ler 2 valores e somar.*/


import javax.swing.*;

public class SomarDoisNumeros {

    public static void main(String args[]){
       String numero1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
       String numero2 = JOptionPane.showInputDialog("Informe o segundo numero: ");

       int n1 = Integer.valueOf(numero1);
       int n2 = Integer.valueOf(numero2);

       int soma = (n1 + n2);

       JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma);
    }
}
