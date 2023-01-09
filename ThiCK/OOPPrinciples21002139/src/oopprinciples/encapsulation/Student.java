package oopprinciples.encapsulation;

public class Student {
    //private data member
    private String name;
    //Với việc đặt mức độ truy cập của thuộc tính name là private
    // ta đã đặt mức truy cập của nó chỉ khả thi trong class
    // Như vậy đã sử dụng nguyên lý đóng gói của OOP - giúp đóng gói dữ liệu, duy trì sự toàn vẹn của dữ liệu

    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
