package com.mycompany.trabalhorobson;

public class Funcionario {
  private String cod;
  private String cargo;
  private String nome;
  private String salario;

  public Funcionario(String cod, String cargo, String nome, String salario) {
    this.cod = cod;
    this.cargo = cargo;
    this.nome = nome.replace("-", " ");
    this.salario = salario;
  }

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSalario() {
    return salario;
  }

  public void setSalario(String salario) {
    this.salario = salario;
  }

  public void mostrarDados() {
    System.out.println("| Codigo: " + this.getCod());
    System.out.println("| Nome: " + this.getNome());
    System.out.println("| Cargo: " + this.getCargo());
    System.out.println("| Salario: " + this.getSalario());
    System.out.println("| -----------------------------------");
    System.out.println("|");
  }
}
