package Recursos;

public class Validaciones{
    private String palabra;
    private Integer numero;
    private Float decimal;
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        if(palabra==""||palabra.isEmpty()){
            palabra="defecto";
        }
        this.palabra = palabra;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        if(numero==null){
            numero=0;
        }
        this.numero = numero;
    }
    public Float getDecimal() {
        return decimal;
    }
    public void setDecimal(Float decimal) {
        this.decimal = decimal;
    }
}