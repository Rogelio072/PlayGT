import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Objetos proporcionados por el ejercicio
        Cancion c1 = new Cancion("Cielo de Xela", "Banda Quetzal", 210);
        Cancion c2 = new Cancion("Marimba al Atardecer", "Los Tecomates", 180);
        Podcast p1 = new Podcast("Código y Café", "Ana Ruiz", 1800, 12);
        LibroDigital l1 = new LibroDigital("Estructuras de Datos", "Marco Pérez", 320);

        // Listas de tipos distintos (polimorfismo en acción)
        List<Contenido> catalogo = List.of(c1, c2, p1, l1);
        List<Reproducible> paraEscuchar = List.of(c1, c2, p1);
        List<Descargable> paraDescargar = List.of(c1, c2, p1, l1);

        // Imprimir el catálogo completo
        for (Contenido c : catalogo) {
            System.out.println(c);
        }

        // Reproducir elementos de la lista
        System.out.println("--- Reproduciendo ---");
        for (Reproducible r : paraEscuchar) {
            r.reproducir();
        }

        // Calcular y mostrar el tiempo total
        int seg = CalculadoraContenido.tiempoTotalSeg(paraEscuchar);
        System.out.println("Tiempo total: " + (seg / 60) + " min " + (seg % 60) + " s");

        // Calcular y mostrar el espacio necesario para descargas
        System.out.println("--- Descargas ---");
        double mb = CalculadoraContenido.espacioTotalMB(paraDescargar);
        System.out.println("Espacio necesario: " + mb + " MB");
    }
}