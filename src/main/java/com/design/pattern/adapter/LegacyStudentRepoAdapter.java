package com.design.pattern.adapter;

import com.design.pattern.model.Student;

public class LegacyStudentRepoAdapter implements StudentRepositoryInterface {
    private LegacyStudentRepo legacyStudentRepo;

    public LegacyStudentRepoAdapter() {
        legacyStudentRepo = LegacyStudentRepo.getInstance();
    }

    @Override
    public Student findStudentById(Integer id) {
        String record = legacyStudentRepo.findStudentRecord(id);
        if(record != null){
            String[] parts = record.split(";");
            return new Student(Integer.parseInt(parts[0]), parts[1], parts[2]);
        } else {
            return null;
        }
    }
}
