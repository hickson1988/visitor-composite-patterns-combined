package treestructure;

import visitor.TreeVisitor;

public abstract class TreeComponent {
    
    public void add(TreeComponent treeComponent){
        throw new UnsupportedOperationException();
    }
    
    public void remove(TreeComponent treeComponent){
        throw new UnsupportedOperationException();
    }
    
    public TreeComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    
    public abstract String getName();
     
    public abstract void accept(TreeVisitor visitor);
}
