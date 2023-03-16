/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectom;

import Clases.Compra;
import Clases.Compras;
import Clases.Cotizaciones;
import Clases.DatosF;
import Clases.Departamentos;
import Clases.Kioscos;
import Clases.Municipios;
import Clases.Tarjetas;
import Clases.Usuarios;
import Clases.chtml;
import Clases.fhtml;
import Clases.ghtml;
import interfaz.Logeo;
import java.util.ArrayList;

/**
 *
 * @author henry
 */
public class ProyectoM {

    /**
     * @param args the command line arguments
     */
    public static  ArrayList<Double> precios = new ArrayList<Double>();
    public static Usuarios listaUsarios = new Usuarios();
    public static Kioscos listak = new Kioscos();
    public static Departamentos listadeps = new Departamentos();
    public static Tarjetas listaTarjetas = new Tarjetas();
    public static DatosF listadatos = new DatosF();
    public static Municipios listaMC = new Municipios();
    public static Cotizaciones listaCot = new Cotizaciones();
    public static Compras listaCompras = new Compras();
    public static chtml html = new chtml();
    public static fhtml fhtml = new fhtml();
    public static ghtml ghtml = new ghtml();
    public static void main(String[] args) {
        
        precios.add(35.00);
        precios.add(25.00);
        precios.add(68.50);
        precios.add(45.55);
        precios.add(58.68);
        precios.add(35.48);
        precios.add(38.68);
        precios.add(32.48);
        precios.add(34.00);
        precios.add(29.00);
        precios.add(44.50);
        precios.add(40.00);
        Logeo f = new Logeo();
        f.setVisible(true);
        
    }
    
}
