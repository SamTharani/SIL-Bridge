package org.sil.bridge.dao;

import org.hibernate.SessionFactory;
import org.sil.bridge.model.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LecturerDaoImpl implements LecturerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addLecturer(Lecturer lecturer) {
        sessionFactory.getCurrentSession().save(lecturer);
    }

    @Override
    public List listLecturer() {
        return sessionFactory.getCurrentSession().createQuery("from Lecturer").list();
    }

    @Override
    public void removeLecturer(Integer id) {
        Lecturer lecturer = (Lecturer) sessionFactory.getCurrentSession().load(
                Lecturer.class, id);
        if (null != lecturer) {
            sessionFactory.getCurrentSession().delete(lecturer);

    }
    }
}
