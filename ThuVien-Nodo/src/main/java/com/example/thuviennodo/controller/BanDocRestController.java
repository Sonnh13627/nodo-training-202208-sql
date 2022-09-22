package com.example.thuviennodo.controller;

import com.example.thuviennodo.entities.BanDoc;
import com.example.thuviennodo.repositories.BanDocrepository;
import com.example.thuviennodo.service.BanDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/rest/bandoc")
public class BanDocRestController {
    @Autowired
    BanDocService banDocService;


    @GetMapping()
    public List<BanDoc> getAll() {
        return banDocService.getAll();
    }

    @GetMapping(value = "/{id}")
    public BanDoc getOne(@PathVariable("id") Integer id) {
        return banDocService.getOne(id);
    }

    @PostMapping()
    public BanDoc create(@RequestBody BanDoc banDoc) {
        return banDocService.create(banDoc);
    }

    @PutMapping(value = "/{id}")
    public BanDoc update(@PathVariable("id") Integer id, @RequestBody BanDoc banDoc) {
        return banDocService.update(banDoc);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        banDocService.delete(id);
    }
}
