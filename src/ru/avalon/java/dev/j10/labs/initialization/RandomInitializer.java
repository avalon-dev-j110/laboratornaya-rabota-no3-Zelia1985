package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *тест
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    
    int min ; 
    int max ; 

    public RandomInitializer(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
  
    
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {
      
        int diff = max;
        Random random = new Random();
        
        System.out.print("Массив случайных чисел ");
        
        for (int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(diff + 1);
            if (array[i]%2==0){
                array[i] = -array[i];
            }
            System.out.print(array[i] + " ");
            }
            
            
        }
        
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }

