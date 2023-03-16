/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class DatoF {
    private String NombreF;
    private String DireccF;
    private String NitF;
    public DatoF(String NombreF, String DireccF, String NitF){
        this.NitF = NitF;
        this.DireccF = DireccF;
        this.NombreF = NombreF;
    }
    public String getNomF(){
        return NombreF;
    }
    public String GetDirecF(){
        return DireccF;
    }
    public String getNitF(){
        return NitF;
    }
}
