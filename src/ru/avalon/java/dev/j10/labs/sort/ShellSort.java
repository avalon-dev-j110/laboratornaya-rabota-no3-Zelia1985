package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *тест
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        System.out.print("Сортировка методом Шелла: ");
        for(int step = array.length/2; step > 0 ; step /=2){
            for (int i = step ; i < array.length;i++ ){
                for (int k = i - array.length; k >= 0 && array[k]>array [k + step] ; k -= step) {
                    int tmp = array [k];
                    array [k] = array [k + step];
                    array [k + step] = tmp;
                }
          System.out.print(array[i] + " ");  
        }
            
        }
        
       
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
    }
}
