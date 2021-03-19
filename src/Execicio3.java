/*
3.Escreva um algoritmo para ler o número total de eleitores de um município, o
        número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
        cada um representa em relação ao total de eleitores.
*/

public class Execicio3 {
    public static void main(String[] args) {

        int eleitores = 1000;
        int brancos = 150;
        int  nulos = 50;
        int  validos = 800;
        double percBrancos, percNulos, percValidos;

        percValidos = ((double)validos / eleitores) * 100;
        percBrancos = ((double)brancos / eleitores) * 100;
        percNulos = ((double)nulos / eleitores) * 100;

        System.out.printf(" \n %6.2f%% de votos validos. ",+ percValidos);
        System.out.printf(" \n %6.2f%% de votos Bracos. ",+ percBrancos);
        System.out.printf(" \n %6.2f%% de votos Nulos. ",+ percNulos);

    }
}
