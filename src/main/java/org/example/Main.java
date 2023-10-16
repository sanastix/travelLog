package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            Set<String> cities = new HashSet<>();

            for (int j = 0; j < n; j++) {
                String city = scanner.next();
                cities.add(city);
            }

            System.out.println(cities.size());
        }

    }
}