package Recursos;

import java.util.Scanner;

public class Automatas{
    private int a=5,e=-1;
    private int[][] matriz_transicion={
                                        // a b c 
                                        {0,1,e}, //0
                                        {e,1,2}, //1
                                        {e,e,a} //2
    };
    String alfabeto="abc";
    String palabra="abbcc";
    public Automatas(){

    }
    public void validar_palabra(){
        int estado=0;
        char[] alfa=alfabeto.toCharArray();
        Scanner separador =new Scanner(palabra).useDelimiter("-");
        char[] pala=separador.next().toCharArray();
        for (int filas = 0; filas < pala.length; filas++) {
            for (int columas = 0; columas < alfa.length; columas++) {
                if(pala[filas]==alfa[columas]){
                    estado=matriz_transicion[estado][columas];
                }
            }
        }
        System.out.println(estado);
    }
}