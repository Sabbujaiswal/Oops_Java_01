public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "leo";
        Dog d2 = new Dog();
        d2.name = "neck";
        d1.bark();
        d2.walk();
    }

}
//Class is a blueprint of object which define some properties and behaviors.
// A class is a logical entity where a object has a physical entity
//A class is a way to arrange the data and behavior information.it is template that must be implemented by its objects
class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " is barking");
    }

    void walk() {
        System.out.println(name + " is walking");
    }
}