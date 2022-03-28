//Программа выводит сообщения о названии Классов чисел
// и сами числа.

public class Task <T extends Number> {
    private T objectNum;

    public Task(T objectNum) {
        this.objectNum = objectNum;
    }

    public T getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(T objectNum) {
        this.objectNum = objectNum;
    }

    public void infoAboutClass() {
        System.out.println(getObjectNum().getClass().getName() + " " + getObjectNum());
    }

    public static void main(String[] args) {
        Task<?> num1 = new Task<>(15);
        num1.infoAboutClass();
        Task<?> num2 = new Task<>(15.02);
        num2.infoAboutClass();
        Task<?> num3 = new Task<>(15.65f);
        num3.infoAboutClass();
    }

}
