public class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular();

        // Testando o Reprodutor Musical
        meuCelular.selecionarMusica("Imagine - John Lennon");
        meuCelular.tocar();
        meuCelular.pausar();

        // Testando o Aparelho Telefônico
        meuCelular.ligar("123-456-7890");
        meuCelular.atender();
        meuCelular.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuCelular.exibirPagina("https://www.google.com");
        meuCelular.adicionarNovaAba();
        meuCelular.atualizarPagina();
    }
}
