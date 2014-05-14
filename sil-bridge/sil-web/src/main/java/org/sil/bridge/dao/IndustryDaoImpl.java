package org.sil.bridge.dao;


import org.hibernate.SessionFactory;
import org.sil.bridge.model.Industry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class IndustryDaoImpl implements IndustryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addIndustry(Industry industry) {
        sessionFactory.getCurrentSession().save(industry);
    }

    @Override
    public List listIndustry() {
        return sessionFactory.getCurrentSession().createQuery("from Industry").list();
    }

    @Override
    public void removeIndustry(Integer id) {
        Industry industry = (Industry) sessionFactory.getCurrentSession().load(
                Industry.class, id);
        if (null != industry) {
            sessionFactory.getCurrentSession().delete(industry);
    }
    }
}
