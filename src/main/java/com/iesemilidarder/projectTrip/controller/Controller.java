package com.iesemilidarder.projectTrip.controller;

import com.iesemilidarder.projectTrip.data.Activity;
import com.iesemilidarder.projectTrip.data.Product;
import com.iesemilidarder.projectTrip.helper.DataHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class Controller {

    @RequestMapping("/getAllProducts") {-
    }
    //@RequestMapping("/getProductsTypes")

    //@RequestMapping("/getProduct/{id}")

    //@RequestMapping(method=POST)("/addProduct")
}


//- "/ getProductTypes" listando todo tipo de producto
//- "/ getProduct / {id}" listado de detalles de un producto
//- "/ addProduct" (POST) creando un nuevo producto