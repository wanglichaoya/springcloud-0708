package com.wlc.test.factorymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();


        Shape shape1 = (Shape) ShapeFactory.getClass(Circle.class);
        shape1.draw();

    }
}
