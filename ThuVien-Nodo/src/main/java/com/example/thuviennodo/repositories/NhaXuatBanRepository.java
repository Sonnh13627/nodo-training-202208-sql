package com.example.thuviennodo.repositories;

import com.example.thuviennodo.entities.NhaXuatBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaXuatBanRepository extends JpaRepository<NhaXuatBan,Integer> {
}
