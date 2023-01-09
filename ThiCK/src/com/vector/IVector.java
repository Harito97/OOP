package com.vector;

public interface IVector {
    /*
    * Hàm tính độ dài của com.vector.
    */
    int length();

    /*
    * Hàm tính chuẩn Euclid của com.vector.
    */
    double magnitude();

    /*
    * Hàm trả về các phần tử của com.vector.
    */
    double[] elements();

    /*
    * Hàm trả về phần tử của com.vector ở vị trí thứ index.
    */
    double element(int index);

    /*
    * Hàm thêm vào cuối com.vector một phần tử có giá trị value.
    */
    void append(double value);

    /*
    * Hàm chèn vào vị trí index của com.vector một phần tử có giá trị value.
    */
    void insert(double value, int index);

    /*
    * Hàm xóa một phần tử của com.vector ở vị trí index.
    */
    void remove(int index);
}
