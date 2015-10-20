package visitor;

import treestructure.Node;
import treestructure.Leaf;

public class TreePrintVisitor implements TreeVisitor{

    @Override
    public void visit(Leaf leaf) {
        System.out.println("Visiting leaf: "+leaf.getName());
    }

    @Override
    public void visit(Node node) {
        System.out.println("Visiting node: "+node.getName());
    }
    
}
