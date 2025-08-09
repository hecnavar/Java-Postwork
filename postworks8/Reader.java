package org.bedu.java.jse.postworks8;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public byte readOption(){
        System.out.println("Opción: ");
        byte option = scanner.nextByte();
        scanner.nextLine();
        return option;
    }

    public String readCadena(){
        System.out.println("Cadena: ");
        return scanner.nextLine();
    }

}
