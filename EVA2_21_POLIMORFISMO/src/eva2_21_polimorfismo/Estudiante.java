/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




//Clase derivada extends clase base
//subclase extends superclase
//hijo extends clase

package eva2_21_polimorfismo;

/**
 *
 * @author invitado
 */
public class Estudiante extends Persona {
    private String noControl;

    public String getNoControl() {
        return noControl;
    }
    
        public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
        
        
//incluir constructor default
    public Estudiante() {
        super();//llamada al constructor de la clase
        this.noControl = "-----";
    }

    
    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);//constructor clase persona
        this.noControl = noControl;//esto es para el constructor de aqui
    }
    
    
    //para sobreescribir el metodo de persona
    //reemplaza el metodo (con la misma firma) de la superclase
    @Override
    public void imprimirDatos(){
        
        super.imprimirDatos();//de la superclase
        System.out.println("No. control: "+noControl);// lo que se agregue
    }
    

}
