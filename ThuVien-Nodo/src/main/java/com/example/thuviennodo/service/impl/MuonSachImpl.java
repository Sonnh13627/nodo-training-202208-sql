package com.example.thuviennodo.service.impl;

import com.example.thuviennodo.entities.MuonSach;
import com.example.thuviennodo.repositories.MuonSachRepository;
import com.example.thuviennodo.service.MuonSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("muonSachService")
public class MuonSachImpl implements MuonSachService {
    @Autowired
    MuonSachRepository muonSachRepository;

    @Override
    public List<MuonSach> getAll() {
        return muonSachRepository.findAll();
    }

    @Override
    public MuonSach getOne(Integer id) {
        return muonSachRepository.findById(id).get();
    }

    @Override
    public MuonSach create(MuonSach muonSach) {
        return muonSachRepository.save(muonSach);
    }

    @Override
    public MuonSach update(MuonSach muonSach) {
        return muonSachRepository.save(muonSach);
    }

    @Override
    public void delete(Integer id) {
        muonSachRepository.deleteById(id);
    }
}
