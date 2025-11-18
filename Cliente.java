import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private List<Pedido> pedidosDoCliente;

    public Cliente(String cpf, String nome) {

        this.cpf = cpf;
        this.nome = nome;
        this.pedidosDoCliente = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionaPedido(Pedido pedido) {
        this.pedidosDoCliente.add(pedido);
    }
    
}
