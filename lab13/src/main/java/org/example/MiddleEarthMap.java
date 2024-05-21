package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a map of Middle Earth with various locations.
 */
public final class MiddleEarthMap {
    private ArrayList<String> locations;

    /**
     * Constructs a MiddleEarthMap and loads locations from the specified file.
     */
    public MiddleEarthMap() {
        try {
            loadLocations("map.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error loading map: " + e.getMessage());
            locations = new ArrayList<>();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            locations = new ArrayList<>();
        }
    }

    /**
     * Loads locations from a specified file.
     *
     * @param fileName the name of the file containing the locations
     * @throws FileNotFoundException if the specified file is not found
     */
    private void loadLocations(final String fileName) throws FileNotFoundException {
        locations = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Map file not found: " + fileName);
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                locations.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("Error reading from file: " + fileName, e);
        }
    }

    /**
     * Returns the list of locations in Middle Earth.
     *
     * @return an ArrayList of locations
     */
    public ArrayList<String> getLocations() {
        return locations;
    }
}
