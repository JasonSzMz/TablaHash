/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testhash;

import java.util.Scanner;

/**
 *
 * @author JasonDGR
 */
public class TestHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int indice, option=0;
        DatosTabla dt = new DatosTabla();
        
        do{
            System.out.println("Menu \n\n1- Iniciar\n2-Salir\n\nOpcion -> ");
            option = lector.nextInt();
            
            switch(option){
                case 1 -> {
                    System.out.println("Ingresar limite: ");
                    dt.setLimite(lector.nextInt());
                    System.out.println("Ingrese el nombre");
                    dt.setName(lector.next());
        
                    indice = dt.getSumCode();
        
                    System.out.println("index "+ indice);
                    System.out.println("\n\n\n");
                }
                case 2 -> {
                    System.out.println("Bye...");
                }
            }
        }while(option!=2);
        
    }
    
}
