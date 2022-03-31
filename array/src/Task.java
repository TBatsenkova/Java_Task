import java.util.Arrays;

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

    public   void  swap( int firstIndex, int secondIndex) {
        T tmp;
        //for (T array : objArray) {
            for (int i = 0; i < objArray.length; i++) {
            tmp = objArray[firstIndex];
            objArray[firstIndex] = objArray[secondIndex];
            objArray[secondIndex] = tmp;
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(objArray);
    }

    public static void main(String[] args) {
            Task<?> array1 = new Task<>(-14, 5, -7.2, 18, 22, 25);
            //System.out.println(array1.toString());
            swap( , 2, 5);
            System.out.println(array1.toString());

            //Task<?> array2 = new Task<>(-14, 5.0, -7.2, 18, 22, 25);
           // array2.swap(0,3);

        }


    }

