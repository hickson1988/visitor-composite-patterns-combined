package treestructure;

import java.util.ArrayList;
import visitor.TreeVisitor;

public class Node extends TreeComponent{
    String name;
    ArrayList<TreeComponent> treeComponents=new ArrayList<TreeComponent>();
    
    public Node(String name){
        this.name=name;
    }
    
    @Override
    public String getName(){
         return this.name;
    }
    
    @Override
    public void add(TreeComponent menuComponent){
        treeComponents.add(menuComponent);
    }
    
    public void remove(TreeComponent menuComponent){
        treeComponents.remove(menuComponent);
    }
    
    public TreeComponent getChild(int i){
        return (TreeComponent)treeComponents.get(i);
    }
    
    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visit(this);
        for(TreeComponent menuComponent:treeComponents){
            menuComponent.accept(visitor);
        }
    }
}