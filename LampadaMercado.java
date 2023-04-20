public class LampadaMercado {
    private String marca;
    private float preço;
    private int quantEstoque;
    private boolean testLampada;


    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marcaProduto){
        this.marca=marcaProduto;
    }
    
    
    public float getPreço(){
        return this.preço;
    }
        
    public void setPreço(float valor){
        this.preço= valor;
    }


    public int getQuantEstoque(){
        return this.quantEstoque;
    }
        
    public void setQuantEstoque(int estoque){
        this.quantEstoque= estoque;
    }

    public boolean getTestLamapada(){
        return this.testLampada;
    }

    public void setTestLampada(Boolean teste){
        this.testLampada= teste;
    }
    public void testeApaga(){
        setTestLampada(false);
    }
    
    public void testeAcende(){
        setTestLampada(true);
    }

    public void imprimeTeste (){
        if(testLampada){
            System.out.println("A lampada esta acesa");
        }
        else{
            System.out.println("A lampada esta apagada");
        }
    }

    public void imprimeDados(){
        System.out.println("Os dados da lampada são:");
        System.out.println("Marca:" + this.marca);
        System.out.println("Preço:" + this.preço);
        System.out.println("Quantidade de estoque:" + this.quantEstoque);
    }
}

class executando{
    
    public static void main(String[] args) {
        LampadaMercado compra1= new LampadaMercado();
        compra1.setMarca("Philips");
        compra1.setPreço(59.60f);
        compra1.setQuantEstoque(45);
        compra1.imprimeDados();
        compra1.testeAcende(); // testa se a luz esta funcionando(acendendo)
        compra1.imprimeTeste();
        compra1.testeApaga(); // testa se a luz esta funcionando(apagandando)
        compra1.imprimeTeste();
    }
}
