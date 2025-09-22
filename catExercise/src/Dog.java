public class Dog {
    String name = "-";
    int age = 0;
    public static int totalDogs = 0;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        totalDogs++;
    }
    public static int getTotalDogs(){
        return totalDogs;
    }
}

