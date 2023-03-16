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
public class Kioscos {
    private ArrayList<Kiosco> listak = new ArrayList<>();
    
    public Kioscos(){
    this.listak = new ArrayList<>();
    }
    public void agregarKiosco(Kiosco kiosco){
    listak.add(kiosco);
    }
    public void modificarKiosco(int indice, Kiosco kiosco){
    listak.set(indice, kiosco);
    }
    public void eliminarKiosco(int indice){
        listak.remove(indice);
    }
    public Kiosco obtenerKioscos(int indice){
        return listak.get(indice);
    }
    public ArrayList<Kiosco> obtenerListaKioscos(){
        return listak;
    }
    public void mostrark(){
    for(Kiosco kc : listak){
        System.out.println(kc.codigoR+"   "+kc.codigok+"  "+kc.nombrek);
    }
    }
}
