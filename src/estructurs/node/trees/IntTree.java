package estructurs.node.trees;

import estructurs.node.Nodo;

//Clase de arbol solo de enteros
public class IntTree {
    
    private Nodo<Integer> root;
    private int peso;

    //Constructor
    public IntTree(){
        this.root = null;
        this.peso = 0;
    }

    public Nodo<Integer> getRoot() {
        return root;
    }

    public void setRoot(Nodo<Integer> root) {
        this.root = root;
    }

    public void setRoot (int value){
        Nodo<Integer> node = new Nodo<Integer>(value);
        this.root = node;
    }

    public void add(int value) {
        Nodo<Integer> node = new Nodo<Integer>(value);
        root = addRecursivo(root, node);
        peso++;
    }

    private Nodo<Integer> addRecursivo(Nodo<Integer> actual, Nodo<Integer> nodeInsertar) {
        if (actual == null)
            return nodeInsertar;

        if (actual.getValue() > nodeInsertar.getValue()){
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

    private void preOrdenRecursivo(Nodo<Integer> actual) {
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

    private void posOrdenRecursivo(Nodo<Integer> actual) {
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

    private void inOrdenRecursivo(Nodo<Integer> actual) {
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

    private int getHeightRecursivo(Nodo<Integer> actual) {
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

    private int getWeightRecursivo(Nodo<Integer> actual) {
        if (actual == null)
            return 0;   
        
        int weightLeft = getWeightRecursivo(actual.getLeft());
        int weightRight = getWeightRecursivo(actual.getRight());

        int peso = weightLeft + weightRight + 1;
        return peso + 1;
    }
}
