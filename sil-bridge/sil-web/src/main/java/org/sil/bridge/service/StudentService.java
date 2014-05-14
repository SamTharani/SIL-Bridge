package org.sil.bridge.service;


import org.sil.bridge.model.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student);

    public List listStudent();

    public void removeStudent(Integer id);
}

