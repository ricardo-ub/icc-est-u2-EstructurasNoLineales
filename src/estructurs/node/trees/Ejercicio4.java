package estructurs.node.trees;

import estructurs.node.Nodo;

public class Ejercicio4 {
    public int maxDepth(Nodo root){
        if (root==null) {
            return 0;
        }

        int profunIzq = maxDepth(root.getLeft());
        int rightDer = maxDepth(root.getRight());
        return Math.max(profunIzq, rightDer)+1;
    }
}
