package sesion9.rebound.modelo;

public class Alumno {
    private String nombre;
    private String fechaDeNacimiento;
    private String tareasPendientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(String tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String fechaDeNacimiento, String tareasPendientes) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tareasPendientes = tareasPendientes;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", tareasPendientes='" + tareasPendientes + '\'' +
                '}';
    }
}
