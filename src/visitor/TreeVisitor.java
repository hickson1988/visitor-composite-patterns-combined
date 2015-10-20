package visitor;

import treestructure.*;

public interface TreeVisitor {
    void visit(Leaf wheel);
    void visit(Node engine);
}
