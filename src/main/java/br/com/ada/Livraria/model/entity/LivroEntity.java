package br.com.ada.Livraria.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "livro")
public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo", nullable = false, unique = true)
    private String titulo;
    @Column(name = "titulo", nullable = false)
    private String genero;

}
