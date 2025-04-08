public class Main {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        iPhone.selecionarMusica("Musica");
        iPhone.tocar();
        iPhone.pausar();

        iPhone.exibirPagina("https://www.youtube.com");
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();

        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
    }
}
