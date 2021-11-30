package gurage_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CatalogEntry ce1 = new CatalogEntry("screw",0.02);
        CatalogEntry ce2 = new CatalogEntry("bolt", 0.01);
        CatalogEntry ce3 = new CatalogEntry("nut", 0.05);

        Part p1 = new Part(ce1);
        Part p2 = new Part(ce2);
        Part p3 = new Part(ce1);
        Part p4 = new Part(ce3);

        ArrayList<Component> list_p3_p4 = new ArrayList<>();
        list_p3_p4.add(p3);
        list_p3_p4.add(p4);
        Assembly a8 = new Assembly(list_p3_p4);

        ArrayList<Component> list_p1_p2_a8 = new ArrayList<>();
        list_p1_p2_a8.add(p1);
        list_p1_p2_a8.add(p2);
        list_p1_p2_a8.add(a8);
        Assembly a5 = new Assembly(list_p1_p2_a8);
        System.out.println(a5.getCost());


    }
}
