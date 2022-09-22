package com.example.thuviennodo.service.impl;

import com.example.thuviennodo.entities.Sach;
import com.example.thuviennodo.entities.TacGia;
import com.example.thuviennodo.repositories.TacGiaRepository;
import com.example.thuviennodo.service.TacGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("tacGiaService")
public class TacGiaImpl implements TacGiaService {

    @Autowired
    TacGiaRepository tacGiaRepository;

    @Override
    public List<TacGia> getAll() {
        return tacGiaRepository.findAll();
    }

    @Override
    public TacGia getOne(Integer id) {
        return tacGiaRepository.findById(id).get();
    }

    @Override
    public TacGia create(TacGia tacGia) {
        return tacGiaRepository.save(tacGia);
    }

    @Override
    public TacGia update(TacGia tacGia) {
        return tacGiaRepository.save(tacGia);
    }

    @Override
    public void delete(Integer id) {
        tacGiaRepository.deleteById(id);
    }
}
