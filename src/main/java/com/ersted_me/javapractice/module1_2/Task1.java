package main.java.com.ersted_me.javapractice.module1_2;

import java.util.HashMap;
public class Task1 {

    public static void main(String[] args) {
        int[] array = {3,8,15,17};
        int val = 23;
        int[] resultIndex = getIndexesOfSum(array, val);
    }

    /*
        Дан массив целых чисел. Необходимо реализовать метод,
        который возвращает индексы массива, значения которых
        в сумме дают число переданное в массив.

        Предполагается, что массив содержит только уникальные
        числа и всегда имеет искомые числа.Один и тот же элемент
        не может быть использован дважды.
    */

    public static int[] getIndexesOfSum(int[] array, int val){
        HashMap<Integer, Integer> hm = new HashMap<>(array.length);
        for(int i = 0; i < array.length; i++){
            hm.put(array[i], i);
        }

        for(int i = 0; i < hm.size(); i++){
            int resultVal = val - array[i];
            if(hm.containsKey(resultVal) && hm.get(resultVal) != i)
                return new int[]{i, hm.get(resultVal)};
        }

        return null;
    }
}
