import java.util.Scanner;

/*
Ajuste o exercício 6 para uma estrutura de repetição que realize os cálculos até que
seja digitada a matricula 0(zero), a matricula 0 deverá finalizar o looping;
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int matricula;
        double nota1, nota2, nota3, nota4;
        double media;
        int freq;
        int numAluno = 0;

        System.out.println("informe o numero de aluno");
        numAluno = scan.nextInt();

        do {
            System.out.println("Digite o nome: ");
            nome = scan.next();

            System.out.println("Digite a matricula: ");
            matricula = scan.nextInt();

            System.out.println("Digite a nota 1 : ");
            nota1 = scan.nextDouble();

            System.out.println("Digite a nota 2 : ");
            nota2 = scan.nextDouble();

            System.out.println("Digite a nota 3 : ");
            nota3 = scan.nextDouble();

            System.out.println("Digite a nota 4 : ");
            nota4 = scan.nextDouble();

            System.out.println("Frequencia em % : ");
            freq = scan.nextInt();

            media = ((nota1 * 1) + (nota2 * 3) + (nota3 * 2) + (nota4 * 4)) / 10;

            if ((media >= 0) && (media < 4)) {
                System.out.println("Nome: " + nome);
                System.out.println("Matricula: " + matricula);
                System.out.println("Nota E");
                System.out.println("Aluno em Recuperação");

            } else if (media < 5) {
                System.out.println("Nome: " + nome);
                System.out.println("Matricula: " + matricula);
                System.out.println("Nota D");
                System.out.println("Aluno em Recuperação");

            } else if (media < 7) {
                System.out.println("Nome: " + nome);
                System.out.println("Matricula: " + matricula);
                System.out.println("Nota C");

            } else if (media < 8) {
                System.out.println("Nome: " + nome);
                System.out.println("Matricula: " + matricula);
                System.out.println("Nota B");

            } else if (media <= 10) {
                System.out.println("Nome: " + nome);
                System.out.println("Matricula: " + matricula);
                System.out.println("Nota A");

            } else if (freq > 60) {
                System.out.println("Aluno Retido por faltas");
            }
        numAluno++;
        } while (numAluno > 0);

     }
 }
