package visitor;

import treestructure.Node;
import treestructure.Leaf;

public class TreePrintVisitor implements TreeVisitor{

    @Override
    public void visit(Leaf menuItem) {
        System.out.println("Visiting leaf: "+menuItem.getName());
    }

    @Override
    public void visit(Node menu) {
         System.out.println("Visiting node: "+menu.getName());
    }
    
}
