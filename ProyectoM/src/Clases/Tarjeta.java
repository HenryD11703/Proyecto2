/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class Tarjeta {

    public String tarjeta;
    public String num;
    public String fec;

    public Tarjeta(String tarjeta, String num, String fec) {
        this.fec = fec;
        this.num = num;
        this.tarjeta = tarjeta;
    }

    public String getTarjeta() {
        String xMaskedTarjeta = "XXXX-XXXX-XXXX-" + tarjeta.substring(15);
        return xMaskedTarjeta;
    }

    public String getNumT() {
        return num;
    }

    public String getFecT() {
        return fec;
    }
}
