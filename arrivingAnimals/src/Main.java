// App.java
// dD 09/25/2025

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        int animalCounter = 0;

        // buffered writer and reader code from W3 Schools
        try (BufferedReader br = new BufferedReader(new FileReader("arrivingAnimals.txt"))){
            String line = "-";
            while ((line = br.readLine()) != null){
                // creates a new animal object for every line
                animals.add(new Animal());
                // prints out line to the console
                System.out.println(line);
                // splits the line using comma delimiter
                String[] commaParts = line.split(",");

                // takes the first chunk of words before the comma and delimits using space
                String[] words = commaParts[0].split(" ");
                // Sets the age of the animal on that index of the array list and set fields
                // sets age of animal
                animals.get(animalCounter).setAge(words[0]);
                // sets sex of animal
                animals.get(animalCounter).setSex(words[3]);
                // sets species of animal
                animals.get(animalCounter).setSpecies(words[4]);

                // creates a new array of words for the second part of the line
                words = commaParts[1].split(" ");
                // sets season born of animal
                animals.get(animalCounter).setSeasonBorn(words[2]);

                // creates a new array of words for the third part of the line
                words = commaParts[2].split(" ");
                // sets color of animal
                animals.get(animalCounter).setColor(words[0]);

                // creates new array of words for the fourth part of the line
                words = commaParts[3].split(" ");
                // sets weight of animal
                animals.get(animalCounter).setWeight(words[0]);

                // creates a new array of words for the fifth part of the line
                words = commaParts[4].split(" ");
                // sets zoo of animal
                animals.get(animalCounter).setZoo(words[1] + words[2]);

                // creates a new array of words (just 1 in this case) for the sixth part of the line
                words = commaParts[5].split(" ");
                // sets country of animal
                animals.get(animalCounter).setCountry(words[0]);

                System.out.println("Age: " + animals.get(animalCounter).getAge());
                System.out.println("Sex: " + animals.get(animalCounter).getSex());
                System.out.println("Species: " + animals.get(animalCounter).getSpecies());
                System.out.println("Season Born: " + animals.get(animalCounter).getSeasonBorn());
                System.out.println("Color: " + animals.get(animalCounter).getColor());
                System.out.println("Weight: " + animals.get(animalCounter).getWeight());
                System.out.println("Zoo: " + animals.get(animalCounter).getZoo());
                System.out.println("Country: " + animals.get(animalCounter).getCountry());

                // increments animalCounter to move to the next line
                animalCounter++;
            }
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}