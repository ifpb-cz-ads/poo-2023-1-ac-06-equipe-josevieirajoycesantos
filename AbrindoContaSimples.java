public class AbrindoContaSimples {
    private String nomeCorrentista;
    private int saldo;
    private boolean eEspecial;


    public String getNomeCorrentista(){
        return this.nomeCorrentista;
    }

    public void setNomeCorrentista(String nome){
        this.nomeCorrentista= nome;
    }

    public int getSaldo(){
        return this.saldo;
    }
        
    public void setSaldo(int deposito){
        this.saldo= deposito;
    }

    public boolean getEEspecial(){
        return this.eEspecial;
    }

    public void setEEspecial(Boolean resultado){
        this.eEspecial= resultado;
    }


    public void abreConta(String nome, int deposito){
        setNomeCorrentista(nome);
        setSaldo(deposito);
        setEEspecial(true);
    }

    public void abreContaSimples(String nome, int valor){
        if(valor >= 100){
            setNomeCorrentista(nome);
            setSaldo(valor);
            setEEspecial(false);
        }else{
            System.out.println("Não é possível abrir está conta, Deposite um valor maior que R$ 100,00 para abrir sua conta");
        }
    }

    public void depositar(int valor){
        setSaldo(this.saldo+valor);
        System.out.println("Realização de depósito no valor de "+ valor + " seu novo saldo e: " + this.saldo);
    }

    public void retiraSaldo(int valor){
        if((this.eEspecial == false) && (valor > this.saldo)){
            System.out.println("Tentativa de saque fracassada! Voçê não possui este saldo. Por favor realize uma operação válida.");

        }
        else if((this.eEspecial == false) && (this.saldo > 0) && (valor < this.saldo)){
            setSaldo(this.saldo-valor);
            System.out.println("Realização de saque no valor de "+ valor + " seu novo saldo e: " + this.saldo);
        }
        else if(((this.eEspecial == true) && (valor > this.saldo)) || ((this.eEspecial == true) && (valor < this.saldo))){
            setSaldo(this.saldo-valor);
            System.out.println("Realização de saque no valor de  "+ valor + " seu novo saldo e: " + this.saldo);
        }
    }

    public void extrato(){
        System.out.println("Nome do Correntista:" + this.nomeCorrentista);
        System.out.println("Conta Especial:" + this.eEspecial);
        if(this.saldo < 0){
            System.out.println("Atenção Saldo: NEGATIVO");
        }else{
            System.out.println("Saldo:" + this.saldo);
        }
    }

}

class executa{
    public static void main(String[] args) {
        AbrindoContaSimples cliente2= new AbrindoContaSimples();
        cliente2.abreContaSimples("Ze", 50);
        cliente2.abreContaSimples("Zé", 100);
        cliente2.extrato();

    }
}
