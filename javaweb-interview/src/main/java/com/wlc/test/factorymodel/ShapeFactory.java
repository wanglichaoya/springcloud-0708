package com.wlc.test.factorymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description: Shape 的工厂类
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(null == shapeType){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
           return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }

    public static Object getClass(Class<? extends Shape> clazz){
       Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
