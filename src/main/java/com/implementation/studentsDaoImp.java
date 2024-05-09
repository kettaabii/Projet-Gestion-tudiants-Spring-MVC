package com.implementation;

import com.interfaces.StudentsDao;
import com.modals.Students;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class studentsDaoImp implements StudentsDao {
    List<Students> students;
    @Override
    public void AddStudent(Students student) {
        students.add(student);
    }
    @Override
    public void UpdateStudent(Students student) {

    }
    @Override
    public List<Students> GetAllStudents() {

        return students;
    }

}
