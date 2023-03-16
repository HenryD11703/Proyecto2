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
public class Tarjetas {
    private ArrayList<Tarjeta> listaTarjetas = new ArrayList<>();
    public Tarjetas(){
        this.listaTarjetas = new ArrayList<>();
    }
    public void AgregarTarjeta(Tarjeta t){
        listaTarjetas.add(t);
    }
//    public void ModificarTarjeta(int indice, Tarjeta t){
//        listaTarjetas.set(indice,t);
//    }
//    public void EliminarTarjeta(int indice){
//        listaTarjetas.remove(indice);
//    }
    public Tarjeta obtenerTarjeta(int indice){
        return listaTarjetas.get(indice);
    }
    public ArrayList<Tarjeta> obtenerListaT(){
        return listaTarjetas;
    }
    public void mostrarT(){
        for(Tarjeta t: listaTarjetas){
            System.out.println(t.fec+"  "+t.num+"  "+t.getTarjeta());
        }
    }
}
