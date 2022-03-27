public class KIA {
    private String name = "KIA";
    private String countryOfProduction = "Корея";
    private int year;

    public KIA(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Автомобиль " +
                  getName() + ", " + " год " + getYear() +
                ", " + getCountryOfProduction();

    }
}
