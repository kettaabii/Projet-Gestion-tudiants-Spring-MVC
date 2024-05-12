package com.service;
import com.exception.ResourceNotFoundException;
import com.modals.Students;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepo;

    @Transactional
    public List<Students> getAllStudents() {
        return studentRepo.findAll();
    }

    @Transactional
    public void addStudent(Students student) {
        studentRepo.save(student);
    }

    @Transactional
    public Students getStudentById(String id) throws ResourceNotFoundException {
        return studentRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }

    @Transactional
    public void deleteStudentByStudentId(String id) {
        studentRepo.deleteById(id);
    }


//    @Override
//    @Transactional
//    public String toString() {
//        return "StudentServiceImp [studentRepo=" + studentRepo + "]";
//    }
//    @Override
//    @Transactional
//    public List<Students> getAllStudents() {
//        return studentRepo.findAll();
//    }
//    @Override
//    @Transactional
//    public Students getStudentById(int studentId) {
//        return studentRepo.getOne(String.valueOf(studentId));
//    }
//    @Override
//    @Transactional
//    public void addStudent(Students student) {
//        studentRepo.save(student);
//    }
//    @Override
//    @Transactional
//    public void updateStudent(Students student) {
//        studentRepo.save(student);
//    }
//    @Override
//    @Transactional
//    public void deleteAllStudents() {
//        studentRepo.deleteAll();
//    }
//    @Override
//    @Transactional
//    public Students findByStudentName(String studentName) {
//        return studentRepo.getOne(studentName);
//    }
//    @Override
//    @Transactional
//    public void deleteStudentByStudentName(String studentName) {
//        studentRepo.delete(studentRepo.getOne(studentName));
//    }
//    @Override
//    @Transactional
//    public void deleteStudentByStudentId(int studentId) {
//        studentRepo.deleteById(String.valueOf(studentId));
//    }
//    @Override
//    @Transactional
//    public List<Students> getStudentsByName(String studentName) {
//       return studentRepo.findAll();
//
//    }


}
