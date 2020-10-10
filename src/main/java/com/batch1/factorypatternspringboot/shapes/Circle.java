package com.batch1.factorypatternspringboot.shapes;


import com.batch1.factorypatternspringboot.modal.Shapetypes;
import org.springframework.stereotype.Service;

@Service("Circle")
public class Circle implements ShapeService<Shapetypes> {


    @Override
    public String drawShape(Shapetypes shapetypes) {
        return "A circle is drawn";
    }
}
