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
public class Cotizaciones {

    private ArrayList<Cotizacion> listaCot = new ArrayList<>();

    public Cotizaciones() {
        this.listaCot = new ArrayList<>();
    }

    public void AgregarCot(Cotizacion c) {
        listaCot.add(c);
    }
    public void EliminarCot(int ind){
        listaCot.remove(ind);
    }

    public Cotizacion obtenerCot(int indice) {
        return listaCot.get(indice);
    }

    public ArrayList<Cotizacion> obtenerListaCot() {
        return listaCot;
    }

    public void mostrarCot() {
        for (Cotizacion c : listaCot) {
            System.out.println("Usuario:  " + c.getNombreU() + "  Con Origen en:  " + c.getOrigenD() + "  " 
                    + c.getOrigenM() + "  Y con destino en: " + c.getDestinoD() + "  " + c.getDestinoM() + "   La cantidad de Paquetes:  " + c.getNpaquetes()
                    + "  Con peso de: " + c.getPesoP() + " lb     Lo que como total tiene: " + c.getTotal());
        }
    }
}
