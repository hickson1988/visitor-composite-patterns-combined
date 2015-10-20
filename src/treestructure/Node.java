package treestructure;

import java.util.ArrayList;
import visitor.TreeVisitor;

public class Node extends TreeComponent{
    String name;
    ArrayList<TreeComponent> treeComponents=new ArrayList<>();
    
    public Node(String name){
        this.name=name;
    }

    @Override
    public String getName(){
         return this.name;
    }
    
    @Override
    public void add(TreeComponent treeComponent){
        treeComponents.add(treeComponent);
    }
    
    @Override
    public void remove(TreeComponent treeComponent){
        treeComponents.remove(treeComponent);
    }
    
    @Override
    public TreeComponent getChild(int i){
        return (TreeComponent)treeComponents.get(i);
    }
    
    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visit(this);
        for(TreeComponent treeComponent:treeComponents){
            treeComponent.accept(visitor);
        }
    }
}