/*4. Escreva um algoritmo que leia o nome de um funcionário, o 
  seu salário fixo, e 
  o total de vendas efetuadas por ele durante um mês. 
  sabe-se que este funcionário recebe 15% sobre suas vendas. 
  Informar ao final 
  o nome do funcionário 
  o salário fixo e 
  o salário atualizado.
 */


import javax.swing.*;

public class SalarioFuncionario {

    public static void main(String args[]){

        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        String salario = JOptionPane.showInputDialog("Informe o salario do funcionario: ");
        String vendas = JOptionPane.showInputDialog("Informe o valor de vendas do funcionario: ");

        double salF = Double.valueOf(salario);
        double vendasF = Double.valueOf(vendas);

        double sal_total = (vendasF * 0.15) + salF;

        JOptionPane.showMessageDialog(null, "O salario do " + nome + " é: R$" + sal_total);
    }
}
