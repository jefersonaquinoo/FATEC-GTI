package fatec;

import javax.swing.*;
import java.text.DecimalFormat;

public class Rendimento {

    public static void main(String args[]) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String valor = JOptionPane.showInputDialog("Informe o valor que deseja investir: ");

        double value = Double.valueOf(valor);
        double investiment = (value * 0.01);

        JOptionPane.showMessageDialog(null, "A renda mensal será de: "
                + decimalFormat.format(investiment) + " ao mês.");

    }

}
