package com.vector;

import java.util.Arrays;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
         data = new double[1];
    }

    public ArrayVector(double[] coefficients) {
        /* TODO */
        this.data = coefficients;
    }

    /*
    * Hàm tăng số phần tử của mảng lên gấp đôi.
    * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
    * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
    * sau đó copy những phần tử của mảng cũ sang mảng mới.
    */
    private void extend() {
        /* TODO */
        double[] newArray = new double[data.length * 2];
        if (length >= 0) System.arraycopy(data, 0, newArray, 0, length);
        data = newArray;
    }

    /*
    * Hàm thêm một phần tử vào cuối com.vector.
    * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
    * thì cần phải cấp phát một mảng lớn hơn.
    */
    @Override
    public void append(double value) {
        /* TODO */
        if (length >= data.length){
            extend();
        }
        data[length] = value;
        length++;
    }

    /*
     * Hàm thêm một phần tử vào com.vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (length >= data.length){
            extend();
        }
        for (int i = length; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = value;
        length++;
    }

    /*
    * Hàm xóa một phần tử của com.vector ở vị trí index.
    */
    @Override
    public void remove(int index) {
        /* TODO */
        for (int i = index; i < length - 1; i++){
            data[i] = data[i + 1];
        }
        data[length - 1] = 0;
        length--;
    }

    @Override
    public int length() {
        /* TODO */
        return length;
    }

    @Override
    public double magnitude() {
        /* TODO */
        double sumSquare = 0;
        for (int i = 0; i < length(); i ++){
            sumSquare += data[i] * data[i];
        }
        return Math.sqrt(sumSquare);
    }

    public double distanceTo(ArrayVector another) {
        /* TODO */
        int maxLength = Math.max(this.length(), another.length());
        double square = 0;
        for (int i = 0; i < maxLength; i++){
            square += (this.data[i] - another.data[i]) * (this.data[i] - another.data[i]);
        }
        return Math.sqrt(square);
    }

    @Override
    public double[] elements() {
        /* TODO */
        return data;
    }

    @Override
    public double element(int index) {
        /* TODO */
        return data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        /* TODO */
        int minLength = Math.min(this.length(), another.length());
        for (int i = 0; i < minLength; i++){
            this.data[i] = (this.data[i] - another.data[i]);
        }
        return this;
    }

    public ArrayVector plus(ArrayVector another) {
        /* TODO */
        int minLength = Math.min(this.length(), another.length());
        for (int i = 0; i < minLength; i++){
            this.data[i] = (this.data[i] - another.data[i]);
        }
        return this;
    }

    public ArrayVector scale(double factor) {
        /* TODO */
        for (int i = 0; i < length(); i++){
            data[i] *= factor;
        }
        return this;
    }

    public double dot(ArrayVector another) {
        /* TODO */
        return 0;
    }

    /*
    * Hàm trả ra format của com.vector dạng: [a1, a2, ..., an].
    */
    @Override
    public String toString() {
        /* TODO */
        String result = "[" + this.data[0];
        for (int i = 1; i < length() - 1; i++){
            result += ", " + this.data[i];
        }
        result += ", " + this.data[length() - 1] + "]";
        return result;
    }
}
