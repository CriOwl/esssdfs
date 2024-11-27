package Recursos.Utilitarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class utilitarios{
    public static  Scanner teclado=new Scanner(System.in);
    public utilitarios(){
archi();
    }
    public void archi(){
        try {
            FileReader archivo=new FileReader("src\\Recursos\\Utilitarios\\archivo.txt");
            BufferedReader leer=new BufferedReader(archivo);
            String cadena=" ";
            while ((cadena=leer.readLine())!=null) { 
                System.out.println(cadena);
            }

        } catch (Exception e) {
        }
       
    }
}
