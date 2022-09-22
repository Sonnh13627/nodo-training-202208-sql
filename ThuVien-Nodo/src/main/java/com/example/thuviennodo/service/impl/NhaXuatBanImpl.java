package com.example.thuviennodo.service.impl;

import com.example.thuviennodo.entities.NhaXuatBan;
import com.example.thuviennodo.repositories.NhaXuatBanRepository;
import com.example.thuviennodo.service.NhaXuatBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("nhaXuatBanService")
public class NhaXuatBanImpl implements NhaXuatBanService {
    @Autowired
    NhaXuatBanRepository nhaXuatBanRepository;

    @Override
    public List<NhaXuatBan> getAll() {
        return nhaXuatBanRepository.findAll();
    }

    @Override
    public NhaXuatBan getOne(Integer id) {
        return nhaXuatBanRepository.findById(id).get();
    }

    @Override
    public NhaXuatBan create(NhaXuatBan nhaXuatBan) {
        return nhaXuatBanRepository.save(nhaXuatBan);
    }

    @Override
    public NhaXuatBan update(NhaXuatBan nhaXuatBan) {
        return nhaXuatBanRepository.save(nhaXuatBan);
    }

    @Override
    public void delete(Integer id) {
        nhaXuatBanRepository.deleteById(id);
    }
}
