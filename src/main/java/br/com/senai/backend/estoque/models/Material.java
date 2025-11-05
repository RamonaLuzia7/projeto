package br.com.senai.backend.estoque.models;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
@Table(name="material")
public class Material {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private  Integer id;

 @Column(name="nome")
 private  String nome;
  
 @Column(name="marca")
  private  String marca; 
  
  @Column(name="ano_fabricacao")
 private LocalDate ano_fabricacao;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public LocalDate getAno_fabricacao() {
    return ano_fabricacao;
  }

  public void setAno_fabricacao(LocalDate ano_fabricacao) {
    this.ano_fabricacao = ano_fabricacao;
  }

  public Material() {
  }

  public Material(Integer id, String nome, String marca, LocalDate ano_fabricacao) {
    this.id = id;
    this.nome = nome;
    this.marca = marca;
    this.ano_fabricacao = ano_fabricacao;
  }

}
