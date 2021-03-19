/*
Baseado na tabela de Cálculo de Imposto de Renda acima, crie um programa que
receba o valor do salário bruto do usuário e informe a alíquota aplicada e o valor da
parcela a deduzir do Imposto de Renda para o valor inserido.
 */
public class Exercicio5 {
    public static void main(String[] args) {

        float salarioBruto = 2000;
        float salarioDesconto = 0;

        double perc1 = salarioBruto * 0.075;
        double perc2 = salarioBruto * 0.15;
        double perc3 = salarioBruto * 0.225;
        double perc4 = salarioBruto * 0.275;

        if(salarioBruto < 1903.98){
            System.out.println("Aliquota - Isento \n Parcela do IR: - ");
        }else if (salarioBruto > 1903.98 && salarioBruto < 2826.65){
            System.out.println(" Aliquota de 7,5% desconto eh :" +perc1+ " Parcela do Ir : R$ 142,8 ");
        }else if (salarioBruto > 2826.66 && salarioBruto < 3751.05){
            System.out.println(" Aliquota de 15% desconto eh : " +perc2+ " Parcela do Ir : R$354,8 ");
        }else if (salarioBruto > 3751.06 && salarioBruto < 4664.68){
            System.out.println(" Aliquota de 22,5% desconto eh : " +perc3+ " Parcela do Ir : R$ 636.13 ");
        }else if (salarioBruto > 4664.68){
            System.out.println(" Aliquota de 27,5 desconto eh : " +perc4+ " Parcela do Ir : R$ 869,36" );
        }

    }
}
