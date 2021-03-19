/*
2.Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu
antecessor e seu sucessor utilizando os operadores de incremento.
 */
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num,sucessor, antecessor;

        System.out.print("Digite um numero:");
        num = scan.nextInt();

        sucessor = num + 1;
        antecessor = num - 1;

        System.out.println("Valor digitado eh: " +num+ ", Antecessor eh: " +antecessor+ " Sucessor eh: " +sucessor);

    }
}


