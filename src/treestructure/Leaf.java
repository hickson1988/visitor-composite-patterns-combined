package treestructure;

import visitor.*;

public class Leaf extends TreeComponent{
    String name;
    
    public Leaf(String name){
        this.name=name;
    }
    
    @Override
    public String getName(){
         return this.name;
    }
    
    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visit(this);
    }
}
