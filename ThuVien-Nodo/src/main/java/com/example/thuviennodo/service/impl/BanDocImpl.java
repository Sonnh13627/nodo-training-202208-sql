package com.example.thuviennodo.service.impl;

import com.example.thuviennodo.entities.BanDoc;
import com.example.thuviennodo.repositories.BanDocrepository;
import com.example.thuviennodo.service.BanDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component("banDocService")
public class BanDocImpl implements BanDocService {
    @Autowired
    BanDocrepository banDocrepository;

    @Override
    public List<BanDoc> getAll() {
        return banDocrepository.findAll();
    }

    @Override
    public BanDoc getOne(Integer id) {
        return banDocrepository.findById(id).get();
    }

    @Override
    public BanDoc create(BanDoc banDoc) {
        return banDocrepository.save(banDoc);
    }

    @Override
    public BanDoc update(BanDoc banDoc) {
        return banDocrepository.save(banDoc);
    }

    @Override
    public void delete(Integer id) {
        banDocrepository.deleteById(id);
    }
}
