// abstract class Animal {
// protected String name;

// public Animal(String name) {
// this.name = name;
// }

// public abstract void makeSound();

// public static class Dog extends Animal {
// public Dog(String name) {
// super(name);
// }

// public String getName() {
// return name;
// }

// @Override
// public void makeSound() {
// System.out.println("Woof!");
// }
// }

// public static class Cat extends Animal {
// public Cat(String name) {
// super(name);
// }

// public String getName() {
// return name;
// }

// @Override
// public void makeSound() {
// System.out.println("Meow!");
// }
// }
// }

// class Main {
// public static void main(String[] args) {
// Animal dog = new Animal.Dog("Buddy");
// System.out.println("Dog's name: " + ((Animal.Dog) dog).getName());
// dog.makeSound(); // Output: Woof!

// Animal cat = new Animal.Cat("Whiskers");
// System.out.println("Cat's name: " + ((Animal.Cat) cat).getName());
// cat.makeSound(); // Output: Meow!
// }
// }
