public class ClassObjects{
    String nome;
    Integer idade;

    public ClassObjects(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    ClassObjects c1 = new ClassObjects("Tavares", 17);
    ClassObjects c2 = new ClassObjects("Gabriel", 17);
    
    public static void main(String[] args) {
        //A classe Objects consiste em métodos utilitários estáticos que operam em objetos
        //Essa classe foi inclusa na versão 1.7 do Java
    
    deepEquals(ClassObjects c1, ClassObjects c2);

    }
}