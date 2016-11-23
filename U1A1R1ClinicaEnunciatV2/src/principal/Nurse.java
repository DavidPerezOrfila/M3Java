
package principal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MiguelAngel
 */
public class Nurse {

    private String nif;
    private String name;
    private String lastname;

    /*
    TODO Constructor
    Paràmetres: String nif, String name, String lastname
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    */   
    public Nurse(String nif, String name, String lastname)
    {
        this.setNif(nif);        
        this.setName(name);
        this.setLastname(lastname);
    }
    
    /*
    TODO Mètodes accessors    
    */ 

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
    
    
    
    public static Nurse addNurse() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou infermer (són les dades que demana el constructor)
    Retorneu: L'infermer creat
    */ 
    Scanner teclat = new Scanner(System.in);
    
    System.out.println("Introduzca el nif de la enfermera: ");
        String nifNurse= teclat.next();
        
    System.out.println("Introduzca el nombre de la enfermera: ");
        String nomNurse= teclat.next();
        
    System.out.println("Introduzca el apellido de la enfermera: ");
        String apeNurse= teclat.next();
        
    return new Nurse(nifNurse, nomNurse, apeNurse);
    }


    public void updateNurse() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades de l'infermer per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    Scanner teclat = new Scanner(System.in);
    String upNif, upNom, upApe;
    
    
    }

    public void showNurse() {
        System.out.println("\nLes dades de l'infermer amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}
