// App.java
// dD 09/18/25

public class App {
    public static void main(String[] args) {
        Cat newCat = new Cat();
        System.out.println(Cat.getTotalCats());
        newCat.meow();
        Dog newDog = new Dog("Bob", 15);
        System.out.println(newDog.name);
    }
}