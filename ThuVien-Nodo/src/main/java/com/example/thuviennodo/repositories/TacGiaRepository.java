package com.example.thuviennodo.repositories;

import com.example.thuviennodo.entities.TacGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacGiaRepository extends JpaRepository<TacGia,Integer> {
}
