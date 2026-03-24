package ZooSystem;

import java.util.Scanner;

/**
 * This class simulates another part of the system.
 * 
 * Important Teaching Point:
 * We now have MULTIPLE classes that need to create animals.
 * 
 * Without Factory:
 * - We would duplicate the same if-else logic here again
 * 
 * With Factory:
 * - We reuse the same creation logic
 */

public class AnimalShow {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Animal Type: ");
        String type = s.next();

        /**
         * Notice:
         * We are using the SAME factory again.
         * 
         * This avoids duplication and keeps consistency.
         */

        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.createAnimal(type);

        animal.makeSound();
    }
}
