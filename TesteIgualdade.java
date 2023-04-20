//Exercicio prático 01
//Nesse exemplo o retorno é falso pois ambas possuem referencias distintas

public class TesteIgualdade {
    public static void main (String [] args ){
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1 e frase 2 são iguais? R: " + (frase1 == frase2));
    }
}


