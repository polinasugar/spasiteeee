package com.company.nodes;

public class PlusNode implements AbstractNode{
    private final AbstractNode left;
    private final AbstractNode right;

    public PlusNode(AbstractNode left, AbstractNode right){
        this.left = left;
        this.right = right;
    }

    public double calculate(){
        return left.calculate() + right.calculate();
    }

    public String toString(){
        return "( " + left + " + " + right + " )";
    }
}
