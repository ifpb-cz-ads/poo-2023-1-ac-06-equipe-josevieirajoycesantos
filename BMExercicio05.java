public class BMExercicio05 {
    private String nomeTime;
    private String nomeCampeonato;
    private int posicao; //posição em que o time se encotra na tabela do campeonato

    //get e set para nome do time
    public String getNomeTime (){
        return this.nomeTime; 
    }

    public void setNomeTime (String nomeTime){
        this.nomeTime = nomeTime;
    }

    //get e set para nome do Campeonato
    public String getNomeCampeonato (){
        return this.nomeCampeonato; 
    }

    public void setNomeCampeonato(String nomeCampeonato){
        this.nomeCampeonato = nomeCampeonato;
    }

    //get e set para posição do time
    public int getPosicao (){
        return this.posicao; 
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public void imprimirDados (){
        System.out.println("O nome do time é: " + this.nomeTime);
        System.out.println("O campeonato que ele participa é: " + this.nomeCampeonato);
        System.out.println("Ele está na posição: " + this.posicao);
    }

    public void estarNoG4 (){
        if(this.posicao <= 4) System.out.print("Ele está no G4? - " + true);
        else {
            System.out.print("Ele está no G4? - " + false);
        }
    }
    
    public static void main (String [] args){
        BMExercicio05 time01 = new BMExercicio05();
        time01.setNomeTime("Flamengo");
        time01.setNomeCampeonato("Brasileirão");
        time01.setPosicao(4);
        time01.imprimirDados();
        time01.estarNoG4();
    }
}
