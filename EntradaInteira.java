public class EntradaInteira extends Entrada {
    
    public EntradaInteira(Espetaculo e, int n) {
        super(e, n);
    }

    @Override
    public double calculaValor() {
       
        return espetaculo.getPreco();
    }
}
