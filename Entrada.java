public abstract class Entrada {

    private int numeroDoAssento;
    protected Espetaculo espetaculo;

    public Entrada(Espetaculo espetaculo, int assento) {

        this.espetaculo = espetaculo;
        this.numeroDoAssento = assento; 
        
    }

    public int getNumeroDoAssento() {
        return numeroDoAssento;
    }

    public void setNumeroDoAssento(int numeroDoAssento) {
        this.numeroDoAssento = numeroDoAssento;
    }

    public abstract double calculaValor();

}
