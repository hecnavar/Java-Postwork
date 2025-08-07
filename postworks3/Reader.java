package org.bedu.java.jse.postworks3;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public byte readOption(){
        System.out.println("Opción: ");
        return scanner.nextByte();
    }

}
