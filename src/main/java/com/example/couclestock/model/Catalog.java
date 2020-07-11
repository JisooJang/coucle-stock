package com.example.couclestock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity
public class Catalog {
    @Id
    @GeneratedValue
    private Long id;

    @Relationship(type = "HAS_PRODUCT", direction = Relationship.OUTGOING)
    private Set<Product> products = new HashSet<>();

    private String name;

    @Builder
    public Catalog(String name, Collection<Product> products) {
        this.name = name;
        this.products.addAll(products);
    }

}
