package com.enigma.api.service;

import com.enigma.api.entity.Major;

import java.util.List;
import java.util.Optional;

public interface MajorService {
    public void saveMajor(Major major);
    public Major getMajorById(String id);
    public List<Major> getMajor();
    public void deleteMajorById(String id);
    public void updateMajor(Major major);
}
