public class Formulario {

    enum Genero {
        FEMININO ('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }

        public char getValor(){
            return valor;
        }
    }

    private String nome;
    private Genero genero;

    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }
}

