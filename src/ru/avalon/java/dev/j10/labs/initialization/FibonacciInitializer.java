package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Класс, выполняющий инициализацию массива числе,
 * значениями последовательности Фибоначчи.
 *тест
 * <p>Чи́сла Фибона́ччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21 …
 * (последовательность A000045 в OEIS), в которой первые два
 * числа равны либо 1 и 1, либо 0 и 1, а каждое последующее
 * число равно сумме двух предыдущих чисел.
 *
 * <p>Экземпляры класса можно использовать повторно для
 * инициализации любого числа массивов. При инициализации
 * нового массива, последовательность начинается с начала.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class FibonacciInitializer implements Initializer {
  

    public FibonacciInitializer() {
       
    }
    
    

    /**
     * Выполняет инициализацию массива значениями
     * последовательности Фибоначчи.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {

        for (int i = 0 ; i < array.length ; i++){
            if ( i < 2 ){
                array[i]=1;
            }
            else{
                array[i] = array[i-2] + array [i-1];
            }
            System.out.print(array[i] + " ");
            
        }
        /*
         * TODO(Студент): Реализовать метод initialize класса FibonacciInitializer
         */
    }
}
