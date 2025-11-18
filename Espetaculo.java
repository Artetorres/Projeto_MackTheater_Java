public class Espetaculo {
    
    int maxAssentos = 50;

    private String nome;
    private String data;
    private String hora;
    private double preco;
    private boolean[] assentos;

    public Espetaculo(String data, String hora, String nome, double preco) {

        this.data = data;
        this.hora = hora;
        this.nome = nome;
        this.preco = preco;
        assentos = new boolean[maxAssentos];

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean[] getAssentos() {
        return assentos;
    }

    public void setAssentos(boolean[] assentos) {
        this.assentos = assentos;
    }

    public void apresentaAssentos() {

        for(int i = 49; i >= 0; i--) {
            
            int numeroDoAssento = i + 1;
        
            boolean ocupado = this.assentos[i];

            if (ocupado) { 
                System.out.print("XX ");
            } else { 
                System.out.printf("%02d ", numeroDoAssento);
            }

            if (numeroDoAssento % 10 == 1) { 
                System.out.println(); 
            }

        }
    }

    public Entrada novaEntrada(int tipo, int assento) {
        
        int indice = assento - 1;
        if (this.assentos[indice] == true) { 
            System.out.println("Erro: O assento " + assento + " já está ocupado.");
            return null;
        }

        Entrada entradaCriada = null;

        switch (tipo) {

            case 1 -> entradaCriada = new EntradaInteira(this, assento);

            case 2 -> entradaCriada = new EntradaMeia(this, assento);

            case 3 -> entradaCriada = new EntradaProfessor(this, assento);

            default -> {
                System.out.println("Erro: Tipo de entrada inválido.");
                return null;
            }
        }

        this.marcarAssento(assento);

        return entradaCriada;
        
    }


    public void marcarAssento(int assento) {
    
        int indice = assento - 1;
        this.assentos[indice] = true; 

    }

    
    @Override
    public String toString() {
        return String.format("%s %s %s R$ %.2f", getNome(), getData(), getHora(), getPreco());
    }

}
