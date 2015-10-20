package treestructure;

import visitor.TreeVisitor;

public abstract class TreeComponent {
    public void add(TreeComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
     public String getName(){
         throw new UnsupportedOperationException();
    }
     
    public abstract void accept(TreeVisitor visitor);
}
