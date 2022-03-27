public class Goods <T> {
    private T goods;

    public Goods(T goods) {
        this.goods = goods;
    }

    public T getGoods() {
        return goods;
    }

    public void setGoods(T goods) {
        this.goods = goods;
    }

    public static void main(String[] args) {
        Goods<Phone> phoneGoods = new Goods<>(new Phone("Sumsung", "15gt", 54600));
        Goods<Camera> cameraGoods = new Goods<>(new Camera("Canon", "V303", 155800));
        System.out.println(phoneGoods.goods.toString());
        System.out.println(cameraGoods.goods.toString());



    }
}
