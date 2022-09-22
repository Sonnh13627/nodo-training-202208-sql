package com.example.thuviennodo.repositories;

import com.example.thuviennodo.entities.MuonSach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuonSachRepository extends JpaRepository<MuonSach,Integer> {

}
