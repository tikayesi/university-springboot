package com.enigma.api.service;

import com.enigma.api.entity.Major;
import com.enigma.api.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorRepository majorRepository;

    @Override
    public void saveMajor(Major major) {
        majorRepository.save(major);
    }

    @Override
    public Major getMajorById(String id) {
        return majorRepository.findById(id).get();
    }


    @Override
    public List<Major> getMajor() {
        return majorRepository.findAll();
    }

    @Override
    public void deleteMajorById(String id) {
        majorRepository.deleteById(id);
    }

    @Override
    public void updateMajor(Major major) {
        majorRepository.save(major);
    }
}
