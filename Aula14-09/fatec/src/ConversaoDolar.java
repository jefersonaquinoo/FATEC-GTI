/*5. Escreva um algoritmo que faça a conversão de reais para dólar. 
  para isso é necessário solicitar do usuário a cotação do dólar e 
  a quantidade de reais que o usuário possui.
  */


import javax.swing.*;
import java.text.DecimalFormat;

public class ConversaoDolar {

    public static void main(String args[]){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String dolar = JOptionPane.showInputDialog("Informe a cotação do Dólar: ");
        String real = JOptionPane.showInputDialog("Informe a quantidade em reais (R$) a ser trocada: ");

        double dolarConversao = Double.valueOf(dolar);
        double qtdReal = Double.valueOf(real);
        double valorObtido = (qtdReal / dolarConversao);

        JOptionPane.showMessageDialog(null, "Valor obtido em Reais: R$"
                + decimalFormat.format(valorObtido));




    }
}
