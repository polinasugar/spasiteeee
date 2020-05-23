package com.company.nodes;

public class DivisionNode implements  AbstractNode{
    private final AbstractNode left;
    private  final AbstractNode right;

    public DivisionNode(AbstractNode left, AbstractNode right){
        this.left = left;
        this.right = right;
    }

    public double calculate(){
        double result;
        if(left.calculate() == 0){
            result = 0;
        }
        else{
            result = left.calculate() / right.calculate();
        }
        return result;
    }

    public String toString(){
        return "( " + left + " / " + right + " )";
    }
}
