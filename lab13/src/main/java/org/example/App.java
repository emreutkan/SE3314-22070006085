package org.example;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        try {
            Character frodo = new Character("Frodo Baggins", -50);
            Character aragorn = new Character("Aragorn", 87);
            MiddleEarthMap map = new MiddleEarthMap();
            Quest quest = new Quest("", frodo, map);

            quest.addParticipant(aragorn);
            quest.start();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
