package org.sil.bridge.service;


import org.sil.bridge.model.Industry;

import java.util.List;

public interface IndustryService {
    public void addIndustry(Industry industry);

    public List listIndustry();

    public void removeIndustry(Integer id);
}
