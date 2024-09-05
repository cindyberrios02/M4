package M4Sesion07.Rebound;

public class Persona {
    private String usuario;
    private String contraseña;

    public Persona(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Persona() {
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
}


