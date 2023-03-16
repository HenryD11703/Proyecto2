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
public class DatosF {
    private ArrayList<DatoF> listaDF = new ArrayList<>();
    
    public DatosF(){
        this.listaDF = new ArrayList<>();
    }
    public void AgregarDatosF(DatoF dato){
        listaDF.add(dato);
    }
    public void modifcarDatosF(int index, DatoF dato){
        listaDF.set(index, dato);
    }
    public void EliminarDatosF(int index){
        listaDF.remove(index);
    }
    public ArrayList<DatoF> obtenerListaDatosF(){
        return listaDF;
    }
    public DatoF obtenerDatosF(int indice){
        return listaDF.get(indice);
    }
    public void mostrarDatosF(){
        for(DatoF datof: listaDF){
            System.out.println(datof.GetDirecF()+"  "+ datof.getNitF()+"  "+datof.getNomF());
        }
    }
}
