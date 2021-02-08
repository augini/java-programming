package Spectre;

import java.nio.file.Paths;
import java.util.Scanner;

public class Spectre {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("./file.txt"))) {
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();

                // skip the empty lines
                if (row.isEmpty()) {
                    continue;
                }
                // we print the line that we read
                System.out.println(row);
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
