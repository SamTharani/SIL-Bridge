package org.sil.bridge.service;

import org.sil.bridge.dao.StudentDao;
import org.sil.bridge.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Transactional
    public List listStudent() {
        return studentDao.listStudent();
    }

    @Transactional
    public void removeStudent(Integer id) {
        studentDao.removeStudent(id);
    }
}
