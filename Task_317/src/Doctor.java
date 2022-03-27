public class Doctor {
    private String name = "Доктор";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " лечит");
    }
}
