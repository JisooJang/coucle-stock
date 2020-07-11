package com.example.couclestock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NodeEntity
public class Warehouse {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Relationship(type = "HAS_ADDRESS")
    private Address address;

    @Builder
    public Warehouse(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Warehouse(String name) {
        this.name = name;
    }
}
