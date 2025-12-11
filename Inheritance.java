public class Inheritance {

    public static void main(String[] args) {
        Dog labo = new Dog();
        labo.eat();
        labo.color();
        labo.bark();

        // Dog labo1 = new Dog();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void bark() {
        System.out.println("bhu bhu");
    }
}

class Dog extends Animal{
    

    void color(){
        System.out.println("black");
    }
}