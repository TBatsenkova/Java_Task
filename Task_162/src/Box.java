public class Box {
    int width;
    int height;
    int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void increase1(int width, int height, int length) {
        width = width * 2;
        height = height * 2;
        length = length * 2;
        System.out.println("By value: ");
    }

    public void increase2(Box box) {
        box.width = box.width * 2;
        box.length = box.length * 2;
        box.height = box.height * 2;
        System.out.println("By reference: ");
    }


    public String toString() {
        return "width=" + width +
                ", height=" + height +
                ", length=" + length;
    }
}
