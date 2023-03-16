/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author henry
 */
public class Municipios {
    private ArrayList<Municipio> listaMuns = new ArrayList<>();
    public Municipios(){
        this.listaMuns = new ArrayList<>();
    }
    public void AgregarMun(Municipio m){
        listaMuns.add(m);
    }
    public Municipio obtenerMun(int indice){
        return listaMuns.get(indice);
    }
    public ArrayList<Municipio> obtenerListaMuns(){
        return listaMuns;
    }
    
}
