package com.batch1.factorypatternspringboot.shapes;


import com.batch1.factorypatternspringboot.modal.Shapetypes;
import org.springframework.stereotype.Service;

@Service("Square")
public class Square implements ShapeService<Shapetypes>{

    @Override
    public String drawShape(Shapetypes shapetypes) {
        return "A Square is drawn";
    }
}
