/**
 * package.
 */
package org.example;

/**
 * Represents characters from "The Lord of the Rings" universe.
 */
public final class Character {
    /** Name of the character. */
    private final String name;

    /** Race of the character. */
    private final String race;

    /** Age of the character. */
    private final int age;

    /** Age limit to differentiate older characters. */
    private static final int AGE_LIMIT = 50;

    /**
     * Constructs a new character with the specified name, race, and age.
     *
     * @param charName the character's name
     * @param charRace the character's race
     * @param charAge the character's age
     */
    public Character(final String charName,
                     final String charRace,
                     final int charAge) {
        this.name = charName;
        this.race = charRace;
        this.age = charAge;
    }

    /**
     * Prints the details of the character.
     * This method can be overridden in subclasses.
     */
    public void printDetails() {
        if ("Hobbit".equals(race)) {
            System.out.println("Character is a Hobbit");
        } else if (age >= AGE_LIMIT) {
            System.out.println("Character is 50 or older");
        } else if ("Frodo".equals(name)) {
            System.out.println("Character is Frodo");
        }
    }
}
