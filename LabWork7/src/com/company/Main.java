package com.company;


import com.company.nodes.AbstractNode;
import com.company.nodes.ConNode;
import com.company.nodes.NegativeNode;
import com.company.nodes.SimpleNode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstractNode> firstList = new ArrayList<AbstractNode>();
        firstList.add(new SimpleNode(true));
        firstList.add(new NegativeNode(new SimpleNode(false)));
        firstList.add(new NegativeNode(new SimpleNode(true)));
        ConNode first = new ConNode(firstList);
        List<AbstractNode> secondList = new ArrayList<AbstractNode>();
        secondList.add(new NegativeNode(new SimpleNode(true)));
        secondList.add(new NegativeNode(new SimpleNode(false)));
        NegativeNode second = new NegativeNode(new ConNode(secondList));

        System.out.println(first.calculate());
        System.out.println(first.toString());
        System.out.println(second.calculate());
        System.out.println(second.toString());

    }
}
