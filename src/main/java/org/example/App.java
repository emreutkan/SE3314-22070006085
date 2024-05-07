/**
 * package.
 */
package org.example;

/**
 * Main class for handling operations in the Middle-Earth universe.
 */
public final class App {
    // Constants to replace magic numbers

    /** Age of frodo. */
    private static final int FRODO_AGE = 50;
    /** quest points. */
    private static final int QUEST_POINTS = 100;

    /**
     * The main entry point of the application.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(final String[] args) {
        // Create the character "Frodo" and print details
        Character frodo = new Character("Frodo", "Hobbit", FRODO_AGE);
        frodo.printDetails();

        // Navigate to "Mordor" using the Middle-Earth map
        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor", false);

        // Complete a quest with specific points
        Quest quest = new Quest();
        quest.completeQuest(QUEST_POINTS, false);
    }

    // Private constructor to prevent instantiation
    private App() {
    }
}
