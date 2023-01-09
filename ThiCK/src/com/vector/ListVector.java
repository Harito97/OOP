package com.vector;

import java.util.LinkedList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new LinkedList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = data;
    }

    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        /* TODO */
        data.remove(index);
    }

    @Override
    public int length() {
        /* TODO */
        return data.size();
    }

    @Override
    public double magnitude() {
        /* TODO */
        double sumSquare = 0;
        for (int i = 0; i < length(); i ++){
            sumSquare += data.get(i) * data.get(i);
        }
        return Math.sqrt(sumSquare);
    }

    public double distanceTo(ListVector another) {
        /* TODO */
        int maxLength = Math.max(this.length(), another.length());
        double square = 0;
        for (int i = 0; i < maxLength; i++){
            square += (this.data.get(i) - another.data.get(i)) * (this.data.get(i) - another.data.get(i));
        }
        return Math.sqrt(square);
    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] array = new double[data.size()];
        int index = 0;
        for (double x : data){
            array[index] = x;
            index++;
        }
        return array;
    }

    public double element(int index) {
        /* TODO */
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        int minLength = Math.min(this.length(), another.length());
        for (int i = 0; i < minLength; i++){
            this.data.set(i, (this.data.get(i) - another.data.get(i)) );
        }
        return this;
    }

    public ListVector plus(ListVector another) {
        /* TODO */
        int minLength = Math.min(this.length(), another.length());
        for (int i = 0; i < minLength; i++){
            this.data.set(i, (this.data.get(i) + another.data.get(i)) );
        }
        return this;
    }

    public ListVector scale(double factor) {
        /* TODO */
        for (int i = 0; i < length(); i++){
            data.set(i, data.get(i) * factor);
        }
        return this;
    }

    public double dot(ListVector another) {
        /* TODO */
        return 0;
    }

    /*
     * Hàm trả ra format của com.vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        String result = "[" + this.data.get(0);
        for (int i = 1; i < length() - 1; i++){
            result += ", " + this.data.get(i);
        }
        result += ", " + this.data.get(length() - 1) + "]";
        return result;
    }
}
