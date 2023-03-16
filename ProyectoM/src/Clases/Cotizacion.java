/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class Cotizacion {
    private String NombreU;
    private String OrigenD;
    private String OrigenM;
    private String DestinoD;
    private String DestinoM;
    private int Npaquetes;
    private String PesoP;
    private String Total;
    public Cotizacion(String NombreU, String OrigenD, String OrigenM, String DestinoD, String DestinoM, int Npaquetes, String PesoP, String Total){
        this.NombreU = NombreU;
        this.OrigenD = OrigenD;
        this.OrigenM = OrigenM;
        this.DestinoD = DestinoD;
        this.DestinoM = DestinoM;
        this.Npaquetes = Npaquetes;
        this.PesoP = PesoP;
        this.Total = Total;
    }
        public String getNombreU() {
        return NombreU;
    }
    
    public String getOrigenD() {
        return OrigenD;
    }
    
    public String getOrigenM() {
        return OrigenM;
    }
    
    public String getDestinoD() {
        return DestinoD;
    }
    
    public String getDestinoM() {
        return DestinoM;
    }
    
    public int getNpaquetes() {
        return Npaquetes;
    }
    
    public String getPesoP() {
        return PesoP;
    }
    
    public String getTotal() {
        return Total;
    }
}
