package com.example.thuviennodo.service;

import com.example.thuviennodo.entities.TacGia;

import java.util.List;

public interface TacGiaService {
    List<TacGia> getAll();

    TacGia getOne(Integer id);

    TacGia create(TacGia tacGia);

    TacGia update(TacGia tacGia);

    void delete(Integer id);
}
