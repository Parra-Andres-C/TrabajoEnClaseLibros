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
public class conjuntoLibro {
    public Libro libros[];
    private int i;
    public conjuntoLibro(Libro[] libros) {
        this.libros = new Libro[10];
        this. i = 0;
    }
    
    public void crearLibro(){
        for ( i = 0 ; i <= 10; i++){
            this.libros[i] = new Libro("assd", "brere", 1, 5);
            
        }
        int a = 0;
        if (libros[a] == null){
            this.libros[a] = new Libro ("prueba2", "prueba 2", 12, 10);
        }else{
            a++;
        }
    }
    public void borrarLibroAutor( String Au){
       int a = 0;
       if ( Au.equals(libros[a].getAutor())){
           libros[a] = null;
       }else{
           a++;
       }
    }
}
