package estructurs.node.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import estructurs.node.Nodo;

public class Ejercicio3 {
    
    public List <List<Nodo <Integer>>> listLevels (Nodo<Integer> root){
        List<List<Nodo<Integer>>> res = new LinkedList<>();

        if (root == null){
            return res;
        }

        Queue<Nodo<Integer>> cola = new LinkedList<>();
        cola.add(root);

        while(!cola.isEmpty()){
            int tamano = cola.size();
            List<Nodo<Integer>> nivel = new LinkedList<>();
            
            for (int i = 0; i < tamano; i++) {
                Nodo<Integer> actual = cola.poll();
                nivel.add(actual);

                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }
                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }
            res.add(nivel);
        }
        return res;
    }

    public void printLevels (List<List<Nodo<Integer>>> niveles){
        for (List<Nodo<Integer>> nivel : niveles) {
            for (Nodo<Integer> nodo : nivel) {
                System.out.print(nodo.getValue());
                if (nodo != nivel.get(nivel.size()-1)) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
}
