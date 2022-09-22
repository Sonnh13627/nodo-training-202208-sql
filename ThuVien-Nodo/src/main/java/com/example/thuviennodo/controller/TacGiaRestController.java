package com.example.thuviennodo.controller;

import com.example.thuviennodo.entities.TacGia;
import com.example.thuviennodo.service.TacGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/rest/tacgia")
public class TacGiaRestController {
    @Autowired
    TacGiaService tacGiaService;


    @GetMapping()
    public List<TacGia> getAll() {
        return tacGiaService.getAll();
    }

    @GetMapping(value = "/{id}")
    public TacGia getOne(@PathVariable("id") Integer id) {
        return tacGiaService.getOne(id);
    }

    @PostMapping()
    public TacGia create(@RequestBody TacGia tacGia) {
        return tacGiaService.create(tacGia);
    }

    @PutMapping(value = "/{id}")
    public TacGia update(@PathVariable("id") Integer id, @RequestBody TacGia tacGia) {
        return tacGiaService.update(tacGia);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        tacGiaService.delete(id);
    }

}
