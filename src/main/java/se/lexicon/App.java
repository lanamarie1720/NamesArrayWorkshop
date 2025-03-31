package se.lexicon;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository.getSize());
        // call more methods as needed

        printAllNames(NameRepository.findAll());
        textDivider();

        String[] namesToAdd = {"Lana Brokaw", "David Mbiydzenyuy", "Agnes Nazie", "Monica Björk", "Andreas Fjällid", "Ilya Panayotov", "Dennis O"};
        for (String Name : namesToAdd) {
            boolean result = NameRepository.add(name);
            if (result) {
                System.out.println("Name added successfully: " + name);
            } else {
                System.out.println("Name already exists: " + name);
            }
        }

        printAllNames(NameRepository.findAll());
        textDivider();

        String[] namesToRemove = {"Lana Brokaw", "Agnes Nazie", "Andreas Fjällid"};
        for (String name : namesToRemove) {
            if (NameRepository.remove(name)) {
                System.out.println("The name " + " has been removed.");
            } else {
                System.out.println("The name " + " cannot be found. Errand has been cancelled.");
            }
            printAllNames(NameRepository.findAll());
        }
        textDivider();
    }

    private static void printAllNames(String[] result) {
        System.out.println("All names: ");
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                System.out.println(result[i] + "\n");
            } else {
                System.out.println(result[i] + ", ");
            }
        }

        private static void textDivider() {
            System.out.println("-------------- \n");
        }
    }
}
