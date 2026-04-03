package com.indicesnodoserecursao.arranjosenumerosaleatorios;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100); // Gerar números aleatórios entre 0 e 99
        }

        int[] old = (int[]) num.clone(); // Clonar o array para comparação

        System.out.println("Igualdade de arrays: " + Arrays.equals(num, old)); // Verificar se os arrays são iguais

        Arrays.sort(num);

        System.out.println("Igualdade de arrays após ordenação: " + Arrays.equals(num, old)); // Verificar se os arrays são iguais após ordenação
        System.out.println("Array original (clonado): " + Arrays.toString(old));
        System.out.println("Array ordenado: " + Arrays.toString(num));
    }
}
