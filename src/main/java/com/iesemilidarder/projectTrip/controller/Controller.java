package com.iesemilidarder.projectTrip.controller;

import com.iesemilidarder.projectTrip.data.Product;
import com.iesemilidarder.projectTrip.helper.DataHelper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    @RequestMapping("/getAllProducts")
    public List<Product> getALLProducts() {
        DataHelper items = new DataHelper();
        return items.getProducts();
    }
    //@RequestMapping("/getProductsTypes")

    @RequestMapping(value = "/getProduct/{id}")
    public List<Product> getProduct(@RequestParam String id ){
        DataHelper items =new DataHelper();
        return items.getServerData();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product){
        DataHelper items =new DataHelper();
         items.setServerData((List<Product>) items);
    }
}


//- "/ getProductTypes" listando todo tipo de producto
