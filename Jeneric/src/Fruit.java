abstract class Fruit {
    //private float weight;
    private int quantity;

    public Fruit(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract float getWeight();
}
