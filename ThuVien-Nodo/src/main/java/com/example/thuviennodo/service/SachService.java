package com.example.thuviennodo.service;

import com.example.thuviennodo.entities.Sach;

import java.util.List;
public interface SachService {
    List<Sach> getAll();
    Sach getOne(Integer id);

    Sach create(Sach sach);

    Sach update(Sach sach);

    void delete(Integer id);

}
