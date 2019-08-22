package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigures(){
        String wynik = "";
        for(Shape show :shapes) {
            wynik += show.getShapeName();
        }
        return wynik;
    }
    public int sizeFigures(){

        return shapes.size();
    }
}
