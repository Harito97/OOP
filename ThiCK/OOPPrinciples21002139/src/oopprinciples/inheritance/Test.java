package oopprinciples.inheritance;

public class Test {
    public static void main(String[] args) {

        // create an object of the subclass
        // Như vậy đối tượng myDog được tạo là từ subclass Dog kế thừa từ superclass Animal
        Dog myDog = new Dog();

        // access field of superclass
        // myDog có thể truy cập vào thuộc tính của lớp superclass là Animal
        myDog.name = "Rohu";
        myDog.display();

        // call method of superclass
        // using object of subclass
        // myDog cũng có thể truy cập vào phương thức của lớp superclass
        myDog.eat();

        // Nhờ đặc điểm nêu trên mà nguyên lý Kế thừa giúp tiết kiệm số dòng code,
        // đem đến sự tương thích của các lớp dữ liệu chung đặc điểm được mô tả ở class cha
    }
}
