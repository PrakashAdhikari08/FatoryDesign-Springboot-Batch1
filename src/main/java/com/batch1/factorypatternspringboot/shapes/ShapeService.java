package com.batch1.factorypatternspringboot.shapes;


import com.batch1.factorypatternspringboot.modal.Shapetypes;

public interface ShapeService<T> {

    String drawShape(T request);

}
