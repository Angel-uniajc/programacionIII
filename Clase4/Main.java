package Clase4;
import java.util.Arrays;

public class Main{
public static void main(String[] args) {

        Libro lib1 = new Libro("La culpa es de la vaca","Pacholito", 25000);
        Libro lib2 = new Libro("Sangre de campeon","El campeon", 29000);
        Libro lib3 = new Libro("100 años de soledad","Gabriel Garcia", 15000);
        Libro lib4 = new Libro("La malancolia de los feos","Chencho corleone", 30000);
        Libro lib5 = new Libro("La voragine","Mario Mendoza", 45000);


        Libro[] l = new Libro[5];
        l[0] = lib1;
        l[1] = lib2;
        l[2] = lib3;
        l[3] = lib4;
        l[4] = lib5;

        /*System.out.println(Arrays.toString(l));
        System.out.println(l[0].calcularPrecio(l));*/
        
        l[0].ordenarMayor(28000, l);
    }
}