/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class Municipio {
    String Depart;
    String NomMun;
    public Municipio(String Depart, String NomMun){
        this.Depart = Depart;
        this.NomMun = NomMun;
    }
    public String getDepM(){
        return Depart;
    }
    public String getNomMun(){
        return NomMun;
    }
}
