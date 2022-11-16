package main;

import stack.Stack;

public class mainProg {

    public static void main(String[] args) {
        Stack pilha = new Stack();
        
        pilha.push(10);
        pilha.push(15);
        pilha.push(25);
        
        System.out.println("Tam. pilha: " + pilha.getStackSize());
        
        while(pilha.getStackSize() > 0)
            System.out.println("el topo: " + pilha.pop());
    }

}
