public class Main {

    public static void main(String[] args) throws MyArraySizeException {

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
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "1", "1"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] strArray4 = {
                {"1", "2", " ", "4"},
                {"1", "2", "3", "4"},
                {"1", "8", "3", "4"},
                {"1", "2", "3", "4"}
        };

            arrSum(strArray1);
            arrSum(strArray2);
            arrSum(strArray3);
            arrSum(strArray4);

    }

    public static void arrSum(String[][] strArray) {
        int sum = 0;

        try {
            if (strArray.length != 4)
                throw new MyArraySizeException("Количество строк не равно 4");
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].length != 4 )
                    throw new MyArraySizeException("Количество столбцов не равно 4");
                for (int j = 0; j < strArray[i].length; j++) {
                    if (! strArray[i][j].matches("[0-9]+")) {
                        throw new MyArrayDataException(String.format("Неверное значение '%s' в ячейке [%d, %d]", strArray[i][j], i, j));
                    }
                    sum += Integer.parseInt(strArray[i][j]);
                }
            }
            System.out.println("Сумма всех элементов массива: " + sum);

        } catch (MyArraySizeException e) {
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }
}
