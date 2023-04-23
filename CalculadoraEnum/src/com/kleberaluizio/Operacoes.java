package com.kleberaluizio;

public enum Operacoes {
    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return (x + y);
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return (x - y);
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return (x * y);
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return (x / y);
        }
    };

    private String simbolo;

    Operacoes (String simbolo){
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return this.simbolo;
    }

    public abstract double executarOperacao(double x, double y);
}
