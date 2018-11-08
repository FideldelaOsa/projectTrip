package com.iesemilidarder.projectTrip.helper;

import com.iesemilidarder.projectTrip.data.Activity;
import com.iesemilidarder.projectTrip.data.Flight;
import com.iesemilidarder.projectTrip.data.Product;
import com.iesemilidarder.projectTrip.data.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    private static List<Product> Productos = new ArrayList<>();

    public DataHelper() {
        //DataHelper data = new DataHelper()
        if (Productos.isEmpty()) {
            generateData();
        }
    }

    /**
     * lazy init
     */
    private void generateData() {
        Double numElems = new Double(Math.random() * 100);
        for (int i = 0; i < numElems.intValue(); i++) {
            Product a;
            if (i % 3 == 1) {
                a = new Activity();

            } else if (i % 3 == 2) {
                a = new Flight();
            } else {
                a = new Restaurant();
            }
            a.setName("item "+i);
            Productos.add(a);
        }
    }

    public List<Product> getServerData() {
        return Productos;
    }

    public void setServerData(List<Product> serverData) {
        DataHelper.Productos = serverData;
    }
}
