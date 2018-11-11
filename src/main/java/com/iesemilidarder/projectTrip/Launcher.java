package com.iesemilidarder.projectTrip;

import com.iesemilidarder.projectTrip.data.Product;
import com.iesemilidarder.projectTrip.helper.DataHelper;

import java.util.List;

public class Launcher {

    public static void main(String... args) {
        DataHelper helper = new DataHelper();
        List<Product> aux = helper.getServerData();
        System.out.println("yuhu:" + aux.size());
    }

}
