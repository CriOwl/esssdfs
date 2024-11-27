package Recursos.Herencia;

import Herencia.Abuelo;

public class Padre extends Abuelo{
    public  String padre;
    public Padre(){
        super();
        super.setApellido("46556");
        System.out.println(getApellido());
    }
    @Override
    public void gola(){
        System.out.println("++++++++++++++++++++++++++++++++");
    }
    public void goal2(){
        super.gola();
    }

}