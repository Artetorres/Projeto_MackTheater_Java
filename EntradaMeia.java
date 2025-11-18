public class EntradaMeia extends Entrada {
    
    public EntradaMeia(Espetaculo e, int n) {
        super(e, n);
    }

    @Override
    public double calculaValor() {

        return espetaculo.getPreco() * 0.5;
    }
}
