public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String tipo() { return "Canción"; }

    @Override
    public void reproducir() {
        int min = duracionSeg / 60;
        int seg = duracionSeg % 60;
        System.out.println("Reproduciendo canción: " + getTitulo() + " (" + min + ":" + (seg < 10 ? "0" : "") + seg + ")");
    }

    @Override
    public int getDuracionSeg() { return duracionSeg; }

    @Override
    public double calcularTamanoMB() {
        double minutos = duracionSeg / 60.0;
        return minutos * 1.5;
    }
}