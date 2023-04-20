//Exercicio prático 04
// Esse exemplo é bem semelhante ao que fizemos nas questões da lâmpada e do time do livro BM.

public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotaMatematica(int nota) {
        this.notaMatematica = nota;
    }

    public void setNotaPortugues(int nota) {
        this.notaPortugues = nota;
    }

    public void setNotaGeografia(int nota) {
        this.notaGeografia = nota;
    }

    public static int getQuantidadeAlunos() {
        return contadorEstudante;
    }

}

class AppRegistraAluno {

    public static void main(String[] args) {
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        System.out.println(ana.getNome());

        System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());
    }
}
