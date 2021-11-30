package gurage_01;

public class CatalogEntry {
    private String name;
    private double cost;

    public CatalogEntry(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
