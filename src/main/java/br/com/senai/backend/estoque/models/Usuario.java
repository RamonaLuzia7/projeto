package br.com.senai.backend.estoque.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
    private Integer id;
   
    @Column(name="nome")
    private String nome;
    
    @Column(name="cargo")
    private String cargo; 
      
    @Column(name="data_nascimento")
    private LocalDate data_nascimento;
    
    @Column(name="cpf")
    private String cpf;


    @OneToMany(mappedBy = "usuario")
    private List<Material> materiais;
    
    public Usuario(){
    }

    public Usuario(Integer id, String nome, String cargo, LocalDate data_nascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
    }

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}