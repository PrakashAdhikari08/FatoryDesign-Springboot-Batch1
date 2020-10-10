package com.batch1.factorypatternspringboot.controller;

import com.batch1.factorypatternspringboot.factory.ShapeFactory;
import com.batch1.factorypatternspringboot.modal.Shapetypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @Autowired
    private ShapeFactory shapeFactory;

    @GetMapping(value = "/shape/{name}")
    public String createShape(@PathVariable (value = "name") String shapeName){
        Shapetypes shapetypes = new Shapetypes();
        shapetypes.setArea("11");
        shapetypes.setName(shapeName);
        System.out.println(shapetypes.toString());
        return shapeFactory.getShapesImplementation(shapetypes.getName()).drawShape(shapetypes);
    }
}
