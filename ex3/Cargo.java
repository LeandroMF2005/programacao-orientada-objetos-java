package ex3;

public class Cargo {

    /*
    public String titulo;
    public double salario;

    // Construtor para facilitar a criação de objetos
    public Cargo(String titulo, double salario) {
        this.titulo = titulo;
        this.salario = salario;
    }*/

    // classe poderia ter sido feita da seguinte forma, utilizando métodos get e set separados, e variáveis do tipo private:

    private String titulo;
    private double salario;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }
    public double getSalario() {
        return salario;
    }
}
