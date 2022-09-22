package com.example.thuviennodo.controller;

import com.example.thuviennodo.entities.BanDoc;
import com.example.thuviennodo.entities.MuonSach;
import com.example.thuviennodo.service.BanDocService;
import com.example.thuviennodo.service.MuonSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/rest/muonsach")
public class MuonSachRestController {
    @Autowired
    MuonSachService muonSachService;


    @GetMapping()
    public List<MuonSach> getAll() {
        return muonSachService.getAll();
    }

    @GetMapping(value = "/{id}")
    public MuonSach getOne(@PathVariable("id") Integer id) {
        return muonSachService.getOne(id);
    }

    @PostMapping()
    public MuonSach create(@RequestBody MuonSach muonSach) {
        return muonSachService.create(muonSach);
    }

    @PutMapping(value = "/{id}")
    public MuonSach update(@PathVariable("id") Integer id, @RequestBody MuonSach muonSach) {
        return muonSachService.update(muonSach);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        muonSachService.delete(id);
    }
}
