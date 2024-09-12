package M4Sesion04.Rebound.Ejercicios;
//EJERCICIO:  Instrucciones para el desarrollo de la actividad:
// ● En esta actividad deberás crear una clase persona con los siguientes
// atributos nombre, edad, peso y altura
// ● Los atributos solo deben ser accedidos a través de métodos.
// ● Deberás crear un método constructor con todos los atributos como argumento.
// ● Deberás crear otra clase con un método main
// donde creará 5 instancias de clase (5 personas) y deberá evaluar,
// para cada una, el IMC y revisar si es mayor o menor de edad.
// ● Finalmente, deberá imprimir todos sus objetos.

public class Persona {
    private String nombre;
    private int edad;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

