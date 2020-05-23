package com.company;
import com.company.nodes.AbstractNode;
import com.company.nodes.DivisionNode;
import com.company.nodes.PlusNode;
import com.company.nodes.SimpleNode;

public class Main {

    public static void main(String[] args) {
        AbstractNode firstExpression = new PlusNode(new SimpleNode(5), new DivisionNode(new SimpleNode(0), new PlusNode(new SimpleNode(15), new SimpleNode(2))));
        AbstractNode secondExpression = new DivisionNode(new PlusNode(new SimpleNode(5), new SimpleNode(2)), new PlusNode(new SimpleNode(7), new SimpleNode(3)));

        System.out.format("First expression equals %f ", firstExpression.calculate());
        System.out.format("Second expression equals %f ", secondExpression.calculate());

        System.out.println();

        System.out.println(firstExpression.toString());
        System.out.println(secondExpression.toString());
    }
}
