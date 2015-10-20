package visitor;

import treestructure.*;

public interface TreeVisitor {
    void visit(Leaf leaf);
    void visit(Node node);
}
