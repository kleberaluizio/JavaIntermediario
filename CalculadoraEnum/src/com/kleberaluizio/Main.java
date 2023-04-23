package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        double a = 15.0;
        double b = 3.0;
        
        for (Operacoes operacao : Operacoes.values()){
            double result = operacao.executarOperacao(a,b);
            System.out.println(operacao.name() +" = "+ a +" "+ operacao.toString() +" "+ b + " = "+ result);

        }
    }
}
