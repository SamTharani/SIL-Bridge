package org.sil.bridge.dao;


import org.sil.bridge.model.Industry;

import java.util.List;

public interface IndustryDao {
    public void addIndustry(Industry industry);

    public List listIndustry();

    public void removeIndustry(Integer id);
}
