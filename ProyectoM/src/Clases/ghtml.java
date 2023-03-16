/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author henry
 */
public class ghtml {

    private String ruta = "C:\\Users\\henry\\OneDrive\\Escritorio\\Proyecto1\\Guia.html";
    private String contenido = "";

    public ghtml() {

    }

    public String getRuta() {
        return ruta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido += contenido + "\n";
    }

    public void crearArchivo() {
        /*
        <html>
        <head>
        <title>Mi primera pagina</title>
        </head>
        <body>
        Hola mundo
        </body>
        </html>
         */

        String body = this.getContenido().replace("\n", "<br>");

        String html = "<html>"
                + "<head>"
                + "<title>Guia</title>"
                + "</head>"
                + "<center>"
                + "<h2>"
                + "Guia (Etiqueta de Envio)"
                + "</h2>"
                + "<body>"
                + body
                + "<br>"
                +"<img src='C:\\Users\\henry\\OneDrive\\Escritorio\\cdb.png' alt='Imagen 1'>"
                + "</body>"
                + "</center>"
                + "</hmtl>";

        File file = new File(getRuta());

        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(html);
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
