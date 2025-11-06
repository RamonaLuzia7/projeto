 package br.com.senai.backend.estoque.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "nota_compra")
public class Nota_compra{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "valor_total")
    private double valor_total;

    @ManyToMany
    @JoinTable(
        name = "material_nota_compra", 
        joinColumns = @JoinColumn(name = "id_nota_compra",referencedColumnName = "Id"),
        inverseJoinColumns = @JoinColumn(name = "id_material",referencedColumnName = "id")
    ) 
    private List<Material> materiais;

    public Nota_compra() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
}




