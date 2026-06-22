import estructurs.node.Nodo;
import estructurs.node.trees.BinaryTree;
import estructurs.node.trees.Ejercicio1;
import estructurs.node.trees.Ejercicio2;
import estructurs.node.trees.IntTree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
        System.out.println();
        runEjercicios();
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int [] numeros = new int[] { 5, 3, 7, 2, 4, 6,8 };
        ejercicio1.insert(numeros);

        System.out.println();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int [] numeros2 = new int[] {5, 3, 7, 2, 4, 6,8};
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros2)
            tree.add(numero);
        Nodo<Integer> root = tree.getRoot();
        ejercicio2.invertTree(root);
    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
        
        //P A L M
        //A M L P
    }

    private static void runIntTree() {
       IntTree arbolNumeroIntTree = new IntTree();
       arbolNumeroIntTree.add(50);
       arbolNumeroIntTree.add(30);
       arbolNumeroIntTree.add(10);
       arbolNumeroIntTree.add(60);
       arbolNumeroIntTree.add(75);
       arbolNumeroIntTree.add(55);

       System.out.println("PreOrder:");
       arbolNumeroIntTree.preOrden();
       System.out.println("PosOrder:");
       arbolNumeroIntTree.posOrden();
       System.out.println("InOrder:");
       arbolNumeroIntTree.inOrden();

       System.out.println("Altura:");
       int alturaArbol = arbolNumeroIntTree.getHeight();
       System.out.println(alturaArbol);

       System.out.println("Peso:");
       int pesoArbol = arbolNumeroIntTree.getWeight();
       System.out.println(pesoArbol);
       
       //Nodo<Integer> node1 = new Nodo(50);
       //Nodo<Integer> node2 = new Nodo(10);
       //Nodo<Integer> node3 = new Nodo(30);

       //Raiz del arbol sea nodo1
       
       //node1.setRight(node2);
       //node2.setLeft(node3);

       //System.out.println(arbolNumeroIntTree.getRoot());
       //System.out.println(arbolNumeroIntTree.getRoot().getLeft().getRight());

       
    }
}
