
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class Usuario {

    public String Correo;
    public String Apellido;
    public String Nombre;
    public String Contra;
    public String DPI;
    public String fec;
    public String gen;
    public String Nac;
    public String Alias;
    public String Tel;
    public String Rol;

    public Usuario(String Correo, String Nombre, String Apellido, String Contra, String DPI, String fec, String gen, String Nac, String Alias, String Tel, String Rol) {
        this.Correo = Correo;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Contra = Contra;
        this.DPI = DPI;
        this.fec = fec;
        this.gen = gen;
        this.Nac = Nac;
        this.Alias = Alias;
        this.Tel = Tel;
        this.Rol = Rol;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContra() {
        return Contra;
    }

    public String getDPI() {
        return DPI;
    }

    public String getFec() {
        return fec;
    }

    public String getGen() {
        return gen;
    }

    public String getNac() {
        return Nac;
    }

    public String getAlias() {
        return Alias;
    }

    public String getTel() {
        return Tel;
    }

    public String getRol() {
        return Rol;
    }

    public String getApe() {
        return Apellido;
    }

}
