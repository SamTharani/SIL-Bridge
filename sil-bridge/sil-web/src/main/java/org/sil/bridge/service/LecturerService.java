package org.sil.bridge.service;


import org.sil.bridge.model.Lecturer;

import java.util.List;

public interface LecturerService {
    public void addLecturer(Lecturer lecturer);

    public List listLecturer();

    public void removeLecturer(Integer id);
}
