// Cat.java
// dD 09/18/25

public class Cat {
    String name = "-";
    int age = 0;
    int livesRemaining = 0;
    private static int totalCats = 0;
    public void meow(){
        System.out.println("Meow");
    }
    Cat(){
        totalCats++;
    }
    public static int getTotalCats(){
        return totalCats;
    }
}
