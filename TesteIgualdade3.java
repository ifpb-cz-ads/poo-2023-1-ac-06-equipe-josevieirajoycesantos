//Exercicio prático 03
//Podemos perceber que as duas frase, através do .equals são comparadas e retornando um resultado verdadeiro, pois ambas possuem o mesmo conteúdo
public class TesteIgualdade3 {
    public static void main (String [] args ){
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 3: " + frase1);
        System.out.println("Frase 4: " + frase2);
        System.out.println("Frase 1 e frase 2 possuem mesmo conteúdo? R: " + (frase1.equals(frase2)));
    }
}


