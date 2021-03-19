/*
6. Receber a matricula, o nome e as 4 notas de um aluno e a quantidade de faltas e
então, calcule a sua média ponderada com os pesos 1, 3, 2 e 4, respectivamente.
Defina e exiba sua nota, mediante as seguintes regras:
a. Média entre 9.1 e 10: “A”;
b. Média entre 6.1 e 9: “B”;
c. Média entre 4.1 e 6: “C”;
d. Média entre 3.1 e 4: “D”;
e. Média entre 0 e 3: “E”;
f. Status: Se a média inferior a “C" deverá ser acrescido a mensagem “Aluno em
Recuperação”;
g. Status: Se a frequência inferior a 60%: deverá ser acrescido a mensagem
“Aluno em Retido por faltas”;
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int matricula;
        double nota1, nota2, nota3, nota4;
        double media;
        int freq;

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
        
        media = ((nota1*1)+(nota2*3)+(nota3*2)+(nota4*4))/10;

        if ((media >=0 ) && (media <4)) {
            System.out.println("Nome: "+nome);
            System.out.println("Matricula: "+matricula);
           System.out.println("Nota E");
            System.out.println("Aluno em Recuperação");

        } else if (media < 5) {
            System.out.println("Nome: "+nome);
            System.out.println("Matricula: "+matricula);
            System.out.println("Nota D");
            System.out.println("Aluno em Recuperação");

        } else if (media < 7) {
            System.out.println("Nome: "+nome);
            System.out.println("Matricula: "+matricula);
            System.out.println("Nota C");

        } else if (media < 8) {
            System.out.println("Nome: "+nome);
            System.out.println("Matricula: "+matricula);
            System.out.println("Nota B");

        } else if (media <= 10) {
            System.out.println("Nome: "+nome);
            System.out.println("Matricula: "+matricula);
            System.out.println("Nota A");

        } else if (freq > 60) {
            System.out.println("Aluno Retido por faltas");
        }
    }
}

