/**
 * package.
 */
package org.example;

/**
 * Represents the world of Middle-Earth.
 */
public final class MiddleEarthMap {
    /**
     * Navigates to the specified location in Middle-Earth.
     * If the secret passage is used, prints relevant messages.
     *
     * @param location the destination in Middle-Earth
     * @param isSecretPassage indicates whether to use a secret passage
     */
    public void navigate(final String location, final boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break;
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            default:
                System.out.println("Unknown location");
                break;
        }

        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
