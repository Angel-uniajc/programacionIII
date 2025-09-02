import java.util.Arrays;

public class EjecutarEstudiante{
    public static void main(String[] args) {
        
        //Creacion de los objetos

        Estudiante objEst1 = new Estudiante(1,156165161,"Angelica","Ingenieria");
        Estudiante objEst2 = new Estudiante(2,1561651266,"Camilo","Ingenieria");
        Estudiante objEst3 = new Estudiante(3,156000161,"Dabucodonosor","Salud");

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        //creacion del arreglo de objetos (Estudiantes)

        Estudiante[] e = new Estudiante[4];
        e[0] = objEst1;
        e[1] = objEst2;
        e[2] = objEst3;
        e[3] = new Estudiante(4, 1231561, "Pepe", "Salud");

        System.out.println(Arrays.toString(e));

        objEst1.matricularCursosEstu();
        objEst1.mostrarCursos();
        
        //Actividad independiente
        //Implementar el metodo matricular cursos para que cada estudiante pueda realizar dicha operación.
    }
}