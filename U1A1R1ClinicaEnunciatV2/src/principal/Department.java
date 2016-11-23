/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashSet;
import principal.Nurse;
import principal.Patient;
import java.util.Scanner;
import java.util.Set;
import principal.Doctor;


public class Department {

    private String code;
    private String name;
    private Doctor[] doctors = new Doctor[10];
    private Integer comptaDoctors = 0;
    private Nurse[] nurses = new Nurse[100];
    private Integer comptaNurses = 0;
    private Patient[] patients = new Patient[20];
    private Integer comptaPatients = 0;

    /*
    TODO Constructor
    Paràmetres: codi i nom
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
    */  
    public Department(String codi, String nom)
    {
        this.setCode(code);
        this.setName(name);
        
    }
    
    /*
    TODO Mètodes accessors    
    */

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public Integer getComptaDoctors() {
        return comptaDoctors;
    }

    public void setComptaDoctors(Integer comptaDoctors) {
        this.comptaDoctors = comptaDoctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }

    public Integer getComptaNurses() {
        return comptaNurses;
    }

    public void setComptaNurses(Integer comptaNurses) {
        this.comptaNurses = comptaNurses;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public Integer getComptaPatients() {
        return comptaPatients;
    }

    public void setComptaPatients(Integer comptaPatients) {
        this.comptaPatients = comptaPatients;
    }
    
    
    public static Department addDepartment() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou departament (són les dades simples que demana el constructor)
    Retorneu: el departament creat

    */ 
    Scanner teclat = new Scanner(System.in);
    System.out.println("Introduzca el código del Departamento: ");
    String codDept= teclat.next();
    
    System.out.println("Introduzca el nombre del Departamento: ");
    String nomDept= teclat.next();
    
    return new Department(codDept, nomDept);
    }

    
    public void addDoctorDepartment(Doctor doctor) {
    /*
    TODO 
    Paràmetres: doctor
    Accions:
    - afegeix el doctor del paràmetre a la llista de doctors d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    
    }


    public void addNurseDepartment(Nurse nurse) {
    /*
    TODO 
    Paràmetres: infermer (nurse)
    Accions:
    - afegeix l'infermer del paràmetre a la llista d'infermers d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }


    public void addPatientDepartment(Patient patient) {
    /*
    TODO 
    Paràmetres: pacient (patient)
    Accions:
    - afegeix el pacient del paràmetre a la llista de pacients d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }

    public void showDepartment() {
        System.out.println("\nLes dades del departament amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("Aquest departament està format pels doctors:");
        for (int i = 0; i < this.getComptaDoctors(); i++) {
            this.getDoctors()[i].showDoctor();
        }
        System.out.println("Aquest departament està format pels infermers:");
        for (int i = 0; i < this.getComptaNurses(); i++) {
            this.getNurses()[i].showNurse();
        }
        System.out.println("Aquest departament està format pels pacients:");
        for (int i = 0; i < this.getComptaPatients(); i++) {
            this.getPatients()[i].showPatient();
        }
    }

}
