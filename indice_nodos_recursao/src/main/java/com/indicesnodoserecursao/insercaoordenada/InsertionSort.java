package com.indicesnodoserecursao.insercaoordenada;

public class InsertionSort {
    public static void insertionSort(char[] a) {
        int n = a.length;

        for(int i = 0; i < n; i++) {
            int j = i - 1;
            char current = a[i];

            while((j >= 0) && (a[j] > current)) {
                a[j+1] = a[j--];
            }
            a[j+1] = current;
        }
    }

    public static void main(String[] args) {
        char[] a = { 'd', 'a', 'c', 'b', 'e' };

        insertionSort(a);

        for (char c : a) {
            System.out.print(c + " ");
        }
    }
}
