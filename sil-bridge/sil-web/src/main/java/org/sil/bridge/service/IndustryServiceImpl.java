package org.sil.bridge.service;


import org.sil.bridge.dao.IndustryDao;
import org.sil.bridge.model.Industry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class IndustryServiceImpl implements IndustryService {

    @Autowired
    private IndustryDao industryDao;

    @Transactional
    public void addIndustry(Industry industry) {
        industryDao.addIndustry(industry);
    }

    @Transactional
    public List listIndustry() {
        return industryDao.listIndustry();
    }

    @Transactional
    public void removeIndustry(Integer id) {
        industryDao.removeIndustry(id);
    }
}
