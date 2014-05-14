package org.sil.bridge.dao;

import org.hibernate.SessionFactory;
import org.sil.bridge.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Override
    public List listStudent() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();

    }

    @Override
    public void removeStudent(Integer id) {
        Student student = (Student) sessionFactory.getCurrentSession().load(
                Student.class, id);
        if (null != student) {
            sessionFactory.getCurrentSession().delete(student);
        }
    }
}
