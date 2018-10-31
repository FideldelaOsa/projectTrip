package com.iesemilidarder.projectTrip.controller;

import com.iesemilidarder.projectTrip.data.Product;
import com.iesemilidarder.projectTrip.helper.DataHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/getAllProducts")
    public List<Product> getProducts(){
        List<Product> items = DataHelper.getServerData();
        return items;

}
