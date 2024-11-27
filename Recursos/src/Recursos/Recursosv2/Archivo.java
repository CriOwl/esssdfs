package Recursos.Recursosv2;
// archivo.createnewfile valida si el archivo ya esta creado previamente
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivo {
File archivo;
    public String path ="src\\Recursos v2.0\\";
    public ArrayList<String> lista=new ArrayList<String>();
    public void crear_archivo(){
    try {
     archivo = new File("src\\Recursos\\Herencia\\Archivo.txt");
        if(archivo.createNewFile()){
            System.out.println("ficheros "+archivo.getName());
            System.out.println("ruta "+archivo.getAbsolutePath());
        }
        escribir();
    } catch (IOException error) {
        System.out.println(error);
    }
        
    }
    public void escribir(){
        lista.add("asdasdads");
        lista.add("asda");
        lista.add("aaaaaaaaaaaaa");
        try {
        FileWriter escribir_archivo=new FileWriter(archivo);
        escribir_archivo.write("Hola Mundo");
        escribir_archivo.write("\n"+"Hola Mundo2.0");
        escribir_archivo.write(lista.toString().toCharArray());
        escribir_archivo.close();
        } catch (IOException error) {
        System.out.println(error);
        }
    }
    public void leer_archivo(){
        try {
        FileReader archivoleido=new FileReader(archivo);
        Scanner lectura=new Scanner(archivo);
        while(lectura.hasNext()){
            lista.add(lectura.nextLine());
        }            
        System.out.println(lista);

        } catch (IOException error) {
        System.out.println(error);
        }

    }
    
}
