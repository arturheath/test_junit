package com.arturheath;

public class Nums {
    private int num;

    public Nums(int num){
        this.num = num;
    }

    public int sumNums(int n){
        return num + n;
    }

    public int subtrNums(int n){
        int result = num - n;
        if (result < 0){
            throw new IllegalArgumentException();
        }
        return result;
    }
}
