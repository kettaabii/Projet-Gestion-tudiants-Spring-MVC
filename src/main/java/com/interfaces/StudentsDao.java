package com.interfaces;

import com.modals.Students;

import java.util.List;

public interface StudentsDao {

    void AddStudent(Students student);

    void UpdateStudent(Students student);

    List<Students> GetAllStudents();
}
