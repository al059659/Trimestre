/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestreaño;

import java.util.Scanner;

/**
 *
 * @author reyap
 */
public class TrimestreAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un número de la lista para escoger un mes y determinar el trimestre.");
        System.out.println("(1) Enero" + "\n(2) Febrero" + "\n(3) Marzo" + "\n(4) Abril" + "\n(5) Mayo" + "\n(6) Junio" + "\n(7) Julio" + "\n(8) Agosto" + "\n(9) Septiembre" + "\n(10) Octubre" + "\n(11) Noviembre" + "\n(12) Diciembre");
        
        Scanner read = new Scanner(System.in);
        int mes = read.nextInt();
        
        if (mes >= 1 && mes <=12) {
            switch (mes) {
                case 1:
                    System.out.println("El mes seleccionado fue Enero y pertenece al primer trimestre.");
                    break;
                case 2:
                    System.out.println("El mes seleccionado fue Febrero y pertenece al primer trimestre.");
                    break;
                case 3:
                    System.out.println("El mes seleccionado fue Marzo y pertenece al primer trimestre.");
                    break;
                case 4:
                    System.out.println("El mes seleccionado fue Abril y pertenece al segundo trimestre.");
                    break;
                case 5:
                    System.out.println("El mes seleccionado fue Mayo y pertenece al segundo trimestre.");
                    break;
                case 6:
                    System.out.println("El mes seleccionado fue Junio y pertenece al segundo trimestre.");
                    break;
                case 7:
                    System.out.println("El mes seleccionado fue Julio y pertenece al tercero trimestre.");
                    break;
                case 8:
                    System.out.println("El mes seleccionado fue Agosto y pertenece al tercero trimestre.");
                    break;
                case 9:
                    System.out.println("El mes seleccionado fue Septiembre y pertenece al tercero trimestre.");
                    break;
                case 10:
                    System.out.println("El mes seleccionado fue Octubre y pertenece al cuarto trimestre.");
                    break;
                case 11:
                    System.out.println("El mes seleccionado fue Noviembre y pertenece al cuarto trimestre.");
                    break;
                case 12:
                    System.out.println("El mes seleccionado fue Diciembre y pertenece al cuarto trimestre.");
                    break;
                
            }
            
        } else {
            System.out.println("Por favor, ingrese un número de la lista para seleccionar un mes.");
        }
    }
    
}
