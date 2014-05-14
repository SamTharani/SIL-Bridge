package org.sil.bridge.dao;


import org.sil.bridge.model.Student;

import java.util.List;

public interface StudentDao {

    public void addStudent(Student student);

    public List listStudent();

    public void removeStudent(Integer id);
}
