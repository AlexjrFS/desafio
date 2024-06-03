public class Dispositivo{
    protected String modelo;
    protected String fabricante;

    public Dispositivo(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public void ligar(){
        System.out.println("Dispositivo ligado.");
    }

    public void desligar(){
        System.out.println("Dispositivo desligado.");
    }
}

