//Программа выводит средние числа двух массивов.
public class Task <T extends Number> {
    private T[] objectArray;

    public Task(T... objectArray) {
        this.objectArray = objectArray;
    }

    public T[] getObjectArray() {
        return objectArray;
    }

    public void setObjectArray(T[] objectArray) {
        this.objectArray = objectArray;
    }

    public double avrArray() {
        double sum = 0;
        for (T numArray : objectArray) {
            sum += numArray.doubleValue();
        }
        return sum / getObjectArray().length;
    }

    public static void main(String[] args) {
        Task<?> array1 = new Task<>(54, 8, 65, 2, -54);
        Task<?> array2 = new Task<>(1.2, 22.8, 15.2, 14.8, 5.9);
        System.out.println(array1.avrArray());
        System.out.println(array2.avrArray());
    }
}
