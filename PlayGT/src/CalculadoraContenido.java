import java.util.List;

public final class CalculadoraContenido {
    private CalculadoraContenido() {
    }

    public static int tiempoTotalSeg(List<Reproducible> lista) {
        int total = 0;
        for (Reproducible reproducible : lista) {
            total += reproducible.getDuracionSeg();
        }
        return total;
    }

    public static double espacioTotalMB(List<Descargable> lista) {
        double total = 0;
        for (Descargable descargable : lista) {
            total += descargable.calcularTamanoMB();
        }
        return total;
    }
}