/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    private String nombre;
    private String autor;
    private int paginas;
    private int calificacion;

    public Libro(String nombre, String autor, int paginas, int calificacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}
