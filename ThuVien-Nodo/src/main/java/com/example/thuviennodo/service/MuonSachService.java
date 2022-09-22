package com.example.thuviennodo.service;

import com.example.thuviennodo.entities.MuonSach;

import java.util.List;

public interface MuonSachService {
    List<MuonSach> getAll();

    MuonSach getOne(Integer id);

    MuonSach create(MuonSach muonSach);

    MuonSach update(MuonSach muonSach);

    void delete(Integer id);
}
