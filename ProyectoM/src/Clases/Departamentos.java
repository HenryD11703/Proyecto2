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
public class Departamentos {
    private ArrayList<Departamento> listadeps = new ArrayList<>();
    public Departamentos(){
        this.listadeps = new ArrayList<>();
}
    
    public void AgregarDep(Departamento e){
    listadeps.add(e);
    }
    public void modificarDep(int indice, Departamento e){
    listadeps.set(indice,e);
    }
    public void eliminarDep(int indice){
        listadeps.remove(indice);
    }
    public Departamento obtenerDep(int indice){
    return listadeps.get(indice);
    }
    public ArrayList<Departamento> obtenerListaDeps(){
        return listadeps;
    }
    public void mostrardeps(){
    for(Departamento deps : listadeps){
        System.out.println(deps.codr+"  "+deps.region+"  "+deps.dep);
    }
    }
}
