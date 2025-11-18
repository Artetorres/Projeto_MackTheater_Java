public class EntradaProfessor extends Entrada {
    
    public EntradaProfessor(Espetaculo e, int n) {
        super(e, n);
    }

    @Override
    public double calculaValor() {

        return  espetaculo.getPreco() * 0.4;
    }
}
