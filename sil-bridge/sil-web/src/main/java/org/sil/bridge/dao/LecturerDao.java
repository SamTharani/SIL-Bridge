package org.sil.bridge.dao;


import org.sil.bridge.model.Lecturer;

import java.util.List;

public interface LecturerDao {

    public void addLecturer(Lecturer lecturer);

    public List listLecturer();

    public void removeLecturer(Integer id);
}
