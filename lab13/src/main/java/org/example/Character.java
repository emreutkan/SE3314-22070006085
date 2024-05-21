package org.example;

/**
 * Represents a character with a name and age.
 */
public final class Character {
    /**
     * The name of the character.
     */
    private final String name;
    /**
     *  The age of the character.
     */
    private final int age;

    /**
     * Constructs a new Character with the specified name and age.
     *
     * @param name the name of the character, cannot be null or empty
     * @param age the age of the character, cannot be negative
     * @throws IllegalArgumentException if the name is null or empty, or if the age is negative
     */
    public Character(final String name, final int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the character.
     *
     * @return the name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the character.
     *
     * @return the age of the character
     */
    public int getAge() {
        return age;
    }
}
