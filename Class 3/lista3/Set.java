package lista3;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> exe1 = new HashSet<String>();

        //1 - add(): Adiciona um elemento ao fim da lista
        //2 - remove(): Remove um elemento especificado nos parênteses
        //3 - contains(): Retorna verdadeiro caso haja o elemento na lista
        //4 - size(): Retorna o número de elementos de uma lista
        //5 - clear(): Remove todos os elementos de uma lista

        exe1.add("Tavares");
        exe1.remove("Tavares");
        exe1.contains("Tavares");
        exe1.size();
        exe1.clear();
    }
}