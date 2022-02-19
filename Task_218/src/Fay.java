public class Fay implements Faerie{
    private String name;
    private int magic;

    public Fay(String name, int magic) {
        this.name = name;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        magic = magic + 10;
        System.out.println("Fay " + getName() + " is dancing, " + "magic is " + magic);
    }

    @Override
    public void hug() {
        magic = magic + 10;
        System.out.println("Fay " + getName() + " is hagging, " + "magic is " + magic);
    }
}
