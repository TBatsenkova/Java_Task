public class Camera {
    private String name = "Фотоаппарат";
    private String production;
    private String model;
    private int prise;

    public Camera(String production, String model, int prise) {
        this.production = production;
        this.model = model;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return  getName() +
                ", " + getProduction() +
                ", " + getModel() +
                ", цена " + getPrise();
    }
}
