package com.indicesnodoserecursao.insercaoordenada;

public class InsertionSort {
    public static void insertionSort(char[] a) {
        int n = a.length;

        for(int i = 1; i < n; i++) {
            char current = a[i];
            int j = i - 1;

            while((j >= 0) && (a[j] > current)) {
                a[j + 1] = a[j--];
            }

            a[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        char[] a = {'d', 'a', 'c', 'b', 'e'};

        insertionSort(a);

        for(char c : a) {
            System.out.print(c + " ");
        }
    }
}
