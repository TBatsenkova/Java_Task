public class Task <T extends Number> {
    private T[] objArray;

    public Task(T... objArray) {
        this.objArray = objArray;
    }

    public T[] getObjArray() {
        return objArray;
    }

    public void setObjArray(T[] objArray) {
        this.objArray = objArray;
    }

    public double getMassiveAverage() {
        double sum = 0;
        for (T array : objArray) {
             sum += array.doubleValue();
        }
        return sum / getObjArray().length;
    }

    public boolean isSameAvg(Task<?> arrayToCompare) {
        return Math.abs(getMassiveAverage() - arrayToCompare.getMassiveAverage()) < 0.0001;
    }

    public static void main(String[] args) {
        Task<?> array1 = new Task<>(-14, 5, -7.2, 18, 22, 25);
        System.out.println(array1.getMassiveAverage());

        Task<?> array2 = new Task<>(-14, 5.0, -7.2, 18, 22, 25);
        System.out.println(array2.getMassiveAverage());

        System.out.println("Средние равны? " + array1.isSameAvg(array2));
    }


}
