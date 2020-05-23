package com.company.nodes;

public class NegativeNode implements AbstractNode{
    private final AbstractNode child;

    public NegativeNode(AbstractNode child){
        this.child = child;
    }

    public boolean calculate(){
        boolean result = child.calculate();
        return !result;
    }

    public String toString(){
        return "! " + child;
    }
}
