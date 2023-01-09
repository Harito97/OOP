package oopprinciples.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object

        //Có thể thấy cùng 1 phương thức nhưng mỗi đối tượng lại cho ra những hành động khác nhau
        // Đó chính là 1 ví dụ về tính đa hình trong OOP
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
