/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Track {

    private Integer code;
    private Date dataTrack;
    private String tipusMesura;
    private String patient;
    private Float valor;

    /*
    TODO Constructor
    Paràmetres: Integer codi, Date dataTrack, String tipusMesura, String patient, Float valor
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
    */ 
    
    public Track(Integer code, Date dataTrack, String tipusMesura, String patient, Float valor)
    {
        this.setCode(code);
        this.setDataTrack(dataTrack);
        this.setTipusMesura(tipusMesura);
        this.setPatient(patient);
        this.setValor(valor);
    }
    
    /*
    TODO Mètodes accessors    
    */

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getDataTrack() {
        return dataTrack;
    }

    public void setDataTrack(Date dataTrack) {
        this.dataTrack = dataTrack;
    }

    public String getTipusMesura() {
        return tipusMesura;
    }

    public void setTipusMesura(String tipusMesura) {
        this.tipusMesura = tipusMesura;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    
    public static Track addTrack() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear una nou registre(track) (són les dades que demana el constructor)
    Retorneu: El registre (track) creat
    */
    Date dataTrack= null;
    Scanner teclat= new Scanner(System.in);
    System.out.println("Introduzca el código de registro: ");
    Integer code= teclat.nextInt();
    
    System.out.println("Introduzca la fecha del registro (dd/mm/aaaa)");
    try{
        dataTrack = new simpleDateFormat("dd/MM/yyyy").parse(teclat.next());
    } catch (Exception e) {
    
    }
    
    System.out.println("Introduzca el tipo de medida: ");
    String tipusMedida= teclat.next();
    
    
    System.out.println("Introduzca el paciente: ");
    String patient= teclat.next();
    
    System.out.println("Introduzca el valor del registre: ");
    Float valor= teclat.nextFloat();
    
    return new Track(code, dataTrack, tipusMedida, patient, valor);
    }
}
    

