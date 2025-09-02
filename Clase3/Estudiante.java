import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Estudiante {

    //Atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;
    private String [] c;

    //constructor
    public Estudiante(int id, int cedula, String nombre, String facultad){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    //metodo toString
    public String toString(){
        return "Estudiante: [id: "+ id +" cedula: "+cedula+" nombre: "+nombre+" Facultad: " +facultad+"]";
    
    }
    
    

    //metodo matricularCursos
    public void matricularCursos(String[] cursos){
        System.out.println(Arrays.toString(cursos));
    }

    //metodo matricularCursosEstu

    public void matricularCursosEstu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de cursos: ");
        int p = scanner.nextInt(); 
        scanner.nextLine();
        c = new String[p];
        
        for (int i = 0; i < p; i++){
            System.out.println("ingrese el curso "+(i+1)+": ");
            String k = scanner.nextLine();
            c[i] = k;
        }
    }

    public String[] getCursos(){
        return c;
    }
    public void mostrarCursos(){
        System.out.println("Sus cursos son: ");
        for (int i = 0; i < getCursos().length; i++)
            System.out.println(getCursos()[i]);
    }

}