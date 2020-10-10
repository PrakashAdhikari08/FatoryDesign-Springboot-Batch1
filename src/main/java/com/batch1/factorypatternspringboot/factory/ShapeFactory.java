package com.batch1.factorypatternspringboot.factory;

import com.batch1.factorypatternspringboot.modal.Shapetypes;
import com.batch1.factorypatternspringboot.shapes.ShapeService;

public interface ShapeFactory {

    public <T>ShapeService<T> getShapesImplementation(String shapeName);
}
