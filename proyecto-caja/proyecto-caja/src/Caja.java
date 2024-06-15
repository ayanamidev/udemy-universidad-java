public class Caja {
    public int ancho;
    public int alto;
    public int profundo;

    public Caja() {
    }

    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int volumen(){
        int volumen=this.ancho*this.alto*this.profundo;
        return volumen;
    }




}
