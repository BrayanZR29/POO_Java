import java.util.UUID;

public class Usuario {
    private static final String PlanDAtos = "500GB";
    private UUID id;
    private String nombre;
    private String email;
    private long telefono = 3152002020L;

    public Usuario() {

    }

    public void mostrarDatos() {
        this.id = UUID.randomUUID();
        System.out.println("-- datos -- \n" +
                "-ID: " + this.id +
                "\n- Nombre: " + this.nombre +
                "\n- email: " + this.email +
                "\n- Plan: " + this.PlanDAtos
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
