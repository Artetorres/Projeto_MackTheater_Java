import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Entrada> entradasDoPedido;

    public Pedido() {
        this.entradasDoPedido = new ArrayList<>();
    }


    public void adicionaEntrada(Entrada entrada) {
        if (entrada != null) {
            this.entradasDoPedido.add(entrada);
        }
    }

    public double calculaValorTotal() {

        double total = 0.0;
        for (Entrada entrada : this.entradasDoPedido) {

            total += entrada.calculaValor();
             
        }
        
        return total;
    }
}