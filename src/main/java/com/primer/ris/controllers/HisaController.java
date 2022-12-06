package com.primer.ris.controllers;

import com.primer.ris.dao.HisaRepository;
import com.primer.ris.models.Hisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hise")
public class HisaController {

    @Autowired
    private HisaRepository hisaDao;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping
    public Iterable<Hisa> vrniHise(){
        return hisaDao.findAll();
    }

    @PostMapping
    public Hisa dodajHiso(@RequestBody Hisa hisa){
        return hisaDao.save(hisa);
    }

    @GetMapping("/velikost-sob/{velikost}")
    public Iterable<Hisa> vrniHisePoVelikostiSob(@PathVariable(name = "velikost") double velikost){
        return hisaDao.vrniHisePoVelikostiSob(velikost);
    }
}
