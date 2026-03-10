import java.util.HashMap;
import java.util.Map;

public class Inventario {
    // El "mapa" donde se guardan los datos
    public Map<String, Double> productos = new HashMap<>();

    public Inventario() {
        // Productos que ya vienen guardados por defecto
        productos.put("libreta", 2500.0);
        productos.put("lapiz", 500.0);
    }
}
