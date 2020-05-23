package com.company.comparator;
import com.company.figure.Figure;
import java.util.Comparator;

public class FigureComparator implements Comparator<Figure> {
    public int compare(Figure firstFigure, Figure secondFigure){
        int result;
        if (firstFigure.getVolume() > secondFigure.getVolume()){
            result = 1;
        }
        else if(firstFigure.getVolume() < secondFigure.getVolume()){
            result = -1;
        }
        else{
            if(firstFigure.getA() > secondFigure.getA()){
                result = 1;
            }
            else if(firstFigure.getA() < secondFigure.getA()){
                result = -1;
            }
            else{
                if(firstFigure.getB() < secondFigure.getB()){
                    result = -1;
                }
                else{
                    result = 1;
                }
            }
        }
        return result;
    }
}
