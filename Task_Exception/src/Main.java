public class Main {

    public static void main(String[] args)  {

        String[][] strArray1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] strArray2 = {
                {"1", "5", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] strArray3 = {
                {"a", "2", "3", "4"},
                {"1", "2", "4"},
                {"1", "2", "1", "1"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] strArray4 = {
                {"1", "2", " ", "4"},
                {"a", "2", "3", "4"},
                {"1", "8", "3", "4"},
                {"1", "2", "3", "4"}
        };

        arrSum(strArray1);
            System.out.println("");
        arrSum(strArray2);
            System.out.println("");
        arrSum(strArray3);
            System.out.println("");
        arrSum(strArray4);

    }

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
        System.out.println("Сумма всех элементов: " + sum);
    }
}
