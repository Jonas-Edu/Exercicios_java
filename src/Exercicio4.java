/*
4.Receber um valor referente a um alarido mínimo. Efetuar o calculo para seu salário
liquido, abater 8% de Inss, 11% de imposto de renda. Exibir os descontos e o salário
liquido.
 */


public class Exercicio4 {
    public static void main(String[] args) {

       int salarioInteiro = 1000;
       double descontoInss = salarioInteiro * 0.08;
       double descontoIR = salarioInteiro * 0.11;
       double salarioLiquido  = salarioInteiro - (descontoInss + descontoIR);

       double totalDescontos = descontoInss + descontoIR;

       System.out.println("\n total dos descontos eh " + totalDescontos);
       System.out.println("\n Salario Liquido eh " + salarioLiquido);


    }
}
