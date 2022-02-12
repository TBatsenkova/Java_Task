public class Address {
    String name;
    String town;
    String street;
    int houseNumber;
    int buildingNumber;
    int flatNumber;

    public Address(String name, String town, String street, int houseNumber, int buildingNumber, int flatNumber) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
    }

    public Address(String name, String town, String street, int houseNumber, int flatNumber) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public Address(String name, String town, String street, int houseNumber) {
        this.name = name;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return  name + ": " +
                town +
                ", street " + street +
                ", house " + houseNumber +
                ", building " + buildingNumber +
                ", flat " + flatNumber;
    }

}
