public class Inheritance {

    public static void main(String[] args) {
        Dog labo = new Dog();
        labo.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void bark() {
        System.out.println("barks");
    }
}

class Dog extends Animal{
    

    void color(){
        System.out.println("black");
    }
}