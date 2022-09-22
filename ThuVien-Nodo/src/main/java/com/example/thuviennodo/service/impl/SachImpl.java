package com.example.thuviennodo.service.impl;

import com.example.thuviennodo.entities.Sach;
import com.example.thuviennodo.repositories.SachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.thuviennodo.service.SachService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("sachService")
public class SachImpl implements SachService {
    @Autowired
    SachRepository sachRepository;

    @Override
    public List<Sach> getAll() {
        return sachRepository.findAll();
    }

    @Override
    public Sach getOne(Integer id) {
        return sachRepository.findById(id).get();
    }

    @Override
    public Sach create(Sach sach) {
        return sachRepository.save(sach);
    }

    @Override
    public Sach update(Sach sach) {
        return sachRepository.save(sach);
    }

    @Override
    public void delete(Integer id) {
        sachRepository.deleteById(id);
    }
}
