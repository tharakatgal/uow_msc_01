package gurage_01;

import java.util.ArrayList;

public class Assembly extends Component{
    private ArrayList<Component> list;

    public Assembly(ArrayList<Component> list) {
        this.list = list;
    }

    @Override
    public double getCost() {
        double total=0.0;
        for (Component c:list){
            total = total + c.getCost();
        }
        return total;
    }

    public void add(Component c){
        this.list.add(c);
    }
}
