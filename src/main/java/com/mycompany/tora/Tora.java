/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tora;

/**
 *
 * @author karas
 */
import java.util.Scanner;
public class Tora {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine();
            System.out.println("Te amore " + name);
        }
    }
}
