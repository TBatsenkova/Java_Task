public class BMW extends Car{
    private int cost;

    public BMW(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
