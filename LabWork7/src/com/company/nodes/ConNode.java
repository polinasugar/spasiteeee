package com.company.nodes;
import java.util.List;

public class ConNode implements AbstractNode{
    private final List<AbstractNode> nodes;

    public ConNode(List<AbstractNode> nodes){
        this.nodes = nodes;
    }

    public boolean calculate(){
        boolean result = nodes.get(0).calculate();
        for (int i = 1; i < nodes.size(); i++){
            if(!result){
                return result;
            }
            else{
                result &= nodes.get(i).calculate();
            }
        }
        return result;
    }

    public String toString(){
        String result = "( ";
        for (int i = 0; i < nodes.size(); i++){
            result += "& " + nodes.get(i) + " ";
        }
        result += " )";
        return result;
    }
}
