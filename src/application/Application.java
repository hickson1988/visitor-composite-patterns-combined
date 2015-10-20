package application;

import treestructure.*;
import visitor.TreePrintVisitor;

public class Application {

    public static void main(String[] args) {
        TreeComponent root=new Node("ROOT MENU");
        TreeComponent m1=new Node("MENU 1");
        TreeComponent m2=new Node("MENU 2");
        TreeComponent m11=new Node("MENU 1.1");
        
        TreeComponent mIt1=new Leaf("MENU ITEM 1");
        TreeComponent mIt2=new Leaf("MENU ITEM 2");
        TreeComponent mIt3=new Leaf("MENU ITEM 3");
        TreeComponent mIt4=new Leaf("MENU ITEM 4");
        TreeComponent mIt5=new Leaf("MENU ITEM 5");
        
        root.add(m1);
        root.add(m2);

        m1.add(mIt1);
        m1.add(mIt2);
        m2.add(m11);
        m11.add(mIt3);
        m11.add(mIt4);
        m2.add(mIt5);
        
        root.accept(new TreePrintVisitor());
    }
}
