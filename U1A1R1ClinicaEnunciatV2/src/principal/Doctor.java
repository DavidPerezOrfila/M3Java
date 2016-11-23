/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MiguelAngel
 */
public class Doctor {

    private String nif;
    private String name;
    private String lastname;

    /*
    TODO Constructor
    Paràmetres: String nif, String name, String lastname
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    */    
    
    /*
    TODO Mètodes accessors    
    */ 
    public Doctor(String nif, String name, String lastname)
    {
        this.setNif(nif);
        this.setName(name);
        this.setLastname(lastname);
        
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    public static Doctor addDoctor() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou doctor (són les dades que demana el constructor)
    Retorneu: El doctor creat
        
    */  
    Scanner teclat = new Scanner(System.in);
    System.out.println("Introduzca el NIF del Doctor: ");
    
        String nifDoc= teclat.next();
        
    System.out.println("Introduzca el nombre del Doctor: ");
        String nomDoc= teclat.next();
        
    System.out.println("Introduzca el apellido del Doctor: ");
        String apeDoc= teclat.next();
        
        return new Doctor(nifDoc, nomDoc, apeDoc);
    }

    /*
    TODO
    */
    public void updateDoctor() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades del doctor per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    Scanner teclat = new Scanner(System.in);
    System.out.println("Introduzca el NIF del Doctor: ");
    
        String updNif= teclat.next();
        
    System.out.println("Introduzca el nombre del Doctor: ");
        String updNom= teclat.next();
        
    System.out.println("Introduzca el apellido del Doctor: ");
        String updApe= teclat.next();
    
    this.setNif(updNif);
    this.setName(updNom);
    this.setLastname(updApe);
        
    }

    public void showDoctor() {
        System.out.println("\nLes dades del doctor amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}
