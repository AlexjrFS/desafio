public class Teste {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iPhone 13", "Apple", 128);
        
        meuIphone.ligar();
        meuIphone.reproduzir();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();
        
        meuIphone.fazerChamada("993456489");
        meuIphone.atenderChamada();
        meuIphone.encerrarChamada();
        
        meuIphone.navegar();
        meuIphone.abrirUrl("https://www.apple.com");
        meuIphone.fecharNavegador();
        
        meuIphone.tirarFoto();
        meuIphone.desligar();
    }
}
 
