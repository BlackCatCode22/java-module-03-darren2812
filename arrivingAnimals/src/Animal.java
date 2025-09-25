// Animal.java
// dD 09/25/2025

public class Animal {
    // defining data fields for animal class and assigning default values
    String name = "-";
    int age = 0;
    String species = "-";
    String sex  = "-";
    String color = "-";
    int weight = 0;
    String zoo = "-";
    String seasonBorn = "-";
    String country = "-";

    // public setters
    public void setAge(String ageString){
        age = Integer.parseInt(ageString);
    }
    public void setSex(String sexString){
        sex = sexString;
    }
    public void setSpecies(String speciesString){
        species = speciesString;
    }
    public void setSeasonBorn(String seasonString){
        seasonBorn = seasonString;
    }
    public void setColor(String colorString) {
        color = colorString;
    }
    public void setWeight(String weightString){
        weight = Integer.parseInt(weightString);
    }
    public void setZoo(String zooString){
        zoo = zooString;
    }
    public void setCountry(String countryString){
        country = countryString;
    }

    // public getters
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public String getSpecies(){
        return species;
    }
    public String getSeasonBorn(){
        return seasonBorn;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public String getZoo(){
        return zoo;
    }
    public String getCountry(){
        return country;
    }
}
