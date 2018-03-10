package com.pawlang;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String csvFile = "data.csv";
        String line;
        String cvsSplitBy = ",";
        String outputFile = "output.txt";
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] user = line.split(cvsSplitBy);
                users.add(new User(user[0], user[1], user[2], user[3]));

            }
            users.get(0).setImie("Mieszko");
            users.add(new User("Pawel", "Langa", "4123123456789456", "01/25"));

            PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
            for (User user : users) {
                writer.println(user.writeToString());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
