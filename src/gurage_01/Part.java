package gurage_01;

public class Part extends Component{
    private CatalogEntry ce;

    public Part(CatalogEntry ce) {
        this.ce = ce;
    }

    @Override
    public double getCost() {
        return this.ce.getCost();
    }
}
