package main.java.com.ersted_me.javapractice.module1_2;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {4,5,6,8};
        System.out.println(isDuplicate(array));
    }
    /*
        Дан массив целых чисел.
        Необходимо реализовать метод, которые определяет,
        содержит ли данный массив дубликаты
    */
    public static boolean isDuplicate(int[] array){
        HashSet<Integer> hs = new HashSet<>(array.length);
        for(int i = 0; i < array.length; i++){
            hs.add(array[i]);
        }
        return hs.size() != array.length;
    }
}
