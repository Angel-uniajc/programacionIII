package Clase4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Libro {

    private String titulo;
    private String autor;
    private double precio;


    public Libro (String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public double calcularPrecio(Libro []libros){
        double suma = 0.0;

        for (int i = 0; i < libros.length; i++)
            suma += libros[i].precio;

        return suma;
    }

    public String toString(){
        return "Libro [Titulo: "+titulo+"Autor: "+autor+"Precio: "+precio+" ]";
    }
    
    public void ordenarMayor(int p,Libro [] libros){
        Libro[] nuevo = new Libro[libros.length];
        for (int i = 0; i < libros.length; i++){
            if (libros[i].precio > p){
                nuevo[i] = libros[i]; 
            }
        }

        System.out.println("Estos son los libros que superan ese valor"+ Arrays.toString(nuevo));
    }    
}
