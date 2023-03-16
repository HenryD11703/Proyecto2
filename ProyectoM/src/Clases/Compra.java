/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class Compra {
    private int num;
    private String cod;
    private String origen;
    private String destino;
    private String nit;
    private String tipoP;
    private String tamañoP;
    private String numPaquetes;
    private String NombreV;
    private String total;
    public Compra(int num, String cod, String origen, String destino, String nit, String tipoP, String tamañoP, String numPaquetes,String NombreV, String total){
    this.num = num;
    this.cod = cod;
    this.origen = origen;
    this.destino = destino;
    this.nit = nit;
    this.tipoP = tipoP;
    this.tamañoP = tamañoP;
    this.numPaquetes = numPaquetes;
    this.NombreV = NombreV;  
    this.total = total;
    }    
    public String getTotal(){
        return total;
    }
    public int getNum(){
        return num;
    }
    public String getCod(){
        return cod;
    }
    public String getOrigen(){
        return origen;
    }
    public String getDestino(){
        return destino;
    }
    public String getNit(){
        return nit;
    }
    public String getTipoPago(){
        return tipoP;
    }
    public String getTamaño(){
        return tamañoP;
    }
    public String getNPaquetes(){
        return numPaquetes;
    }
    public String getNomVendedor(){
        return NombreV;
    }
}
