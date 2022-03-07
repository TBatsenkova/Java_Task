1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа), надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
*************************************************************************************
Обработка исключения в main() не позволяет поймать несколько исключений в одном массиве, но удовлетворяет условию задачи. Чтобы пройти массив до конца, целесообразнее обработать исключение в самом методе, до выхода из массива:


   
   public static void arrSum(String[][] strArray) {
   
        int sum = 0;

        try {
            if (strArray.length != 4) {
                throw new MyArraySizeException("Количество строк не равно 4");
            }
            for (String[] array : strArray) {
                if (array.length != 4) {
                    throw new MyArraySizeException("Количество столбцов не равно 4");
                }
            }
        } catch (MyArraySizeException e) {
            System.out.println(e);
        }

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                try {
                    if (!strArray[i][j].matches("[0-9]+")) {
                        throw new MyArrayDataException(String.format("Неверное значение '%s' в ячейке [%d, %d]", strArray[i][j], i, j));
                    }
                    sum += Integer.parseInt(strArray[i][j]);
                } catch (MyArrayDataException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
