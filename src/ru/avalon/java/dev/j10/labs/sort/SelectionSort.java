package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка выбором (англ. selection sort).
 *тест
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */
public class SelectionSort implements Sort {

    public SelectionSort() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        
        System.out.print("Сортировка методом выбора: ");
        for (int i = 0 ; i < array.length - 1 ; i ++) {
            int least = i;
            for (int k = i +1 ; k < array.length ; k++){
                if (array[k] < array [least]){
                    least = k ;
                }
            }
             int tmp = array[i];
             array [i] = array [least];
             array [least] = tmp;
             System.out.print(array[i] + " ");
        }
        /*
         * TODO(Студент): Реализовать метод sort класса SelectionSort
         */
    }
}
