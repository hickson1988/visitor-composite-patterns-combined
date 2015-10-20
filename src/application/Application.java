package application;

import treestructure.*;
import visitor.TreePrintVisitor;

public class Application {

    public static void main(String[] args) {
        
        TreeComponent root=new Node("ROOT MENU");
        TreeComponent node1=new Node("NODE 1");
        TreeComponent node2=new Node("NODE 2");
        TreeComponent node3=new Node("NODE 3");
        
        TreeComponent leaf1=new Leaf("LEAF 1");
        TreeComponent leaf2=new Leaf("LEAF 2");
        TreeComponent leaf3=new Leaf("LEAF 3");
        TreeComponent leaf4=new Leaf("LEAF 4");
        TreeComponent leaf5=new Leaf("LEAF 5");
        
        root.add(node1);
        root.add(node2);

        node1.add(leaf1);
        node1.add(leaf2);
        node2.add(node3);
        node3.add(leaf3);
        node3.add(leaf4);
        node2.add(leaf5);
        
        root.accept(new TreePrintVisitor());
    }
}
