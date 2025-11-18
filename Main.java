import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teatro meuTeatro = new Teatro();

        int opcao;
        do { 
            
            System.out.println(" *** MACK THEATHER *** ");
            System.out.println("1) Cadastrar Espetaculo");
            System.out.println("2) Cadastrar Cliente");
            System.out.println("3) Compra de Entradas");
            System.out.println("4) Sair");
            System.out.println("------------------------");
            opcao = sc.nextInt();

            switch(opcao) {

                case 1 -> {

                    sc.nextLine();
                    System.out.println(" *** CADASTRO DE ESPETÁCULO *** ");
                    System.out.print("Digite o nome do espetáculo: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a data do espetaculo: (00/00/0000)");
                    String data = sc.nextLine();
                    System.out.print("Digite a hora que o espetáculo começa: (00:00)");
                    String hora = sc.nextLine();
                    System.out.print("Digite o preço da entrada: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    Espetaculo novoShow = new Espetaculo(data, hora, nome, preco);

                    meuTeatro.adicionarEspetaculo(novoShow);

                    System.out.println("Espetáculo cadastrado");

                }
                case 2 -> {

                    sc.nextLine();
                    System.out.println(" *** CADASTRO DE CLIENTE *** ");
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    System.out.print("Digite o cpf: ");
                    String cpfCliente = sc.nextLine();

                    Cliente novoCliente = new Cliente(cpfCliente, nomeCliente);

                    meuTeatro.adicionarCliente(novoCliente);

                    System.out.println("Cliente cadastrado");

                }
                case 3 -> {

                    meuTeatro.novaCompra();
                    meuTeatro.apresentaEspetaculos();

                    System.out.print("Digite o espetáculo de sua escolha: ");
                    int numeroEscolhido = sc.nextInt();
                    meuTeatro.selecionaEspetaculo(numeroEscolhido);

                    int continuarCompra;
                    do {
                        
                        System.out.print("Selecione um assento: ");
                        int assento = sc.nextInt();

                        System.out.println("||| Tipos de Entrada |||"); 
                        System.out.println("1) Inteira"); 
                        System.out.println("2) Meia");
                        System.out.println("3) Professor");
                        System.out.print("Selecione um tipo de entrada: ");
                        int tipo = sc.nextInt();

                        meuTeatro.novaEntrada(tipo, assento); 

                        System.out.println("Deseja comprar uma outra entrada?");
                        System.out.println("1) Sim");
                        System.out.println("2) Não");
                        continuarCompra = sc.nextInt();
                        
                    } while (continuarCompra == 1);
                    sc.nextLine();

                    System.out.println("Informe o CPF do cliente cadastrado: ");
                    String cpf = sc.nextLine();

                    double valorTotal = meuTeatro.finalizaCompra(cpf);

                    System.out.printf("Valor total: R$ %.2f\n", valorTotal);

                }

                case 4 -> {System.out.println("Encerrando programa");}

                default -> {System.out.println("Opção invalida");}

            }

        } while (opcao != 4);

    }
    
}
