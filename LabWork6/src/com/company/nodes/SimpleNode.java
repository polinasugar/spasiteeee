package com.company.nodes;

public class SimpleNode implements AbstractNode{
    private final double value;
    public SimpleNode(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public double calculate(){
        return value;
    }

    public String toString(){
        return Double.toString(value);
    }
}
