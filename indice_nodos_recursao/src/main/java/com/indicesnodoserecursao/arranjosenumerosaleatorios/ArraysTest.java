package com.indicesnodoserecursao.arranjosenumerosaleatorios;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
    public static void main(String[] args) {
        int num[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }

        int old[] = (int[]) num.clone();
        System.out.println("Array antes de ser ordenado: " + Arrays.equals(num, old));

        Arrays.sort(num);
        System.out.println("Array depois de ser ordenado: " + Arrays.toString(num));
        System.out.println("Array original: " + Arrays.toString(old));
    }
}
