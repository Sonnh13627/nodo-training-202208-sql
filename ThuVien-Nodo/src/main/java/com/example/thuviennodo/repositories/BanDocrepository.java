package com.example.thuviennodo.repositories;

import com.example.thuviennodo.entities.BanDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanDocrepository extends JpaRepository<BanDoc, Integer> {
}
