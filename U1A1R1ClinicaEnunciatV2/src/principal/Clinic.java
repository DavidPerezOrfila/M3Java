
package principal;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Clinic {

    static private Integer comptaCode = 1; //El proper code a assignar
    private Integer code;
    private String name;
    private String address;
    private Doctor[] doctors = new Doctor[10];
    private Integer comptaDoctors = 0;
    private Nurse[] nurses = new Nurse[100];
    private Integer comptaNurses = 0;
    private Patient[] patients = new Patient[20];
    private Integer comptaPatients = 0;
    private Department[] departments = new Department[10];
    private Integer comptaDepartments = 0;
    private Track[] tracks = new Track[100];
    private Integer comptaTracks = 0;

    /*
    TODO Constructor
    Paràmetres: nom i adreça
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - assignar al codi el comptaCodi actual i incrementar el comptaCodi en 1
    */    
    
    /*
    TODO Mètodes accessors    
    */
    
    public Clinic(String name, String address)
    {
        this.code= getComptaCode();        
        Clinic.setComptaCode();
        this.setName(name);
        this.setAddress(address);
       
    }

    public static Integer getComptaCode() {
        return comptaCode;
    }

    public static void setComptaCode() {
        Clinic.comptaCode++;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Integer getComptaDepartments() {
        return comptaDepartments;
    }

    public void setComptaDepartments(Integer comptaDepartments) {
        this.comptaDepartments = comptaDepartments;
    }

    public Track[] getTracks() {
        return tracks;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }

    public Integer getComptaTracks() {
        return comptaTracks;
    }

    public void setComptaTracks(Integer comptaTracks) {
        this.comptaTracks = comptaTracks;
    }
    
    
    
    
    public static Clinic addClinic() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear una nova clínica (són les dades simples que demana el constructor)
    Retorneu: la clínica creada
          
    */ 
        System.out.println("Introduzca el nombre de la clínica: ");
        Scanner intro = new Scanner(System.in);
        String nouName= intro.next();     
                      
        System.out.println("Introduzca la dirección de la clínica");
        String nouAddress= intro.next();
        return new Clinic(nouName, nouAddress);
    }

    
    public void updateClinic() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades simples (no taules) per consola i modifiqueu la propietat
        Nota: penseu que estem modificant l'objeecte actual ...
    Retorneu: no hi ha retorn
        
    */
    System.out.println("Introduzca el nuevo nombre de la Clínica: ");
    Scanner teclat = new Scanner(System.in);
    String updateName= teclat.next();
    
    System.out.println("Introduzca la nueva dirección de la Clínica: ");
    String updateAddress=teclat.next();
            
    this.setName(updateName);
    this.setAddress(updateAddress);
        
    
    
    
    }

    public void showClinic() {
        System.out.println("\nLes dades de la clínica amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nAddreça:" + this.getAddress());
    }

    /*
     Doctors
     */
   
    public void addDoctor() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou doctor a la llista de doctors d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou doctor és una tasca de la classe Doctor
    Retorneu: no hi ha retorn
    */  
    this.doctors[this.comptaDoctors]= Doctor.addDoctor();
    this.comptaDoctors++;
    }

    public Integer selectDoctor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif del doctor?:");
        String nifSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaDoctors; i++) {
            if (doctors[i].getNif().equals(nifSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    /*
     Nurses
     */

    public void addNurse() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou infermer a la llista d'infermers d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou infermer és una tasca de la classe Infermer
    Retorneu: no hi ha retorn
    */
        this.nurses[this.comptaNurses]= Nurse.addNurse();
        this.comptaNurses++;
    }

    public Integer selectNurse() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif de l'infermer?:");
        String nifSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaNurses; i++) {
            if (nurses[i].getNif().equals(nifSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    /*
     Patients
     */

    public void addPatient() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou pacient a la llista de pacients d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou pacient és una tasca de la classe Patient
    Retorneu: no hi ha retorn
    */
        this.patients[this.comptaPatients]= Patient.addPatient();
        this.comptaPatients++;
                
    }

    public Integer selectPatient() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi de pacient?:");
        String codeSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaPatients; i++) {
            if (patients[i].getCode().equals(codeSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    /*
     Departments
     */

    public void addDepartment() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou departament a la llista de departaments d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou departament és una tasca de la classe Department
    Retorneu: no hi ha retorn
    */
        this.departments[this.comptaDepartments]= Department.addDepartment();
        this.comptaDepartments++;
    }

    public Integer selectDepartment() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi de departament?:");
        String codeSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaDepartments; i++) {
            if (departments[i].getCode().equals(codeSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    public void addDoctorDepartment() {
        Department departmentsel = null;
        Integer indexSelDepartment = this.selectDepartment();
        if (indexSelDepartment >= 0) {
            departmentsel = this.getDepartments()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectDoctor();
        if (indexSel >= 0) {
            departmentsel.addDoctorDepartment(this.getDoctors()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest doctor");
        }
    }

    public void addNurseDepartment() {
        Department departmentsel = null;
        Integer indexSelDepartment = this.selectDepartment();
        if (indexSelDepartment >= 0) {
            departmentsel = this.getDepartments()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectNurse();
        if (indexSel >= 0) {
            departmentsel.addNurseDepartment(this.getNurses()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest infermer");
        }
    }

    public void addPatientDepartment() {
        Department departmentsel = null;
        Integer indexSelDepartment = this.selectDepartment();
        if (indexSelDepartment >= 0) {
            departmentsel = this.getDepartments()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectPatient();
        if (indexSel >= 0) {
            departmentsel.addPatientDepartment(this.getPatients()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest pacient");
        }
    }
    

    public void addTrack(){
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou registre (track) a la llista de registres d'aquesta clínica (l'objecte actual)
        Nota: penseu que un nou registre és una tasca de la classe Track
    Retorneu: no hi ha retorn
    */
        this.tracks[this.comptaTracks]= Track.addTrack();
        this.comptaTracks++;
    }
}
