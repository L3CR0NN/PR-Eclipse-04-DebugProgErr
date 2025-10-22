package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= numAlumnos; i++) {
            double nota = -1;

            
            while (nota < 0 || nota > 10) {
                System.out.print("Introduce la nota del alumno " + i + " (0 a 10): ");
                if (sc.hasNextDouble()) {
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("La nota debe estar entre 0 y 10.");
                    }
                } else {
                    sc.next(); 
                }
            }

            suma += nota;
        }

        double media = suma / numAlumnos;
        System.out.println("La media del grupo es: " + media);

        sc.close();
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
