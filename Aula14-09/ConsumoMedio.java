package fatec;

import javax.swing.*;

public class ConsumoMedio {

    public static void main(String args[]){
        String inicio = JOptionPane.showInputDialog("Informe o KM inicial: ");
        String fim = JOptionPane.showInputDialog("Informe o KM final: ");
        String combustivel = JOptionPane.showInputDialog("Informe a quantidade de litros consumidos: ");

        double kmInicio = Double.valueOf(inicio);
        double kmFinal = Double.valueOf(fim);
        double qtd = Double.valueOf(combustivel);

        double qtdKM = (kmFinal - kmInicio);
        double consumo = (qtdKM/qtd);

        JOptionPane.showMessageDialog(null, "Consumo médio: " + consumo);

    }
}
