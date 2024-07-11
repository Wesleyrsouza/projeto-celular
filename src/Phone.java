import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private Scanner scanner;
    private String nomeUsuario;

    public Iphone() {
        scanner = new Scanner(System.in);
    }

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Reproduzindo música: " + musicaAtual);
            exibirMenu();
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Qual música gostaria de ouvir?");
        musicaAtual = scanner.nextLine();
        System.out.println("A música " + musicaAtual + " está sendo reproduzida.");
        MenuMusica();
    }

    // Método para exibir o menu de opções após selecionar uma música
    private void MenuMusica() {
        while (true) {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1- Pausar");
            System.out.println("2- Selecionar outra música");
            System.out.println("3- Sair");

            int escolha = Integer.parseInt(scanner.nextLine());
            switch (escolha) {
                case 1:
                    pausar();
                    break;
                case 2:
                    selecionarMusica();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Digite o nome ou o número para fazer a ligação:");
        String contato = scanner.nextLine();
        System.out.println("Ligando para " + contato + "...");
    }

    @Override
    public void atender() {
        System.out.println("Você deseja: 1. Atender ligação  2. Recusar ligação");
        int escolha = Integer.parseInt(scanner.nextLine()); // Usar nextLine() para evitar problemas de leitura
        if (escolha == 1) {
            System.out.println("Ligação atendida.");
        } else {
            System.out.println("Ligação recusada.");
        }
    }

    @Override
    public void correioVoz() {
        System.out.println("Deseja ouvir suas mensagens no correio de voz? (sim/não)");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Você não tem mensagens de correio de voz.");
        } else {
            System.out.println("Saindo do correio de voz.");
        }
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método para iniciar o Iphone
    public void iniciar() {
        System.out.println("Olá! Qual é o seu nome?");
        nomeUsuario = scanner.nextLine();
        System.out.println("Bem-vindo, " + nomeUsuario + "! O que você gostaria de fazer?");
        exibirMenu();
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("1- Navegar na internet");
            System.out.println("2- Reproduzir músicas");
            System.out.println("3- Fazer ligações");
            System.out.println("4- Sair");

            int escolha = Integer.parseInt(scanner.nextLine());
            switch (escolha) {
                case 1:
                    navegarInternet();
                    break;
                case 2:
                    reproduzirMusicas();
                    break;
                case 3:
                    fazerLigacoes();
                    break;
                case 4:
                    System.out.println("Saindo... Até logo, " + nomeUsuario + "!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void navegarInternet() {
        while (true) {
            System.out.println("Digite a URL da página que deseja visitar:");
            String url = scanner.nextLine();
            exibirPagina(url);

            System.out.println("Deseja visitar outra página? (sim/não)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("sim")) {
                break;
            }
        }
    }

    public void reproduzirMusicas() {
        selecionarMusica();
        tocar();
        pausar();
    }

    public void fazerLigacoes() {
        ligar();
        atender();
        correioVoz();
    }

    // Método principal para testar as implementações
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        meuIphone.iniciar();
        // Fechando o scanner
        meuIphone.scanner.close();
    }
}
