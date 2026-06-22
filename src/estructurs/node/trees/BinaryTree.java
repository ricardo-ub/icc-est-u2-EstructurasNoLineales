package estructurs.node.trees;

import estructurs.node.Nodo;

public class BinaryTree<T extends Comparable<T >> {
    private Nodo<T> root;
    private int peso;

    //Constructor
    public BinaryTree(){
        this.root = null;
        this.peso = 0;
    }

    public Nodo<T> getRoot() {
        return root;
    }

    public void setRoot(Nodo<T> root) {
        this.root = root;
    }

    public void setRoot (T value){
        Nodo<T> node = new Nodo<T>(value);
        this.root = node;
    }

    public void add(T value) {
        Nodo<T> node = new Nodo<T>(value);
        root = addRecursivo(root, node);
        peso++;
    }

    private Nodo<T> addRecursivo(Nodo<T> actual, Nodo<T> nodeInsertar) {
        if (actual == null)
            return nodeInsertar;

        //if (actual.getValue() > nodeInsertar.getValue()){
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0){
            //izq
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else{
            //der
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    //PreOrder
    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Nodo<T> actual) {
        if(actual == null)
            return;
        System.out.println(actual + ", ");
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    //PosOrder
    public void posOrden(){
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Nodo<T> actual) {
        if(actual == null)
            return;
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual +", ");
    }

    //InOrder
    public void inOrden(){
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Nodo<T> actual) {
        if(actual == null)
            return;
        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual + ", ");
        inOrdenRecursivo(actual.getRight());
    }
    
    //Altura
    public int getHeight(){
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Nodo<T> actual) {
        if (actual == null)
            return 0;   
        
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;
    }

    //Peso
    public int getWeight() {
           return peso;
    }

    private int getWeightRecursivo(Nodo<T> actual) {
        if (actual == null)
            return 0;   
        
        int weightLeft = getWeightRecursivo(actual.getLeft());
        int weightRight = getWeightRecursivo(actual.getRight());

        int peso = weightLeft + weightRight + 1;
        return peso + 1;
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

