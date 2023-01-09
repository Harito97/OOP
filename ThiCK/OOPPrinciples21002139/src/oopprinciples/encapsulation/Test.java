package oopprinciples.encapsulation;

class Test {
    public static void main(String[] args) {
        //creating instance of the encapsulated class
        Student s = new Student();

        //Vì thuộc tính name là private (được đóng gói, phân hạn quyền truy cập)
        // - tức chỉ được truy cập trực tiếp trong class Student
        // - đối với class Test để cài đặt giá trị thuộc tính hay lấy ra giá trị thuộc tính
        // thì cần sử dụng các API cụ thể là setters, getters
        //setting value in the name member
        s.setName("Hải");
        //getting value of the name member
        System.out.println(s.getName());
    }
}