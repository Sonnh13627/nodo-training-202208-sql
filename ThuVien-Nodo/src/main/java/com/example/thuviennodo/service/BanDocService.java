package com.example.thuviennodo.service;

import com.example.thuviennodo.entities.BanDoc;

import java.util.List;

public interface BanDocService {
    List<BanDoc> getAll();

    BanDoc getOne(Integer id);

    BanDoc create(BanDoc banDoc);

    BanDoc update(BanDoc banDoc);

    void delete(Integer id);

}
