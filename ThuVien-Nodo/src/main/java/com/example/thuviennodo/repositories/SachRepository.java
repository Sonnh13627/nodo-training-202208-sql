package com.example.thuviennodo.repositories;

import com.example.thuviennodo.entities.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SachRepository extends JpaRepository<Sach, Integer> {
}
