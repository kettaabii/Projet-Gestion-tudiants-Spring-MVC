package com.service;
import com.exception.ResourceNotFoundException;
import com.modals.Students;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public List<Students> getAllStudents();

    public void addStudent(Students student);

    public Students getStudentById(String id) throws ResourceNotFoundException;

    public void deleteStudentByStudentId(String id);

//    Students getStudentById(int studentId);
//    Students findByStudentName (String studentName);
//    void addStudent(Students student);
//
//    List<Students> getStudentsByName(String StudentName);
//    List<Students> getAllStudents();
//    void deleteStudentByStudentId(int studentId);
//    void deleteStudentByStudentName(String studentName);
//    void deleteAllStudents();
//    void updateStudent(Students student);

}

