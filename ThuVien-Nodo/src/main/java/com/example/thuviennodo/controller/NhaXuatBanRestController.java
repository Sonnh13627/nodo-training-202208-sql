package com.example.thuviennodo.controller;

import com.example.thuviennodo.entities.NhaXuatBan;
import com.example.thuviennodo.service.NhaXuatBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/rest/nhaxuatban")
public class NhaXuatBanRestController {
    @Autowired
    NhaXuatBanService nhaXuatBanService;


    @GetMapping()
    public List<NhaXuatBan> getAll() {
        return nhaXuatBanService.getAll();
    }

    @GetMapping(value = "/{id}")
    public NhaXuatBan getOne(@PathVariable("id") Integer id) {
        return nhaXuatBanService.getOne(id);
    }

    @PostMapping()
    public NhaXuatBan create(@RequestBody NhaXuatBan nhaXuatBan) {
        return nhaXuatBanService.create(nhaXuatBan);
    }

    @PutMapping(value = "/{id}")
    public NhaXuatBan update(@PathVariable("id") Integer id, @RequestBody NhaXuatBan nhaXuatBan) {
        return nhaXuatBanService.update(nhaXuatBan);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        nhaXuatBanService.delete(id);
    }
}
