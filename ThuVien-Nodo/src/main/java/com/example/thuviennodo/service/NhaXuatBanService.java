package com.example.thuviennodo.service;

import com.example.thuviennodo.entities.NhaXuatBan;

import java.util.List;

public interface NhaXuatBanService {
    List<NhaXuatBan> getAll();

    NhaXuatBan getOne(Integer id);

    NhaXuatBan create(NhaXuatBan nhaXuatBan);

    NhaXuatBan update(NhaXuatBan nhaXuatBan);

    void delete(Integer id);
}
