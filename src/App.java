import java.util.List;
import java.util.Set;

import collections.set.Sets;
import estructurs.node.Nodo;
import estructurs.node.trees.BinaryTree;
import estructurs.node.trees.Ejercicio1;
import estructurs.node.trees.Ejercicio2;
import estructurs.node.trees.Ejercicio3;
import estructurs.node.trees.Ejercicio4;
import estructurs.node.trees.IntTree;
import models.Contacto;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runBinaryTree();
        // System.out.println();
        // runEjercicios();
        runSets();
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

        System.out.println();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        List<List<Nodo<Integer>>> niveles = ejercicio3.listLevels(tree.getRoot());
        ejercicio3.printLevels(niveles);

        System.out.println();
        Ejercicio4 ejercicio4 = new Ejercicio4();
        BinaryTree<Integer> tree4 = new BinaryTree<>();
        int [] numeros4 = new int[] { 4, 2, 7, 1, 3, 8 };
        for (int numero : numeros4) {
            tree4.add(numero);
        }
        int profundidad = ejercicio4.maxDepth(tree4.getRoot());
        System.out.println(profundidad);
    }

    private static void runSets() {
        Sets sets = new Sets();

        //Implementacion -> HashSet hashcode
        System.out.println("* HashSet:");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size = " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        //Implementacion -> LinkedHashSet hashcode
        System.out.println("* LinkedHashSet:");
        Set<String> linkedHSet = sets.construirLinkedHashSet();
        System.out.println(linkedHSet);
        System.out.println("Size = " + linkedHSet.size());
        System.out.println(linkedHSet.contains("F"));

        //Implementacion -> TreeSet
        System.out.println("* TreeSet:");
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Size = " + treeSet.size());
        System.out.println(treeSet.contains("F"));

        //Implementacion -> Hash Contacto hashcode
        System.out.println("* Hash Contacto Set:");
        Set<Contacto> hCSet = sets.construirHashSetContacto();
        System.out.println(hCSet);
        System.out.println("Size = " + hCSet.size());

        //Implementacion -> Tree Contacto hashcode
        System.out.println("* Tree Contacto Set:");
        Set<Contacto> tCSet = sets.construirTreeSetContacto();
        System.out.println(tCSet);
        System.out.println("Size = " + tCSet.size());

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
