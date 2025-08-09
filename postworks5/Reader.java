package org.bedu.java.jse.postworks5;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public byte readOption(){
        System.out.println("Opción: ");
        return scanner.nextByte();
    }

    public String readCadena(){
        System.out.println("Cadena: ");
        return scanner.nextLine();
    }

}
