package org.example;

import org.example.modelos.Persona;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import picocli.CommandLine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner leerDato = new Scanner(System.in);
        Integer opcion =1;

        while(opcion!=0){
            System.out.println("****Bienvenido**** \n");
            System.out.println("0... SALIR");
            System.out.println("1... ENTRAR DATOS");

            System.out.print("Digita la opción deseada: ");
            opcion = leerDato.nextInt();
            leerDato.nextLine(); //Consumir el salto de línea pendiente

            if (opcion == 0) {
                System.out.println("ADIOS");
                break;
            } else if (opcion == 1) {
                System.out.print("Digite el nombre de la persona: ");
                try {
                    persona.setNombres(leerDato.nextLine());
                } catch (Exception error) {
                    System.out.println("\u001B[33m"+error.getMessage()+"\u001B[0m");
                }
            } else {
                System.out.println("\u001B[33mDigita una opción válida\u001B[0m");

            }

        }





    }
}