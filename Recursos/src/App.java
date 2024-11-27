import Recursos.Recursosv2.Archivo;

public class App {
    public static void main(String[] args) throws Exception {
       /*  Padre pds=new Padre();
        pds.gola();
        pds.goal2(); */
        //Ejemplo del uso de un Try cath 
  /*       while (va) { 
            try {
                numero=teclado.nextInt();
                val.setNumero(numero);
                va=false;
                } catch (Exception e) {
                teclado.nextLine();
                }
        } */
       // otro metodo de validacion
/*         while (!teclado.hasNextInt()) { 
            teclado.nextLine();
        }
        val.setNumero(numero); */
        Archivo archivo=new Archivo();
        archivo.crear_archivo();
        archivo.leer_archivo();
    }
}
