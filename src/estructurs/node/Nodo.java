package estructurs.node;

public class Nodo <T>{
    private T value;
    private Nodo<T> left;
    private Nodo<T> right; 

    //creo un nodo
    //instancio el node --> constructor
    //tiene que crearse con el valor
    public Nodo(T value){
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getLeft() {
        return left;
    }

    public void setLeft(Nodo<T> left) {
        this.left = left;
    }

    public Nodo<T> getRight() {
        return right;
    }

    public void setRight(Nodo<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Nodo [value=" + value + "]";
    }

    
}
