package com.arturheath;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumsTestParameterized {

    // Чтобы тестировать метода класса, нам нужен объект этого класса
    // Объявляем переменную типа этого класса
    private Nums num;

    // объявляем переменные для параметров теста

    // будет хранить вычитаемые числа
    private int numToTake;
    // будет хранить ожидаемый результат
    private int expectedRes;

    // конструктор тестового класса
    public NumsTestParameterized(int numToTake, int expectedRes){
        this.numToTake = numToTake;
        this.expectedRes = expectedRes;
    }

    // создать объект тестируемого класса перед началом тестов
    @org.junit.Before
    public void setUp(){
        num = new Nums(20);
    }

    // создать параметры для теста
    @Parameterized.Parameters
    public static Collection<Object[]> subtrTestCases(){
        return Arrays.asList(new Object[][]{

                // каждый массив этого двумерного массива - набор параметров для
                // конструктора тестового класса
                // [nunToTake, expectedRes]
                {2, 18},
                {5, 15},
                {19, 1}
        });
    }

    // тестовый метод. вызывается для каждого набора параметров
    @org.junit.Test
    public void differenceShouldBePositive() {
        assertEquals(expectedRes, num.subtrNums(numToTake));
    }
}
