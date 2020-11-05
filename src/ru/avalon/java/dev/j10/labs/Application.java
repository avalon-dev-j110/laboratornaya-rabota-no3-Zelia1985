package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[20];
    
        FibonacciInitializer fibonacci = new FibonacciInitializer();
        fibonacci.initialize(myArray);
        
        Application.SumMass(myArray);
        
        RandomInitializer random = new RandomInitializer();
        random.initialize(myArray);
        
        BubbleSort bubble = new BubbleSort();
        bubble.sort(myArray);
        
       System.out.println();
       random.initialize(myArray);
       SelectionSort selection = new SelectionSort();
       selection.sort(myArray);
       
       System.out.println();  
       random.initialize(myArray);
       ShellSort shellSort = new ShellSort();
       shellSort.sort(myArray);
        
        
//        

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
    
    public static void SumMass (int[] myArray){
        int SumMass = 0;
        for (int i = 0 ; i < myArray.length ; i++){
            SumMass += myArray[i];
        }
        System.out.println("Сумма элементов массива состоящего из чисел Фибоначчи: " + SumMass);
    }
    
}
