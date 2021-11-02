package cac.javam2;

import java.util.Scanner;

public class CaCJavaM2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        String edad = scanner.nextLine();
        System.out.println("Ingrese su principal hobbie: ");
        String hobbie = scanner.nextLine();
        System.out.println("Ingrese su editor de código preferido: ");
        String editorDeCodigo = scanner.nextLine();
        System.out.println("Ingrese su sistema operativo preferido: ");
        String so = scanner.nextLine();

        System.out.println("Nombre: " + nombre + " - Apellido: " + apellido + " - Edad: " + edad + " - Hobbie: " + hobbie + " - Editor de codigo: " + editorDeCodigo + " - Sistema operativo: " + so);
    }

}
