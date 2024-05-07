/**
 * org.example package.
 */
package org.example;

/**
 * Represents different quests in the Middle-Earth universe.
 */
public final class Quest {
    /** Minimum points threshold for qualification. */
    private static final int MIN_POINTS = -100;

    /** The famous number representing a significant quest result. */
    private static final int FAMOUS_NUMBER = 42;

    /** The threshold for point qualification. */
    private static final int POINT_THRESHOLD = 50;

    /** The maximum threshold for point qualification. */
    private static final int MAX_THRESHOLD = 100;

    /**
     * Completes a quest based on the provided points.
     *
     * @param points        the score for the quest completion
     * @param isRingBearer  indicates if the character is a Ring Bearer
     * @return true if the quest is successful, otherwise, false
     */
    public boolean completeQuest(final int points, final boolean isRingBearer) {
        boolean isQualified = (points > 0 && isRingBearer)
                || (points < MIN_POINTS)
                || (points == FAMOUS_NUMBER);

        if (points > POINT_THRESHOLD && points < MAX_THRESHOLD
                && points % 2 == 0 && isQualified) {
            System.out.println("Qualified");
        }

        return points >= MAX_THRESHOLD;
    }
}
