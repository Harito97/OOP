package oopprinciples.abstraction;

public class Test {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        //Đối tượng myPig là đối tượng chỉ 1 con lợn được kế thừa từ 1 lớp cha là Animal
        //Nhưng Animal là trừu tượng và không thể có đối tượng nào trong thực tế

        //Pig thì lại có đối tượng thực tế nên nó không là trừu tượng
        //Pig nhờ kế thừa lớp trừu tượng Animal nên có thể sử dụng (viết lại) phương thức animalSound()
        // vốn là 1 phương thức trừu tượng của Animal
        myPig.animalSound();

        //Pig sử dụng (không Override) lại phương thức sleep() của Animal
        myPig.sleep();
    }
}
