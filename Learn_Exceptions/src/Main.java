public class Main {
    public static void main (String[] args) {
        int array[] = {5, 48, 7, 16, 33};
        int c;
        String str = "Exception: ";

        try {
            c = array[array.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(str + e);
            c = array[array.length - 1];
            System.out.println("The last element is : " + c);
            System.out.println(" ");
        }

        Object[] catArray = new Cat[3];

        try {
            catArray[0] = "Barsik";
        } catch (ArrayStoreException e) {
            System.out.println(str + e);
            System.out.println("The wrong tipe of element.");
            System.out.println(" ");
        }

        int a = 0;
        int b = 49;
        int k = 0;

        try {
            c = b / a;
        } catch (ArithmeticException e) {
            System.out.println(str + e);
            System.out.println("Dividing by zero is not allowed.");
            System.out.println(" ");
        }

        catArray[0] = new Cat("Barsik", "Black and white");

        try{
            System.out.println((String) catArray[0]);
        } catch (ClassCastException e) {
            System.out.println(str  + "class Cat cannot be cast to class String");
        }
    }
}
