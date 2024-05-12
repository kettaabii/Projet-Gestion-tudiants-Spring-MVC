package com.Controller;


import com.exception.ResourceNotFoundException;
import com.modals.Students;
import com.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

    private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model theModel) {
        List<Students> studentList = studentService.getAllStudents();
        theModel.addAttribute("students", studentList);
        return "StudentList";
    }
    @GetMapping("/")
    public String index(Model theModel) {
        List<Students> studentList = studentService.getAllStudents();
        return "dashboard";
    }

    @GetMapping("/addStudent")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show StudentForm handler method");
        Students student = new Students();
        theModel.addAttribute("student", student);
        return "StudentForm";
    }

    @PostMapping("/save-student")
    public String saveStudent(@ModelAttribute("student") Students student) {
        System.out.println(student.getEmail());
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/update-student")
    public String showFormForUpdate(@RequestParam("studentId") String Id,
                                    Model theModel) throws ResourceNotFoundException {
        Students student = studentService.getStudentById(Id);
        theModel.addAttribute("student", student);
        return "UpdateForm";
    }

    @GetMapping("/remove-student")
    public String deleteStudent(@RequestParam("studentId") String Id){
        studentService.deleteStudentByStudentId(Id);
        return "redirect:/students";
    }

}