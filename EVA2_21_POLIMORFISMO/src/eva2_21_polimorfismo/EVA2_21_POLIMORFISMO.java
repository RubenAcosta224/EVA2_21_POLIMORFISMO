/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        cuando se usa Is a
        
//        tratar objetos de las subclases como objetos de la superclase
        //al reves no
        
        Estudiante est1=new Estudiante("22550342", "Ruben", "Acosta", 18);
        
        est1.imprimirDatos();
        
        Docentes doc1=new Docentes("442", "Juan", "Garcia", 40);
        
        doc1.imprimirDatos();
        
        
        //polimorfismo
        //una variable de tipo persona 
        
        //es un estudiante pero lo va a tratar como una persona
        //lo convierte en una persona y oculta cosas
        Persona perso1=est1;
//        perso1.13
        
        Persona perso2=doc1;
        
        Persona perso3=new Persona();
        
        
        //se pueden ocultar cosas pero no agregar7
//        Estudiante est2=perso3;
        
        
        //is a--- extends, impplements
        //estudiante is a persona--- si
        //persona is a estudiante---- no  
    }
    
}
