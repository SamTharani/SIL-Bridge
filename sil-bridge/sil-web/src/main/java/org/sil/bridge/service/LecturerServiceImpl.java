package org.sil.bridge.service;


import org.sil.bridge.dao.LecturerDao;
import org.sil.bridge.model.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    private LecturerDao lecturerDao;

    @Transactional
    public void addLecturer(Lecturer lecturer) {
        lecturerDao.addLecturer(lecturer);
    }

    @Transactional
    public List listLecturer() {
        return lecturerDao.listLecturer();
    }

    @Transactional
    public void removeLecturer(Integer id) {
        lecturerDao.removeLecturer(id);
    }
}
