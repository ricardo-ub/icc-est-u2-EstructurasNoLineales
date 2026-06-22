package estructurs.node.trees;

import estructurs.node.Nodo;

public class Ejercicio1 {

    public void insert(int[] numeros){
        //crear el arbol de enteros
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //insertar cada numero
        for (int numero : numeros) {
            tree.add(numero);
        }
        
        //imprimir el arbol
        tree.printTree(tree.getRoot());
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
