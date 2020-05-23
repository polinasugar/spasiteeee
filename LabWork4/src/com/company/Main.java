package com.company;
import com.company.comparator.FigureComparator;
import com.company.figure.Figure;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    Random random = new Random();
        FigureComparator figureComparator = new FigureComparator();
	    ArrayList<Figure> figureList = new ArrayList<Figure>();
	    System.out.print("Input number of figures ");
	    int number = input.nextInt();
	    for (int i = 0; i < number; i++){
            int a = random.nextInt(10) + 10;
            int b = random.nextInt(10) + 10;
            int c = random.nextInt(10) + 150;
            Figure figure = new Figure(a, b, c);
            figureList.add(figure);
        }
	    figureList.sort(figureComparator);
	    for(Figure figure:figureList){
	        System.out.println(figure.toString());
        }
    }
}
