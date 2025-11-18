import java.util.ArrayList;
import java.util.List;


public class Teatro {
    
    private Pedido carrinho;
    private Espetaculo espetaculoSelecionado;
    private List<Espetaculo> listaDeEspetaculos;
    private List<Cliente> listaDeClientes;


    public Teatro() {
        this.carrinho = null;
        this.espetaculoSelecionado = null;
        this.listaDeClientes = new ArrayList<Cliente>();
        this.listaDeEspetaculos = new ArrayList<Espetaculo>();
    }

    
    public void adicionarEspetaculo(Espetaculo espetaculo) {
        this.listaDeEspetaculos.add(espetaculo);
    }

    public void adicionarCliente(Cliente cliente) {
        this.listaDeClientes.add(cliente);
    }

    public void novaCompra() {

        this.carrinho = new Pedido();

    }

    public void apresentaEspetaculos() {

        if (listaDeEspetaculos.isEmpty()) {
            System.out.println("Nenhum espetáculo cadastrado no momento.");
            return;
        }
        System.out.println("*** VENDA DE ENTRADAS - ESPETÁCULOS ***");

        for (int i = 0; i < listaDeEspetaculos.size(); i++) {
            
            Espetaculo espetaculo = listaDeEspetaculos.get(i);
            System.out.println((i + 1) + ") " + espetaculo); 

        }
    }

    public void selecionaEspetaculo(int numero) {

        int indice = numero - 1; 

        if (indice >= 0 && indice < listaDeEspetaculos.size()) {

            Espetaculo show = listaDeEspetaculos.get(indice);
            espetaculoSelecionado = show;
            espetaculoSelecionado.apresentaAssentos();

        } else {

            System.out.println("Erro: Espetáculo inválido.");

        }
    }

    public void novaEntrada(int tipo, int assento) {

        Entrada entrada = this.espetaculoSelecionado.novaEntrada(tipo, assento);
        
        if (this.carrinho != null) {
        this.carrinho.adicionaEntrada(entrada);
        }
    }

    public double finalizaCompra(String cpf) {
        
        Cliente cliente = this.buscarClientePorCpf(cpf);
        
        double total = 0; 

        if (cliente != null && this.carrinho != null) {

            cliente.adicionaPedido(carrinho);

            total = carrinho.calculaValorTotal();
            
        } else {
            System.out.println("Erro: Cliente não encontrado ou carrinho vazio.");
           
        }

        this.carrinho = null;
        this.espetaculoSelecionado = null;

        return total;
    }

    private Cliente buscarClientePorCpf(String cpf) {

        for (Cliente cliente : listaDeClientes) { 
            if (cliente.getCpf().equals(cpf)) { 
                return cliente;
            }
        }
        return null;
    }
}
