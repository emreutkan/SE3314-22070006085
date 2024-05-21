package org.example;

import java.util.ArrayList;

/**
 * Represents a quest in Middle Earth with a name, a leader, participants, and a map.
 */
public final class Quest {
    /**
     * The name of the quest.
     */
    private final String questName;

    /**
     * The leader of the quest.
     */
    private final Character leader;

    /**
     * The participants of the quest.
     */
    private final ArrayList<Character> participants;

    /**
     * The map of Middle Earth.
     */
    private final MiddleEarthMap map;

    /**
     * Constructs a Quest with the specified name, leader, and map.
     *
     * @param questName the name of the quest, cannot be null or empty
     * @param leader the leader of the quest, cannot be null
     * @param map the map of Middle Earth, cannot be null
     * @throws IllegalArgumentException if the questName is null or empty, or if the leader is null
     */
    public Quest(final String questName, final Character leader, final MiddleEarthMap map) {
        if (questName == null || questName.isEmpty()) {
            throw new IllegalArgumentException("Quest name cannot be null or empty");
        }
        if (leader == null) {
            throw new IllegalArgumentException("Leader cannot be null");
        }
        if (map == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }
        this.questName = questName;
        this.leader = leader;
        this.map = map;
        this.participants = new ArrayList<>();
    }

    /**
     * Adds a participant to the quest.
     *
     * @param character the character to add as a participant, cannot be null
     * @throws IllegalArgumentException if the character is null
     */
    public void addParticipant(final Character character) {
        if (character == null) {
            throw new IllegalArgumentException("Participant cannot be null");
        }
        participants.add(character);
    }

    /**
     * Starts the quest and prints details about it.
     */
    public void start() {
        try {
            System.out.println("Starting quest: " + questName);
            System.out.println("Leader: " + leader.getName());
            System.out.println("Participants:");
            for (Character participant : participants) {
                System.out.println(participant.getName() + ", age: " + participant.getAge());
            }
            System.out.println("Map locations:");
            for (String location : map.getLocations()) {
                System.out.println(location);
            }
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A generic error occurred.");
        }
    }
}
