package com.example.thuviennodo.controller;

import com.example.thuviennodo.entities.Sach;
import com.example.thuviennodo.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/rest/sach")
public class SachRestController {
    @Autowired
    SachService sachService;

    @GetMapping()
    public List<Sach> getAll() {
        return sachService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Sach getOne(@PathVariable("id") Integer id) {
        return sachService.getOne(id);
    }

    @PostMapping()
    public Sach create(@RequestBody Sach sach) {
        return sachService.create(sach);
    }

    @PutMapping(value = "/{id}")
    public Sach update(@PathVariable("id") Integer id, @RequestBody Sach sach) {
        return sachService.update(sach);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        sachService.delete(id);
    }
}
