/*
7. Supondo que a população de um país A seja da ordem de 90.000.000 de habitantes
com uma taxa anual de crescimento de 3,1% e que a população de um país B seja
de 200.000.000 de habitantes com uma taxa anua1 de crescimento de 1,5%,
escrever um algoritmo/programa que calcula quantos anos serão necessários para
que a população do país A ultrapasse a do país B, mantidas as taxas atuais de
crescimento.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        double PaisA = 90000000;
        double PaisB = 200000000;
        int contadorAnos = 0;

        while(PaisA < PaisB){
            PaisA += ((PaisA * 3.0) / 100.0);
            PaisB += ((PaisB) * 1.5 / 100.0);
            contadorAnos++;
        }
        System.out.println("Total de anos: " +contadorAnos);
    }
}
