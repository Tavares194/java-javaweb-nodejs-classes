package lista3;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> exe1 = new ArrayList<String>();

        //1 - add(): Adiciona um elemento ao fim da lista e retorna true caso tenha conseguido adicionar, caso não, retorna false
        //2 - remove(): Remove um elemento de número especificado nos parênteses 
        //3 - get(): Pega um elemento de número especificado nos parênteses
        //4 - size(): Retorna o número de elementos de uma lista
        //5 - clear(): Remove todos os elementos de uma lista

        exe1.add("Tavares");
        exe1.remove(0);
        exe1.get(0);
        exe1.size();
        exe1.clear();
    }
}