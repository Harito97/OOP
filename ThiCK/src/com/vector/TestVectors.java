package com.vector;

public class TestVectors {
    public TestVectors() {
    }

    public static void main(String[] args) {
        /* TODO */
        IVector arrayVector = new ArrayVector();
        IVector listVector = new ListVector();

        //Test for arrayVector
        arrayVector.append(9);
        arrayVector.append(7);
        arrayVector.insert(90, 1);
        System.out.println(arrayVector.length());
        System.out.println(arrayVector.toString());
        System.out.println(arrayVector.magnitude());

        //Test for listVector
        listVector.append(4);
        listVector.append(6);
        listVector.insert(50, 1);
        System.out.println(listVector.length());
        System.out.println(listVector.toString());
        System.out.println(listVector.magnitude());
    }
}
