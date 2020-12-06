package com.enigma.api.controller;

import com.enigma.api.entity.Major;
import com.enigma.api.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MajorController {
    @Autowired
    MajorService majorService;

    @GetMapping("/majors")
    public List<Major> getMajors(){
        return majorService.getMajor();
    }

    @PostMapping("/major")
    public void addMajor(@RequestBody Major major){
        majorService.saveMajor(major);
    }

    @PutMapping("/major")
    public void updateMajor(@RequestBody Major major){
        majorService.updateMajor(major);
    }

    @GetMapping("/major/{id}")
    public Major getMajorById(@PathVariable String id){
        return majorService.getMajorById(id);
    }


    @DeleteMapping("/major")
    public void deleteMajor(@RequestParam(name = "id")String id){
        majorService.deleteMajorById(id);
    }
}
