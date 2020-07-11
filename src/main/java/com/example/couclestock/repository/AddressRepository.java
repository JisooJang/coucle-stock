package com.example.couclestock.repository;

import com.example.couclestock.model.Address;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AddressRepository extends Neo4jRepository<Address, Long> {
}
