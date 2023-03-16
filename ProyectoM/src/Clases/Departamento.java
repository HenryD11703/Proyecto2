/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author henry
 */
public class Departamento {
    public String codr;
    public String region;
    public String dep;
    public Departamento(String codr, String region, String dep){
    this.codr = codr;
    this.region = region;
    this.dep = dep;
    }
    public String getCodr(){
    return codr;
    }
    public String getRegion(){
    return region;
    }
    public String getDep(){
    return dep;
    }
}
