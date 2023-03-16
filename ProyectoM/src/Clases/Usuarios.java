/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author henry
 */
public class Usuarios {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private String UserLog;

    public Usuarios() {
        this.listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void modificarUsuario(int indice, Usuario usuario) {
        listaUsuarios.set(indice, usuario);
    }

    public void eliminarUsuario(int indice) {
        listaUsuarios.remove(indice);
    }

    public Usuario obtenerUsuario(int indice) {
        return listaUsuarios.get(indice);
    }

    public ArrayList<Usuario> obtenerListaUsuarios() {
        return listaUsuarios;
    }
    public void UserLoged(String user){
        this.UserLog = user;
    }
    public String UserL(){
        return UserLog;
    }
    
     public boolean revisar(Usuario ingresado) {
        boolean permitir = false;
        for (Usuario user : listaUsuarios) {
            if (ingresado.Alias.equalsIgnoreCase(user.Alias)
                    && ingresado.Contra.equals(user.Contra)) {
                permitir = true;
                break;
            }
        }

        return permitir;
    }

    public static boolean validarPassword(String password) throws Exception {
        boolean contieneMayuscula = false;
        boolean contieneMinuscula = false;//comprobando que la contraseña tenga los valores
        boolean contieneNumero = false;//   necesitados, si los tiene el valor de validarPassword
        boolean contieneSimbolo = false;//  sera true

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                contieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                contieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                contieneNumero = true;
            } else {
                contieneSimbolo = true;
            }
        }

        if (!contieneMayuscula || !contieneMinuscula || !contieneNumero || !contieneSimbolo) {
            throw new Exception("Debe tener al menos una mayuscula, una minúscula, un numero y un simbolo");
        }

        return true;
    }
 public void mostrar() {
        for (Usuario personas : listaUsuarios) {
            System.out.println(personas.Correo + "  " + personas.Nombre+ "  "+personas.Apellido+"  "+personas.DPI+"  "+personas.Alias);
        }
    }
}
