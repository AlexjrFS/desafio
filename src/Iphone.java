public class Iphone extends Dispositivo implements ReproduzirMusica, AparelhoTelefonico, NavegadorInternet {
    private int armazenamento;

    public Iphone(String modelo, String fabricante, int armazenamento) {
        super(modelo, fabricante);
        this.armazenamento = armazenamento;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada.");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música: " + musica);
    }
    @Override
    public void fazerChamada(String numero){
        System.out.println("Fazendo chamada para: " + numero);
    }
    @Override
    public void atenderChamada(){
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada.");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void navegar() {
        System.out.println("Navegando na internet.");
    }

    @Override
    public void abrirUrl(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador.");
    }

    public void tirarFoto() {
        System.out.println("Tirando foto.");
    }
}
