//Exercicio prático 02
//Podemos perceber que a frase4 recebe o conteudo de frase3

public class TesteIgualdade2 {
    public static void main (String [] args ){
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println("Frase 3: " + frase3);
        System.out.println("Frase 4: " + frase4);
        System.out.println("Frase 3 e frase 4 possuem mesma referência? R: " + (frase3 == frase4));
    }
}


