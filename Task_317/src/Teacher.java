public class Teacher {
    private String name = "Учитель";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " учит");
    }
}
