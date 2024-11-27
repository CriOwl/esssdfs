package Recursos.Herencia;

public  abstract class Abuelo{
    private String nombre,apellido,comida_favorita;
    private Integer edad,dni;
    public Abuelo(){

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getComida_favorita() {
        return comida_favorita;
    }
    public void setComida_favorita(String comida_favorita) {
        this.comida_favorita = comida_favorita;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getDni() {
        return dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public void gola(){
        System.out.println("-------------------------");
    }
}
