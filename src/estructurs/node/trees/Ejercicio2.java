package estructurs.node.trees;

import estructurs.node.Nodo;

public class Ejercicio2 {

	public void invertTree(Nodo<Integer> root) {
		System.out.println("Arbol original");
        printTree(root);
        invertirRecursivo(root);
        System.out.println("Arbol invertido");
        printTree(root);
	}

    private void invertirRecursivo(Nodo<Integer> actual) {
        if (actual == null){
            return;
        }
        System.out.println("actual "+ actual);
        invertirRecursivo(actual.getLeft());
        invertirRecursivo(actual.getRight());
    }

    public void printTree(Nodo<Integer> root){
        System.out.println("Imprimiendo el arbol: ");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Nodo<Integer> actual, int nivel){
        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }

        System.out.println(actual);
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    
    }
}
