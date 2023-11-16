package com.fragansias.company.models.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categoria implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long id;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    @Column(name = "genero")
    private String genero;
    @Column(name = "descripcion_categoria",nullable = false)
    private String descripcion;

    @OneToMany(
            mappedBy = "categoria",
            fetch = FetchType.LAZY
    )
    private Set<Producto> productos = new HashSet<>();

}
