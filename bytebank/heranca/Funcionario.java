package bytebank.heranca;

//nao pode instanciar objetos dessa classe, pq é abstrata
public abstract class Funcionario {

  private String nome;
  private String cpf;
  private double salario;

  public Funcionario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }

  // metodo sem codigo, n ha implementaçao
  public abstract double getBonificacao();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

}
