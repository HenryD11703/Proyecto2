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
public class Compras {
    public ArrayList<Compra> listaCompra = new ArrayList<>();
    public Compras(){
        this.listaCompra = new ArrayList<>();
    }
    public void AgregarCompra(Compra d){
        listaCompra.add(d);
    }
    public Compra obtenerCompra(int in){
        return listaCompra.get(in);
    }
    public ArrayList<Compra> obtenerListaCompra(){
        return listaCompra;
    }
        public void mostrarCompras() {
        for (Compra c : listaCompra) {
            System.out.println("Número: " + c.getNum());
            System.out.println("Código: " + c.getCod());
            System.out.println("Origen: " + c.getOrigen());
            System.out.println("Destino: " + c.getDestino());
            System.out.println("NIT: " + c.getNit());
            System.out.println("Tipo de pago: " + c.getTipoPago());
            System.out.println("Tamaño del paquete: " + c.getTamaño());
            System.out.println("Número de paquetes: " + c.getNPaquetes());
            System.out.println("Nombre del vendedor: " + c.getNomVendedor());
            System.out.println("Precio Total: " + c.getTotal());
            System.out.println("-----------------------");
        }
    }
}
