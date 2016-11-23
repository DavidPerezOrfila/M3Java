package principal;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Application {

    static private Clinic[] clinics = new Clinic[4];
    static private Integer comptaClinics = 0;
    static private Clinic clinicActual = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió de clíniques");
            System.out.println("\n2. Gestió dels doctors");
            System.out.println("\n3. Gestió dels infermers");
            System.out.println("\n4. Gestió de pacients");
            System.out.println("\n5. Gestió de departaments");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuClinic();
                    break;
                case 2:
                    if (clinicActual != null) {
                        menuDoctors();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 3:
                    if (clinicActual != null) {
                        menuNurses();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 4:
                    if (clinicActual != null) {
                        menuPatients();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 5:
                    if (clinicActual != null) {
                        menuDepartments();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuClinic() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            Integer indexSel = -1;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Fixa Clínica");
            System.out.println("\n3. Modificació");
            System.out.println("\n4. Afegir un registre");
            System.out.println("\n5. Llista de clíniques");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    clinics[comptaClinics] = Clinic.addClinic();
                    comptaClinics++;
                    break;
                case 2:
                    indexSel = selectClinic();
                    if (indexSel >= 0) {
                        clinicActual = clinics[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquesta clínica");
                    }
                    break;
                case 3:
                    indexSel = selectClinic();
                    if (indexSel >= 0) {
                        clinics[indexSel].updateClinic();
                    } else {
                        System.out.println("\nNo existeix aquesta clínica");
                    }
                    break;
                case 4:
                    indexSel = selectClinic();
                    if (indexSel >= 0) {
                        clinics[indexSel].addTrack();
                    } else {
                        System.out.println("\nNo existeix aquesta clínica");
                    }
                    break;
                case 5:
                    for (int i = 0; i < comptaClinics; i++) {
                        clinics[i].showClinic();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }


    public static void menuDoctors() {
        /*
        TODO Heu de desenvolupar el menú doctors amb les opcions que podeu veure.
        Nota: penseu que quan arribem aquí, la propietat clinicActual no és null
        
        Opció 1. Alta -->           Crea un doctor en la clínica actual. Penseu que Clinic sap crear doctors        
        Opció 2. Modificació ->     Permet modificar un doctor que ha d'existir a la clínica actual
                                    (per comprovar l'existència tenim un mètode que ens ajuda a la classe Clinic)
        Opció 3. Llista de doctors
                            ->      Imprimeix les dades dels doctors de la clínica actual
        
        A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
        Recomanacions:
        - estructura de control switch case per bifurcar les opcions
        - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
          "S'ha de seleccionar una opció correcta del menú."
        - per a l'entrada de dades, millor fer servir la classe Scanner
        - definiu una variable Integer opcio
        Nota important: 
            no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
            tècnica de les excepcions que veurem més endavant
        */
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista de doctors");

    }


    public static void menuNurses() {
        /*
        TODO Heu de desenvolupar el menú infermers amb les opcions que podeu veure.
        Nota: penseu que quan arribem aquí, la propietat clinicActual no és null
        
        Opció 1. Alta -->           Crea un infermer en la clínica actual. Penseu que Clinic sap crear infermers        
        Opció 2. Modificació ->     Permet modificar un infermer que ha d'existir a la clínica actual
                                    (per comprovar l'existència tenim un mètode que ens ajuda a la classe Clinic)
        Opció 3. Llista d' infermers
                            ->      Imprimeix les dades dels infermers de la clínica actual
        
        A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
        Recomanacions:
        - estructura de control switch case per bifurcar les opcions
        - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
          "S'ha de seleccionar una opció correcta del menú."
        - per a l'entrada de dades, millor fer servir la classe Scanner
        - definiu una variable Integer opcio
        Nota important: 
            no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
            tècnica de les excepcions que veurem més endavant
        */
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista d'infermers");
            
    }
    
    


    public static void menuPatients() {
        /*
        TODO Heu de desenvolupar el menú pacients amb les opcions que podeu veure.
        Nota: penseu que quan arribem aquí, la propietat clinicActual no és null
        
        Opció 1. Alta -->           Crea un pacient en la clínica actual. Penseu que Clinic sap crear pacients        
        Opció 2. Modificació ->     Permet modificar un pacient que ha d'existir a la clínica actual
                                    (per comprovar l'existència tenim un mètode que ens ajuda a la classe Clinic)
        Opció 3. Llista de pacients
                            ->      Imprimeix les dades dels pacients de la clínica actual
        
        A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
        Recomanacions:
        - estructura de control switch case per bifurcar les opcions
        - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
          "S'ha de seleccionar una opció correcta del menú."
        - per a l'entrada de dades, millor fer servir la classe Scanner
        - definiu una variable Integer opcio
        Nota important: 
            no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
            tècnica de les excepcions que veurem més endavant
        */
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista de pacients");
            
    }

    

    public static void menuDepartments() {
        /*
        TODO Heu de desenvolupar el menú departaments amb les opcions que podeu veure.
        Nota: penseu que quan arribem aquí, la propietat clínicActual no és null
        Nota: no farem modificació de departaments per abast de l'EAC
        
        Opció 1. Alta -->           Crea una departament en la clínica actual. Penseu que Clinic sap crear departaments
                                    Nota: crear una departament, només és el codi i el nom, hi ha opcions específiques
                                    per afegir doctors, infermers i pacients
        Opció 2. Afegeix doctor
                            ->      Afegeix un doctor a la llista de doctors del departament, però
                                    penseu que Clinic en sap fer-ho
        Opció 3. Afegeix infermer
                            ->      Afegeix un infermer a la llista d'infermers del departament, però
                                    penseu que Clinic en sap fer-ho
        Opció 4. Afegeix pacient
                            ->      Afegeix un pacient a la llista de pacients del departament, però
                                    penseu que Clinic en sap fer-ho
        Opció 5. Llista de departaments
                            ->      Mostra les dades de les departaments de la clínica actual        
        
        A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
        Recomanacions:
        - estructura de control switch case per bifurcar les opcions
        - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
          "S'ha de seleccionar una opció correcta del menú."
        - per a l'entrada de dades, millor fer servir la classe Scanner
        - definiu una variable Integer opcio
        Nota important: 
            no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
            tècnica de les excepcions que veurem més endavant
        */
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Afegir doctor");
            System.out.println("\n3. Afegir infermer");
            System.out.println("\n4. Afegir pacient");
            System.out.println("\n5. Llista de departaments");
            
    }

    public static Integer selectClinic() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi de clínica?:");
        Integer codeSel = teclado.nextInt();
        Integer indexSel = -1;
        for (int i = 0; i < comptaClinics; i++) {
            if (clinics[i].getCode() == codeSel) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

}
