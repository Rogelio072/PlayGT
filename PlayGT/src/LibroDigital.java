public class LibroDigital extends Contenido implements Descargable {
    private int paginas;

    public LibroDigital(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public String tipo() { return "Libro"; }

    @Override
    public double calcularTamanoMB() {
        return paginas * 0.2;
    }
}